package com.citibank.controller;

import com.citibank.service.VisitorService;
import com.citibank.service.impl.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;


/**
 * Created by zjm on 2015/7/12.
 */

@Controller("SystemController")
public class SystemController {

    @Autowired
    private VisitorService visitorService;
    private UploadFileService uploadFile;
    private final static String IMG_DESC_PATH =File.separator+"uploads"+File.separator;
    @RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
    public
    @ResponseBody
    String uploadFile(@RequestParam("fileUpload") CommonsMultipartFile multipartFile
    ,HttpServletRequest request) {
        //得到target/CitiBankBg/下的uploads文件夹
        String path = request.getSession().getServletContext().getRealPath("")+IMG_DESC_PATH;
        uploadFile.uploadFile(multipartFile,path);
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

    @RequestMapping("/")
    public String homePage(HttpServletRequest request,HttpSession session) {
        return "redirect:/customer/index";
    }
}
