package com.citibank.controller;

import com.citibank.service.CompanyService;
import com.citibank.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
@Controller
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private InvestorService investorService;

    @RequestMapping(value = "/getUserInfo.htm", method = RequestMethod.GET)
    public String getUserInfo(HttpSession session,Map<String, Object> map){
        String userId= (String) session.getAttribute("userId");
        int userType= (Integer) session.getAttribute("userType");
        if(userType==0) {
            map.putAll(companyService.getCompanyInfo(userId));
        }else{
            map.putAll(investorService.getInvestorInfo(userId));
        }
        return "common/userInfo";
    }

    @RequestMapping(value = "/saveUserInfo",method = RequestMethod.POST)
    public @ResponseBody Map<String ,String> saveUserInfo(@RequestParam Map<String, Object> parms,HttpSession session){
        String userId= (String) session.getAttribute("userId");
        int userType= (Integer) session.getAttribute("userType");
        int result=-1;
        if(userType==0) {
            result = companyService.saveCompanyInfo(parms, userId);
        }else{
            result=investorService.saveInvestorInfo(parms, userId);
        }
        Map<String, String> status=new HashMap<String, String>();
        if(result==0){
            status.put("error","failed");
        }else{
            status.put("error","success");
        }
        return status;
    }
}
