package com.citibank.common;

import org.springframework.context.ApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URL;
import java.util.Map;
import java.util.UUID;

/**
 * Created by zjm on 2015/7/25.
 */
public class uploadFile {
    private final static String IMG_DESC_PATH =File.separator+"uploads";


    public void test(CommonsMultipartFile commonsMultipartFile){

    }



    public String uploadFile(CommonsMultipartFile multipartFile, String path){

        String result = "success";

        String filePath = createUri(multipartFile, path);

        File file = new File(filePath);

        try{
            multipartFile.transferTo(file);
        }catch(Exception e){
            result = "failed";
            e.printStackTrace();
        }
        return result;
    }


    /**
     * 为图片产生uri 返回给前端
     * @param file
     * @return
     */


    public static String createUri(MultipartFile file,String path){

//        String imgPath = request.getSession().getServletContext().getRealPath(IMG_DESC_PATH)+File.separator;
        String fileName = file.getOriginalFilename();
        String extName = fileName.substring(fileName.lastIndexOf("."));
        String newName = IdUtil.uuid()+extName;
        return path+newName;
    }



}
