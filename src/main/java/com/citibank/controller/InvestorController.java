package com.citibank.controller;

import com.citibank.common.IdUtil;
import com.citibank.dao.Page;
import com.citibank.mail.MailSender;
import com.citibank.service.*;
import com.citibank.service.impl.MessageServiceImpl;
import com.citibank.service.impl.UploadFileService;
import com.citibank.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by liuhao on 15-7-14.
 */
@Controller("InvestorController")
@RequestMapping("/investor")
public class InvestorController {

    @Autowired
    private InvestorService investorService;

    @Autowired
    private UploadFileService uploadFileService;

    @Autowired
    private AttentionService attentionService;

    @Autowired
    private MessageService messageService;

    @Autowired
    private ReportService reportService;

    private final static String IMG_DESC_PATH = Constant.uploadPath;

    //投资者模式已登陆首页
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexPage(Map<String, Object> map) {
        List<Map<String, Object>> policy = reportService.getInformation(7);
        List<Map<String, Object>> market = reportService.getInformation(8);
        map.put("policy", policy);
        map.put("market", market);
        return "investor/logined-invest-index";
    }

    //我的关注
    @RequestMapping(value = "/ifollow.htm", method = RequestMethod.GET)
    public String getIfollowPage(@RequestParam(value = "column", required = false, defaultValue = "id") String column,
                                 @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                                 HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("userId");
        Page results = attentionService.getMyAttentionByInvestorId(userId, 1, column, queryContent);
        map.put("attention", results.getList());
        return "investor/personal-attiontion";
    }

    //系统消息
    @RequestMapping(value = "/inews.htm", method = RequestMethod.GET)
    public String getInewsPage(@RequestParam(value = "pageIndex", required = false, defaultValue = "1")int pageIndex,
                               @RequestParam(value = "queryContent", required = false, defaultValue = "")String queryContent,
                               Map<String,Object> map) {
        //返回系统消息,首先得获取公司id.
        Page page = messageService.getSystemMessage(1, queryContent);//1代表投资者
        List<Map<String, Object>> results = page.getList();
        map.put("system_message", results);
        return "investor/private-center-my-news";
    }

    //资料管理
    @RequestMapping(value = "/isource", method = RequestMethod.GET)
    public String getIsourcePage(HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("userId");
        Map<String, Object> userInfo = investorService.getInvestorInfo(userId);
        userInfo.put("logoPath", "/uploads/" + userInfo.get("logoPath"));
        map.put("userInfo", userInfo);
        return "investor/personal_center_assets_management";
    }

    //退出按钮
    @RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
    public String getLogoutPage() {
        return "visitor/login";
    }


    @RequestMapping(value = "/login.htm", method = RequestMethod.GET)
    public String getLoginPage() {
        return "investor/investorLogin";
    }

    //跳转注册界面
    @RequestMapping(value = "/register.htm", method = RequestMethod.GET)
    public String getRegisterPage() {
        return "investor/investorRegister";
    }

    //注册
    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String doRegister(@RequestParam Map<String, Object> regs) {
        regs.put("id", IdUtil.uuid());
        Map<String, Object> map = new HashMap<String, Object>();
        map = investorService.registerInvestor(regs);
        String result = map.get("result").toString();
        if (result.equals("failed")) {
            return "investor/investorRegister";
        } else {
            MailSender.sendMail(regs.get("username").toString(), "恭喜您成功注册!");
            return "investor/completeInfo";
        }
    }

    //完善信息
    @RequestMapping(value = "/doCompleteInfo", method = RequestMethod.POST)
    public String completeInfo(@RequestParam Map<String, Object> infos, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        String result = investorService.completeInfo(infos, userId);
        if (result.equals("failed")) {
            return "investor/completeInfo";
        } else {
            return "investor/logined-invest-index";
        }
    }

    @RequestMapping(value = "/completeInfo.htm", method = RequestMethod.GET)
    public String getCompleteInfoPage() {
        return "investor/completeInfo";
    }

    //保存用户信息
    @RequestMapping(value = "/saveUserInfo", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, String> saveUserInfo(@RequestParam Map<String, Object> parms, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        int result = investorService.saveInvestorInfo(parms, userId);
        Map<String, String> status = new HashMap<String, String>();
        if (result == 0) {
            status.put("result", "failed");
        } else {
            status.put("result", "success");
        }
        return status;
    }

    //第二个页面的下一步
    @RequestMapping(value = "/nextstep", method = RequestMethod.POST)
    public String getNextStepPage(@RequestParam("logoPath") CommonsMultipartFile multipartFile, @RequestParam Map<String, Object> reqs, HttpSession session,
                                  HttpServletRequest request) {
        String id = (String) session.getAttribute("investorId");
        String phoneNum = reqs.remove("firstNum").toString() + reqs.remove("secondNum").toString();
        reqs.put("consultPhone", phoneNum);
        String path = request.getSession().getServletContext().getRealPath("") + IMG_DESC_PATH;

        reqs.put("logoPath", uploadFileService.uploadFile(multipartFile, path));
        investorService.saveInvestorInfo(reqs, id);
        return "/investor/finsh-reg";
    }


}
