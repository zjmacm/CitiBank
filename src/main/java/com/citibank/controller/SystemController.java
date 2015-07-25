package com.citibank.controller;

import com.citibank.common.uploadFile;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import net.sf.ehcache.transaction.xa.EhcacheXAException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Map;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;


/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;


    public uploadFile uploadImage = new uploadFile();

    private final static String IMG_DESC_PATH = File.separator+"uploads"+File.separator;

    @RequestMapping(value="/fileUpload1",method = RequestMethod.POST)
    public void test(@RequestParam("fileUpload") CommonsMultipartFile multipartFile,HttpServletRequest request){
        String path = request.getServletContext().getRealPath("")+IMG_DESC_PATH;
        System.out.println(path);
        uploadImage.uploadFile(multipartFile,path);

    }

    @RequestMapping(value = "/fileUpload",method = RequestMethod.POST)
    public @ResponseBody String uploadFile(@RequestParam("fileUpload")CommonsMultipartFile multipartFile){
        System.out.println(multipartFile.getOriginalFilename());
        System.out.println(multipartFile.getSize());
        System.out.println(multipartFile.getContentType());
        try {
            multipartFile.transferTo(new File("/file/image.png"));
        } catch (IOException e) {
            System.out.println("文件上传失败");
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/uploadPage")
    public String getUploadPage(){
        return "main/index";
    }

}
