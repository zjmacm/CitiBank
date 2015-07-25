package com.citibank.controller;

import com.citibank.mail.MailSender;
import com.citibank.service.CompanyService;
import com.citibank.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
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
    private FinanceService financeService;

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
                session.setAttribute("userId", user.get("companyId"));
                session.setAttribute("userType", 0);
            } else {
                model.addObject("result", "failed");
            }
        }
        return model;
    }

    @RequestMapping(value = "/getUserInfo.htm", method = RequestMethod.GET)
    public String getUserInfo(HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("userId");
        map.putAll(companyService.getCompanyInfo(userId));
        return "common/userInfo";
    }

    @RequestMapping(value = "/saveUserInfo", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, String> saveUserInfo(@RequestParam Map<String, Object> parms, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
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
        String userId = (String) session.getAttribute("userId");
        params.put("companyId", userId);
        Map<String, Object> result = financeService.saveFinance(params);
        return result;
    }

}
