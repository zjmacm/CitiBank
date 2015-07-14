package com.citibank.controller;

import com.citibank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/13.
 */
@Controller("UserController")
public class UserController {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value= "/companyLogin.htm",method = RequestMethod.GET)
    public String getLoginPage(){
        return "user/companyLogin";
    }

    @RequestMapping(value="/companyRegister.htm",method = RequestMethod.GET)
    public String getRegisterPage(){
        return "user/companyRegister";
    }

    @RequestMapping(value="/companyRegister",method = RequestMethod.POST)
    public ModelAndView userRegister(@RequestParam Map<String,Object> reqs){
        //new一个模型
        ModelAndView model = new ModelAndView();
        String result = userService.userRegister(reqs);
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
            user = userService.userLogin(reqs);
            if(user.get("result").toString().equals("success")){
                model.addObject("result","success");
                session.setAttribute("companyId",user.get("companyId"));
                session.setAttribute("username",reqs.get("username"));
            }else{
                model.addObject("result","failed");
            }
        }
        return model;
    }
}
