package com.citibank.common;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.URL;
import java.util.Map;

/**
 * Created by zjm on 2015/7/25.
 */
public class uploadFile {


    public String uploadFile(Map<String,Object> reqs,HttpServletRequest request){
        String result = "success";

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        //得到图片
        MultipartFile multipartFile = multipartRequest.getFile(reqs.get("file").toString());
        //随机生成10000以内的数
        String random = String.valueOf(Math.random()*10000);
        //得到图片后缀名
        String suffix = multipartFile.getOriginalFilename().
                substring(multipartFile.getOriginalFilename().lastIndexOf("."));

        //上传路径
        String filePath = "F://file//"+random+suffix;

        File file = new File(filePath);

        InputStream inputStream = null;
       /* File file=new File("F://images//image1.png");*/
        try{
            /*file.createNewFile();*/

            URL url=new URL(reqs.get("image").toString());
            System.out.println("url: "+url);
            inputStream=url.openConnection().getInputStream();

            //System.out.println(inputStream);
            inputStream = multipartFile.getInputStream();
            byte[] b = new byte[1024];
            FileOutputStream fs = new FileOutputStream(file);
            int len ;
            while((len=inputStream.read(b))!=-1){

                fs.write(b,0,len);
            }

            fs.close();

        }catch(Exception e){
            result = "failed";
            e.printStackTrace();
        }
        return result;
    }



}
