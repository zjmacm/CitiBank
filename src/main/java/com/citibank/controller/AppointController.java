package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
@Controller
@RequestMapping("/appoint")
public class AppointController {

    @Autowired
    private AppointService appointService;

    @RequestMapping("/getAppoint.htm")
    public String getAppoint(@RequestParam(value="isComplete", required = false, defaultValue = "false")boolean isComplete,
                             @RequestParam(value = "pageIndex", required = false, defaultValue = "1")int pageIndex,
                             @RequestParam(value = "columnName",required = false, defaultValue = "id")String columnName,
                             @RequestParam(value = "queryContent", required = false)String queryContent,
                             HttpSession session, Map<String ,Object> model){
//        Page<Map<String, Object>> result = appointService.getAppoint(session.getAttribute("userId").toString(),
//                isComplete, columnName, queryContent, pageIndex, 10);
//        model.put("pageCount", result.getpageCount());
//        model.put("data", result.getList());
        return "common/appoint";
    }

}
