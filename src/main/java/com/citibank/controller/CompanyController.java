package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.mail.MailSender;
import com.citibank.service.*;
import com.citibank.service.impl.UploadFileService;
import com.citibank.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by zjm on 2015/7/13.
 */
@Controller("CompanyController")
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private UploadFileService uploadFileService;

    @Autowired
    private FinanceService financeService;

    @Autowired
    private SystemMessageService systemMessageService;

    @Autowired
    private AppointService appointService;

    @Autowired
    private AttentionService attentionService;

    private final static String IMG_DESC_PATH = Constant.uploadPath;

    //企业模式已登陆首页
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String getIndexPage() {
        return "company/logined-business-index";
    }

    //我的关注
    @RequestMapping(value = "/ifollow.htm", method = RequestMethod.GET)
    public String getIfollowPage(Map<String,Object> map)
    {
        Map<String,Object> map0 = new HashMap<String, Object>();
        map0.put("companyId", "a");//公司id
        map0.put("pageIndex",1);//起始位置
        Page results = attentionService.getMyAttentionByCompanyId(map0);
        map.put("myAttention_message",results.getList());
        return "company/personal-attiontion";
    }

    //查看更多投资人
    @RequestMapping(value = "/more_investor.htm", method = RequestMethod.GET)
    public String getMore_investorPage() {
        return "company/user-corporate-mode-finance-patch";
    }

    //我的消息
    @RequestMapping(value = "/inews.htm", method = RequestMethod.GET)
    public String getInewsPage(Map<String,Object> map)
    {
        //返回系统消息,首先得获取公司id.
        Map<String,Object> map0 = new HashMap<String, Object>();
        map0.put("companyId","a");//公司id;
        map0.put("pageIndex",1);//数据起始位置
        Page page = systemMessageService.getMessageById(map0,0);//0代表企业
        List<Map<String,Object>> results = page.getList();
        map.put("system_message",results);
        return "company/private-center-my-news";
    }

    //系统信息
    @RequestMapping(value = "/s_message", method = RequestMethod.GET)
    public String getS_messagePage(Map<String,Object> map)
    {
        Map<String,Object> map0 = new HashMap<String, Object>();
        map0.put("companyId","a");//公司id;
        map0.put("pageIndex",1);//数据起始位置
        Page page = systemMessageService.getMessageById(map0,0);//0代表系统消息
        List<Map<String,Object>> results = page.getList();
        map.put("system_message",results);
        return "company/private-center-my-news";
    }

    //私信
    @RequestMapping(value = "/p_letter", method = RequestMethod.GET)
    public String getP_letterPage() {
        return "company/personal_center_my_message_privately_down";
    }

    //定向披露
    @RequestMapping(value = "/d_disclosure", method = RequestMethod.GET)
    public String getD_disclosurePage() {
        return "company/personal_center_my_message_direction_down";
    }

    //预约管理
    @RequestMapping(value = "/reservation.htm", method = RequestMethod.GET)
    public String getReservationPage(Map<String,Object> map)
    {
        map.put("companyId","a"); //公司id
        map.put("pageIndex",1);//数据起始位置
        map.put("flag",0);//是否已读
        Page page = appointService.getAppoint(map);
        List<Map<String,Object>> results = page.getList();
        map.put("manage_message_current",results);
        return "company/reservation-management-current-reservation";
    }

    //当前预约
    @RequestMapping(value = "/reservation_current.htm", method = RequestMethod.GET)
    public String getReservation_currentPage(Map<String,Object> map)
    {
        map.put("companyId","a"); //公司id
        map.put("pageIndex",1);//数据起始位置
        map.put("flag",0);//是否已读-未读
        Page page = appointService.getAppoint(map);
        List<Map<String,Object>> results = page.getList();
        map.put("manage_message_current",results);
        return "company/reservation-management-current-reservation";
    }

    //已完成预约
    @RequestMapping(value = "/reservation_finish.htm", method = RequestMethod.GET)
    public String getReservation_finishPage(Map<String,Object> map)
    {
        map.put("companyId","a"); //公司id
        map.put("pageIndex",1);//数据起始位置
        map.put("flag",1);//是否已读-已读
        Page page = appointService.getAppoint(map);
        List<Map<String,Object>> results = page.getList();
        map.put("manage_message_finish",results);
        return "company/reservation-management-finished-reservation";
    }

    //资料管理
    @RequestMapping(value = "/isource.htm", method = RequestMethod.GET)
    public String getIsourcePage() {
        return "company/data_management-edit";
    }

    //退出按钮
    @RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
    public String getLogoutPage() {
        return "company/login";
    }


    @RequestMapping(value = "/companyLogin.htm", method = RequestMethod.GET)
    public String getLoginPage() {
        return "company/companyLogin";
    }

    @RequestMapping(value = "/companyRegister.htm", method = RequestMethod.GET)
    public String getRegisterPage() {
        return "company/companyRegister";
    }


    @RequestMapping(value = "/codeCheck", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> confirmCompanyCode(@RequestParam("code") String code) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("company_code", code);
        String result = companyService.confirmCompanyCode(map);
        map.clear();
        map.put("check", result);
        return map;
    }

    @RequestMapping(value = "confirmBussinessLisence", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> confirmBussinessLicense(@RequestParam Map<String, Object> reqs) {
        Map<String, Object> map = new HashMap<String, Object>();
        String result = companyService.confirmBussinessLisence(reqs);
        map.put("check", result);
        return map;
    }

    @RequestMapping(value = "/companyRegister", method = RequestMethod.POST)
    public ModelAndView userRegister(@RequestParam Map<String, Object> reqs) {
        //new一个模型
        ModelAndView model = new ModelAndView();
        String result = companyService.userRegister(reqs).get("result").toString();
        if (result.equals("success")) {
            MailSender.sendMail(reqs.get("username").toString(), "恭喜您注册成功");
        }
        model.addObject("result", result);
        return model;
    }

    @RequestMapping(value = "/companyLogin", method = RequestMethod.POST)
    public ModelAndView userLogin(@RequestParam Map<String, Object> reqs, HttpSession session) {
        ModelAndView model = new ModelAndView();
        if (!reqs.containsKey("username") || !reqs.containsKey("password")) {
            model.addObject("result", "empty");
        } else {
            Map<String, Object> user = new HashMap<String, Object>();
            user = companyService.userLogin(reqs);
            if (user.get("result").toString().equals("success")) {
                model.addObject("result", "success");

                //登陆成功后将companyId加入session中
                session.setAttribute("companyId", user.get("companyId"));
                session.setAttribute("userType", 0);
            } else {
                model.addObject("result", "failed");
            }
        }
        return model;
    }

    @RequestMapping(value = "/getUserInfo.htm", method = RequestMethod.GET)
    public String getUserInfo(HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("companyId");
        map.putAll(companyService.getCompanyInfo(userId));
        return "common/userInfo";
    }

    @RequestMapping(value = "/saveUserInfo", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, String> saveUserInfo(@RequestParam Map<String, Object> parms, HttpSession session) {
        String userId = (String) session.getAttribute("companyId");
        int result = companyService.saveCompanyInfo(parms, userId);
        Map<String, String> status = new HashMap<String, String>();
        if (result == 0) {
            status.put("result", "failed");
        } else {
            status.put("result", "success");
        }
        return status;
    }

    @RequestMapping(value = "/saveFinance", method = RequestMethod.POST)
    public Map<String, Object> saveFinance(@RequestParam Map<String, Object> params,
                                           HttpSession session) {
        String userId = (String) session.getAttribute("companyId");
        params.put("companyId", userId);
        Map<String, Object> result = financeService.saveFinance(params);
        return result;
    }

    @RequestMapping(value = "/nextstep", method = RequestMethod.POST)
    public String saveInfo(@RequestParam("logo") CommonsMultipartFile multipartFile, @RequestParam Map<String, Object> reqs, HttpSession session,
                           HttpServletRequest request) {
        String id = (String) session.getAttribute("companyId");
        String phoneNum = reqs.remove("firstNum").toString() + reqs.remove("secondNum").toString();
        reqs.put("consultPhone", phoneNum);
        String path = request.getSession().getServletContext().getRealPath("") + IMG_DESC_PATH;
        reqs.put("logo", uploadFileService.uploadFile(multipartFile, path));
        companyService.saveCompanyInfo(reqs, id);
        return "/investor/finsh-reg";
    }


}
