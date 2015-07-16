package com.citibank.controller;

import com.citibank.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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
    public ModelAndView confirmEmail(@RequestParam Map<String,Object> reqs){
        ModelAndView model = new ModelAndView();
        String result = companyService.confirmEmail(reqs);
        model.addObject("result", result);
        return model;
    }

    @RequestMapping(value="confirmCompanyName",method = RequestMethod.POST)
    public ModelAndView confirmCompanyName(@RequestParam Map<String,Object> reqs){
        ModelAndView model = new ModelAndView();
        String result = companyService.confirmCompanyName(reqs);
        model.addObject("result",result);
        return model;
    }

    @RequestMapping(value="confirmCompanyCode",method=  RequestMethod.POST)
    public ModelAndView confrimCompanyCode(@RequestParam Map<String,Object> reqs){
        ModelAndView model = new ModelAndView();
        String result = companyService.confirmCompanyCode(reqs);
        model.addObject("result",result);
        return model;
    }

    @RequestMapping(value="confirmBussinessLisence",method= RequestMethod.POST)
    public ModelAndView confirmBussinessLicense(@RequestParam Map<String,Object> reqs){
        ModelAndView model = new ModelAndView();
        String result = companyService.confirmBussinessLisence(reqs);
        model.addObject("result",result);
        return model;
    }

    @RequestMapping(value="/companyRegister",method = RequestMethod.POST)
    public ModelAndView userRegister(@RequestParam Map<String,Object> reqs){
        //new一个模型
        ModelAndView model = new ModelAndView();
        String result = companyService.userRegister(reqs);
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


}
