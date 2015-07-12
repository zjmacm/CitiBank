package com.citybank.controller;

import org.hibernate.validator.spi.valuehandling.ValidatedValueUnwrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller
public class SyetemController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        System.out.println("index");
        return "index";
    }

}
