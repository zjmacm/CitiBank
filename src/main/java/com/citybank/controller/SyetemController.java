package com.citybank.controller;

import com.citybank.dao.SimpleDao;
import com.citybank.dao.impl.MySQLSimpleDaoImpl;
import org.hibernate.validator.spi.valuehandling.ValidatedValueUnwrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.java2d.pipe.SpanShapeRenderer;

import javax.naming.SizeLimitExceededException;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/7/12.
 */

@Controller
public class SyetemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

}
