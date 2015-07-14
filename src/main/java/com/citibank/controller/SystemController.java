package com.citibank.controller;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "main/index";
    }






}
