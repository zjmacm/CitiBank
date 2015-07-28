package com.citibank.controller;

import com.citibank.mail.MailSender;
import com.citibank.service.CompanyService;
import com.citibank.service.FinanceService;
import com.citibank.service.impl.UploadFileService;
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

    private final static String IMG_DESC_PATH = File.separator + "uploads" + File.separator;

    //跳转到公司登陆的主页
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String getLoginPage() {
        return "company/logined-business-index";
    }

    //跳转到公司融资板块的界面
    @RequestMapping(value = "/finance.htm", method = RequestMethod.GET)
    public String getFinancePage(){return "company/user-corporate-mode-finance-patch";}

    //融资板块-撮合配对
    @RequestMapping(value = "/management.htm",method=RequestMethod.GET)
    public String getMacthing(){
        return "company/user-corporate-mode-finance-patch";
    }


    //跳转到公司信息发布的界面-中心公告
    @RequestMapping(value= "/invest.htm",method = RequestMethod.GET)
    public String getInformationPage(){return "company/logined-company-issue";}


    //信息发布-信用监管
    @RequestMapping(value="/credit-takeover.htm",method =  RequestMethod.GET)
    public String creditTakeover(){
        return "company/information_Credit_takeover";
    }

    //信息发布-我要发布
    @RequestMapping(value="/message-publish.htm",method = RequestMethod.GET)
    public String getMessagePublishPage(){return "company/message-publish-my-publish";}



    //跳转到公司资产管理的界面-股权管理
    @RequestMapping(value = "/service.htm",method = RequestMethod.GET)
    public String getServicePage(){ return "/company/logined-company-proprety-debat";}

    //资产管理-债权管理

    @RequestMapping(value ="/stock-manag.htm",method = RequestMethod.GET)
    public String getServicedebatPage(){ return "/company/logined-company-proprety";}

    //公司电子签约未完成
    @RequestMapping(value = "/invetfinane.htm",method = RequestMethod.GET)
    public String getSignPage(){
        return "company/undefined-financing-sign";
    }

    //二级目录 融资板块-电子签约-协议查询
    @RequestMapping(value = "/xieyichaxun.htm",method = RequestMethod.GET)
    public String getXieyichaxunPage(){
        return "company/inquiry-protocol-detail";
    }


    //意向发布 私募股权
    @RequestMapping(value = "/esignature.htm",method = RequestMethod.GET)
    public String getInventionPage(){
        return "company/financing-publish";
    }

    //意向发布 私募债
    @RequestMapping(value = "/simuzhai.htm",method =RequestMethod.GET)
    public String getInvention2Page(){
        return "/company/release_privately_raised_bonds";
    }







    //验证验证码
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
