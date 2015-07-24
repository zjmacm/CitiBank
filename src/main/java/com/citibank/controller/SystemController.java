package com.citibank.controller;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView test(HttpServletResponse response) {
        //response.setHeader("Access-Control-Allow-Origin","*");
        ModelAndView modelAndView = new ModelAndView("/name");
        return modelAndView;
    }

}
