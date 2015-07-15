package com.citibank.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public @ResponseBody Map<String, String> index(){
        Map map = new HashMap<String, String>();
        map.put("name", "ssss");
        map.put("school", "ssdut");
        return map;
    }

}
