package com.citibank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
