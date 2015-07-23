package com.citibank.controller;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.impl.SystemMessageServiceImpl;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;
    @Autowired
    private SystemMessageServiceImpl systemMessageService;

    public SystemController()
    {
        systemMessageService = new SystemMessageServiceImpl();
    }
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public @ResponseBody
    Map<String,Object> index(String name,String password)
    {
        ModelAndView mav = new ModelAndView("/index");
        System.out.println("adminInfo:" + name + "," + password);
        mav.addObject("result","ssss");
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("result","ssss");
        return map;
    }
}
