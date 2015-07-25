package com.citibank.controller;

import com.citibank.common.uploadFile;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Map;

/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;


    public uploadFile uploadImage = new uploadFile();

    private final static String IMG_DESC_PATH = File.separator+"uploads";

    @RequestMapping(value="/testUpload",method = RequestMethod.POST)
    public void test(@RequestParam("fileUpload") CommonsMultipartFile multipartFile,HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath(IMG_DESC_PATH)+File.separator;
        uploadImage.uploadFile(multipartFile,path);
    }

}
