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

import java.util.*;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    MySQLSimpleDaoImpl mySQLSimpleDao;

    @RequestMapping(value = "/index")
    public @ResponseBody List<Map<String, Object>> index(){
        Map map = new HashMap<String, String>();
        map.put("build", new Date());
        List<Map<String, Object>> results = mySQLSimpleDao.queryForList("select * from createTime", new HashMap<String, Object>());
        return results;
    }

    @RequestMapping(value="/test.htm", method = RequestMethod.GET)
    public void Test(@RequestParam Map<String,Object> reqs){
        Map<String, Object> map=new HashMap<String, Object>();
        Page<Map<String, Object>> page = mySQLSimpleDao.pageQuery("select * from card", map, 1, 10, new Order());
    }

}
