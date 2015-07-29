package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.service.AssetService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by liwang on 15-7-21.
 */
@Controller
@RequestMapping(value = "/asset")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @RequestMapping(value = "/company/{type}")
    public String getCompanyStock(@RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
                                  @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                                  @RequestParam(value = "duration", required = false, defaultValue = "1_month") String duration,
                                  @PathVariable(value = "type") Integer type,
                                  HttpSession session, Map<String, Object> map) {
//        String userId= (String) session.getAttribute("userId");
//        Page<Map<String, Object>> stockPage = assetService.getCompanyStock(userId, pageIndex, queryContent,duration, type);
//        List<Map<String, Object>> stocks=stockPage.getList();
//        Date currentDate=new Date();
//        int totalMoney = assetService.getTotalMoney(userId,duration);
//        for(Map<String,Object> stock:stocks){
//            Date date= (Date) stock.get("createTime");
//            map.put("year", currentDate.getYear()-date.getYear());
//            map.put("month",currentDate.getMonth()-date.getMonth());
//            map.put("day", currentDate.getDay() - date.getDay());
//            map.remove("createTime");
//            map.put("percent", Double.valueOf(map.get("investMoney").toString())/totalMoney);
//        }
//        map.put("totalPage",stockPage.getpageCount());
//        map.put("pageIndex",pageIndex);
//        map.put("data", stocks);
        if (type == 0) {
            return "company/logined-company-proprety";
        } else {
            return "company/logined-company-proprety-debat";
        }
    }

    @RequestMapping("/investor/{type}")
    public String getInvestorStock(@RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
                                   @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                                   @RequestParam(value = "duration", required = false, defaultValue = "1_month") String duration,
                                   @PathVariable(value = "type") Integer type,
                                   HttpSession session, Map<String, Object> map) {
//        String userId= (String) session.getAttribute("userId");
//        Page<Map<String, Object>> stockPage = assetService.getInvestorStock(userId, pageIndex, queryContent, duration, type);
//        map.put("totalPage", stockPage.getpageCount());
//        map.put("pageIndex",pageIndex);
//        map.put("data", stockPage.getList());
        if(type==0) {
            return "investor/logined_investorpatten_survey_of_investment";
        }else if(type==1){
            return "investor/logined_investorpatten_stock_equity_management";
        }else{
            return "investor/logined_investorpatten_stockright_manage";
        }
    }

}
