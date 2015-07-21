package com.citibank.controller;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public @ResponseBody
    int index(){
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("inTime", new Date());
//        mySQLSimpleDao.create("person",map);
        String sql="select * from PERSON where id = 1";
        List<Map<String, Object>> result = mySQLSimpleDao.queryForList(sql, new HashMap<String, Objects>());
        Date date= (Date) result.get(0).get("in_time");
        return date.getMonth();
    }
}
