package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.service.FinancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by zjm on 2015/7/21.
 */
@Controller
@RequestMapping(value = "/financing")
public class FinancingController {

    @Autowired
    private FinancingService financingService;


    //撮合配对

    //撮合配对的页面,也是投资板块的首页
    @RequestMapping(value = "Matching.htm", method = RequestMethod.GET)
    public String getMatchingPage() {
        return "investor/user-corporate-mode-finance-patch";
    }


    @RequestMapping(value = "Matching", method = RequestMethod.POST)
    public String getMatching(@RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
                              @RequestParam(value = "investArea", required = false, defaultValue = "") String investArea,
                              @RequestParam(value = "investIndustry", required = false, defaultValue = "") String investIndustry,
                              @RequestParam(value = "fundBody", required = false, defaultValue = "-1") int fundBody,
                              @RequestParam(value = "lowMoney", required = false, defaultValue = "-1") int lowMoney,
                              @RequestParam(value = "highMoney", required = false, defaultValue = "-1") int highMoney,


                              HttpSession session, Map<String, Object> map) {
        String userId = session.getAttribute("userId").toString();
        int userType = (Integer) session.getAttribute("userType");
        Page<Map<String, Object>> page = financingService.getMatching(userId, userType, pageIndex, investArea, investIndustry, fundBody, lowMoney, highMoney);
        map.put("totalPage", page.getpageCount());
        map.put("data", page.getList());
        return "";
    }



}
