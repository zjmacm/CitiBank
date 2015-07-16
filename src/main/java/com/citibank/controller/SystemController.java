package com.citibank.controller;


import com.citibank.dao.SimpleDao;
import com.citibank.service.SystemMessageService;
import com.citibank.service.impl.SystemMessageServiceImpl;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {
    @Autowired
    private SystemMessageService systemMessageService;

    public SystemMessageService getSystemMessageService() {
        return systemMessageService;
    }

    public void setSystemMessageService(SystemMessageService systemMessageService) {
        this.systemMessageService = systemMessageService;
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> index(){
        Map map = new HashMap<String, String>();
        map.put("name", "ssss");
        map.put("school", "ssdut");
        return map;
    }


    @RequestMapping(value="/test", method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> Test(@RequestParam Map<String,Object> reqs){
        System.out.println(reqs.get("username") + " " + reqs.get("password"));
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result", "success");

        Map<String,Object> map0 = new HashMap<String, Object>();
        map0.put("username","qwer");
        List<Map<String,Object>> list;
        list = systemMessageService.getAllMessage();
        System.out.println(list);
        return map;
    }

    @RequestMapping(value = "/index.htm",method = RequestMethod.GET)
    public String getIndexPage()
    {
        return "/main/succ";
    }
    private boolean checkParams(String[] params){
        for(String param:params){
            if(param==""||param==null||param.isEmpty()){
                return false;
            }
        }
        return true;
    }

}
