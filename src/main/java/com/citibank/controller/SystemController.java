package com.citibank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> index(){
        Map map = new HashMap<String, String>();
        map.put("name", "ssss");
        map.put("school", "ssdut");
        return map;
    }

    /*@RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(){
        ModelAndView map = new ModelAndView("company/companyLogin");
        return map;
    }*/



    @RequestMapping(value="/test.htm", method = RequestMethod.POST)
    public void Test(@RequestParam Map<String,Object> reqs){
        System.out.println(reqs.get("name")+" "+reqs.get("password"));
    }




}
