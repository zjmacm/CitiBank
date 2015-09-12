package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
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
    //公司模块的资产详情
    @RequestMapping(value="/assetDetail.htm")
    public String getAssetDetailPage(){
        return "/company/资产管理-详情显示";
    }
    //投资者模式的资产详情


    @RequestMapping(value="/getChooseStockList")
    public  String getCompanyChooseList1(@RequestParam Map<String, Object> reqs,HttpServletRequest req){

        int value = Integer.parseInt(req.getParameter("time"));
        List<Map<String,Object>> list = assetService.getCompanyStockManage(value);
        req.setAttribute("data", list);
        return "/company/logined-company-proprety";
    }
    @RequestMapping(value="getChooseDebtList")
    public String getComanyChooseList2(@RequestParam Map<String,Object> reqs,HttpServletRequest req){
        int value = Integer.parseInt(req.getParameter("time"));
        List<Map<String,Object>> list = assetService.getCompanyDebtManage(value);
        req.setAttribute("data",list);
        return "/company/logined-company-proprety-debat";
    }


    @RequestMapping(value="/search/{type}")
    public String search(@PathVariable (value= "type")Integer type,
                         HttpServletRequest request){
        String content = request.getParameter("content");
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list = assetService.getSearchContent(type,content).getList();
        request.setAttribute("data",list);
        if(type == 0){
            return "/company/logined-company-proprety";
        }
        else {
            return "/company/logined-company-proprety-debat";
        }
    }

    @RequestMapping(value = "/company/{type}")
    public String getCompanyStock(@RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
                                  @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                                  @RequestParam(value = "duration", required = false, defaultValue = "1_month") String duration,
                                  @PathVariable(value = "type") Integer type,
                                  HttpSession session, Map<String, Object> map,
                                  HttpServletRequest request) {
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


            List<Map<String,Object>> list = assetService.getCompanyStockManage(-1);
            request.setAttribute("data",list);
            return "company/logined-company-proprety";


        } else {
            List<Map<String,Object>> list = assetService.getCompanyDebtManage(-1);
            request.setAttribute("data",list);
            return "company/logined-company-proprety-debat";
        }
    }

    @RequestMapping(value="/investor/{type}")
    public String getInvestorStock(@RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
                                   @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                                   @RequestParam(value = "duration", required = false, defaultValue = "1_month") String duration,
                                   @PathVariable(value = "type") Integer type,
                                   HttpSession session, Map<String, Object> map) {
        System.out.println(pageIndex+".."+queryContent+".."+duration+".."+type+"..");
        String userId= (String) session.getAttribute("userId");
        Page<Map<String, Object>> stockPage = assetService.getInvestorStock(userId, pageIndex, queryContent, duration, type);
        map.put("totalPage", stockPage.getpageCount());
        map.put("pageIndex",pageIndex);
        map.put("data", stockPage.getList());

        if(type==0) {

            return "investor/logined_investorpatten_survey_of_investment";
        }else if(type==1){
            return "investor/logined_investorpatten_stock_equity_management";
        }else{
            return "investor/logined_investorpatten_stockright_manage";
        }
    }
    @RequestMapping(value="/getChooseInventorList/{type}")
    public String Search1(@PathVariable (value="type") Integer type,
            HttpSession session, HttpServletRequest request){
        String userId = session.getAttribute("userId").toString();
        int value = Integer.valueOf(request.getParameter("radio-group").toString());
            List<Map<String,Object>> list = assetService.getInventorCondition(type,value,userId).getList();
            request.setAttribute("data",list);
        if(type==0){
            return "investor/logined_investorpatten_survey_of_investment";
        }
        else if(type==1){
            return "investor/logined_investorpatten_stock_equity_management";
        }
        else{
            return "investor/logined_investorpatten_stockright_manage";
        }
    }
    @RequestMapping(value="/inventor/search/{type}")
    public String getInventorSearchContent(@PathVariable(value="type") int type,
            HttpServletRequest request,HttpSession session) {
        String userId = session.getAttribute("userId").toString();
        String content = request.getParameter("content").toString();
        List<Map<String,Object>> list = assetService.getInventorSearchContent(type,content,userId).getList();
        request.setAttribute("data",list);
        return "investor/logined_investorpatten_survey_of_investment";
    }
}
