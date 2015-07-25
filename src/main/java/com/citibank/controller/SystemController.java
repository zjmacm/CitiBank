package com.citibank.controller;

import com.citibank.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;


/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private VisitorService visitorService;


    private final static String IMG_DESC_PATH = File.separator+"uploads"+File.separator;


    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    public
    @ResponseBody
    String uploadFile(@RequestParam("fileUpload") CommonsMultipartFile multipartFile
    ) {
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
   
    @RequestMapping(value ="/customer",method = RequestMethod.GET)
    public String homePage(HttpServletRequest request,HttpSession session) {

        Cookie[] cookies = request.getCookies();
        String username=new String();
        String password=new String();
        if(cookies==null){
            return "/customer/register.htm";
        }
        for (Cookie cookie : cookies) {


            if(cookie.getName().equals("username")){
                username=cookie.getValue();

            }
            if(cookie.getName().equals("password")){
                password=cookie.getValue();
            }
        }
        Map<String, Object> result = visitorService.login(username, password);
        System.out.println(username+"---"+password);
        if(result==null){
            return "visitor/customer-index";
        }
        session.setAttribute("userType",result.get("userType"));
        if(Integer.valueOf(result.get("userType").toString())==0) {
            session.setAttribute("userId", result.get("userId"));
            return "main/index";
        }else{
            session.setAttribute("userId", result.get("userId"));
            return "main/index";
        }
    }

}
