package com.citibank.controller;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller
public class SyetemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String index(){
        return "main/index";
    }

}
