package com.citibank.controller;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public @ResponseBody Map<String, String> index(){
        Map map = new HashMap<String, String>();
        map.put("name", "ssss");
        map.put("school", "ssdut");
        return map;
    }


    @RequestMapping(value="/test")
    public void index1(){
        String sql = "select * from tp_users ";

        Page page = new Page();
        page = mySQLSimpleDao.pageQuery("select *from tp_users",new HashMap<String,Object>(),1,10,new Order());
    }

    @RequestMapping(value="/test2",method=RequestMethod.POST)
    public @ResponseBody
    Map<String,Object> main(){
        Page page = new Page();

        Order order = new Order();
        order.asc("userId");

        page = mySQLSimpleDao.pageQuery("select *form tp_users",new HashMap<String, Object>(),1,10,order);

        System.out.println(page.getList());
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result","success");
        return map;
    }










}
