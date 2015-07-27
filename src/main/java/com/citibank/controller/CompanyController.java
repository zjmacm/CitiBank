package com.citibank.controller;

import com.citibank.entity.Attention;
import com.citibank.mail.MailSender;
import com.citibank.service.CompanyService;
import com.citibank.service.FinanceService;
import com.citibank.service.SystemMessageService;
import com.citibank.service.impl.UploadFileService;
import net.sf.json.JSONArray;
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
    private final static String IMG_DESC_PATH = File.separator + "uploads" + File.separator;

    //企业模式已登陆首页
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String getIndexPage(){return "company/logined-business-index"; }
    //我的关注
    @RequestMapping(value ="/ifollow.htm", method = RequestMethod.GET)
    public String getIfollowPage(){
//        Map<String,Object> map = new HashMap<String, Object>();
//        map.put("companyId","a");
//        attentionService.getAttentionList(map);
        return "company/personal-attiontion";
    }
    //查看更多投资人
    @RequestMapping(value = "/more_investor.htm",method = RequestMethod.GET)
    public String getMore_investorPage(){ return "company/user-corporate-mode-finance-patch";}

    //我的消息
    @RequestMapping(value = "/inews.htm", method = RequestMethod.GET)
    public String getInewsPage(){ return "company/private-center-my-news";}
    //系统信息
    @RequestMapping(value = "/s_message",method = RequestMethod.GET)
    public String getS_messagePage(){
        return "company/private-center-my-news";
    }
    //私信
    @RequestMapping(value = "/p_letter",method = RequestMethod.GET)
    public String getP_letterPage(){ return "";}
    //定向披露
    @RequestMapping(value = "/d_disclosure",method = RequestMethod.GET)
    public String getD_disclosurePage(){ return "";}

    //预约管理
    @RequestMapping(value = "/reservation.htm",method = RequestMethod.GET)
    public String getReservationPage(){ return "company/reservation-management-current-reservation";}
    //当前预约
    @RequestMapping(value = "/reservation_current.htm",method = RequestMethod.GET)
    public String getReservation_currentPage(){ return "company/reservation-management-current-reservation";}
    //已完成预约
    @RequestMapping(value = "/reservation_finish.htm",method = RequestMethod.GET)
    public String getReservation_finishPage(){ return "company/reservation-management-finished-reservation";}

    //资料管理
    @RequestMapping(value ="/isource.htm", method = RequestMethod.GET)
    public String getIsourcePage(){ return "company/data_management-edit";}

    //退出按钮
    @RequestMapping(value = "/logout.htm",method = RequestMethod.GET)
    public String getLogoutPage(){ return "company/login";}



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
    @RequestMapping(value = "/nextstep",method = RequestMethod.POST)
    public String saveInfo(@RequestParam("logo") CommonsMultipartFile multipartFile, @RequestParam Map<String, Object> reqs, HttpSession session,
                           HttpServletRequest request)
    {
        String id = (String) session.getAttribute("companyId");
        String phoneNum = reqs.remove("firstNum").toString() + reqs.remove("secondNum").toString();
        reqs.put("consultPhone", phoneNum);
        String path = request.getSession().getServletContext().getRealPath("") + IMG_DESC_PATH;
        reqs.put("logo", uploadFileService.uploadFile(multipartFile, path));
        companyService.saveCompanyInfo(reqs,id);
        return "/investor/finsh-reg";
    }




}
