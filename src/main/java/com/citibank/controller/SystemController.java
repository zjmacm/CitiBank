package com.citibank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public @ResponseBody Map<String, String> index(@RequestHeader Map<String, String> headers){
        System.out.println(headers.toString());
        Map map = new HashMap<String, String>();
        map.put("name", "ssss");
        map.put("school", "ssdut");
        return map;
    }

}
