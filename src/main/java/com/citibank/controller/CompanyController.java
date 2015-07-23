package com.citibank.controller;

import com.citibank.mail.MailSender;
import com.citibank.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by zjm on 2015/7/13.
 */
@Controller("CompanyController")
public class CompanyController {



    @Autowired
    private CompanyService companyService;

    public CompanyService getCompanyService() {
        return companyService;
    }

    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping(value= "/companyLogin.htm",method = RequestMethod.GET)
    public String getLoginPage(){
        return "company/companyLogin";
    }
    @RequestMapping(value="/companyRegister.htm",method = RequestMethod.GET)
    public String getRegisterPage(){
        return "company/companyRegister";
    }



    @RequestMapping(value="confirmEmail",method=RequestMethod.POST)
    public @ResponseBody Map<String,Object> confirmEmail(@RequestParam Map<String,Object> reqs){
        Map<String,Object> map = new HashMap<String, Object>();
        String result = companyService.confirmEmail(reqs);
        map.put("result", result);
        return map;
    }

    @RequestMapping(value="confirmCompanyName",method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> confirmCompanyName(@RequestParam Map<String,Object> reqs){
        Map<String,Object> map = new HashMap<String, Object>();
        String result = companyService.confirmCompanyName(reqs);
        map.put("result", result);
        return map;
    }

    @RequestMapping(value="confirmCompanyCode",method=  RequestMethod.POST)
    public @ResponseBody Map<String,Object> confrimCompanyCode(@RequestParam Map<String,Object> reqs){
        Map<String,Object> map = new HashMap<String, Object>();
        String result = companyService.confirmCompanyCode(reqs);
        map.put("result", result);
        return map;
    }

    @RequestMapping(value="confirmBussinessLisence",method= RequestMethod.POST)
    public @ResponseBody Map<String,Object> confirmBussinessLicense(@RequestParam Map<String,Object> reqs){
        Map<String,Object> map = new HashMap<String, Object>();
        String result = companyService.confirmBussinessLisence(reqs);
        map.put("result",result);
        return map;
    }

    @RequestMapping(value="/companyRegister",method = RequestMethod.POST)
    public ModelAndView userRegister(@RequestParam Map<String,Object> reqs){
        //new一个模型
        ModelAndView model = new ModelAndView();
        String result = companyService.userRegister(reqs);
        if(result.equals( "success")){
            MailSender.sendMail(reqs.get("username").toString(),"恭喜您注册成功");
        }
        model.addObject("result",result);
        return model;
    }

    @RequestMapping(value="/companyLogin",method = RequestMethod.POST)
    public ModelAndView userLogin(@RequestParam Map<String,Object> reqs,HttpSession session){
        ModelAndView model = new ModelAndView();
        if(!reqs.containsKey("username")||!reqs.containsKey("password")){
            model.addObject("result","empty");
        }
        else{
            Map<String,Object> user = new HashMap<String, Object>();
            user = companyService.userLogin(reqs);
            if(user.get("result").toString().equals("success")){
                model.addObject("result","success");

                //登陆成功后将companyId加入session中
                session.setAttribute("userId",user.get("companyId"));
                session.setAttribute("userType",0);
            }else{
                model.addObject("result","failed");
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



}
