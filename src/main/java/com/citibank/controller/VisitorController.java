package com.citibank.controller;

import com.citibank.common.IdUtil;
import com.citibank.dao.Page;
import com.citibank.entity.Investor;
import com.citibank.service.InvestorService;
import com.citibank.service.ReportService;
import com.citibank.service.VisitorService;
import com.citibank.service.impl.CompanyServiceImpl;
import com.citibank.service.impl.InvestorServiceImp;
import com.sun.deploy.net.HttpResponse;
import com.sun.mail.iap.Response;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zjm on 2015/7/22.
 */

@Controller("InformationController")
@RequestMapping("/customer")
public class VisitorController {

    @Autowired
    private InvestorServiceImp investorService;
    @Autowired
    private CompanyServiceImpl companyService;
    @Autowired
    private VisitorService visitorService;

    //游客模式下查看政策咨询和市场咨询
    @RequestMapping(value = "/policy.htm", method = RequestMethod.GET)
    public String getPolicyPage() {
        return "visitor/policy";
    }

    //市场咨询
    @RequestMapping(value = "/market.htm", method = RequestMethod.POST)
    public String getMarketPage() {
        return "visitor/market";
    }

    //进入注册页面
    @RequestMapping(value = "/register.htm", method = RequestMethod.GET)
    public String getRegisterPage() {
        return "/visitor/reg";
    }

    @RequestMapping(value = "/echeck",method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> confirmEmail(@RequestParam("data")String email){
        Map<String, Object> map = new HashMap<String, Object>();
        String result = visitorService.confirmEmail(email);
        map.put("check",result);
        return map;
    }

    @RequestMapping(value = "/nameCheck",method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> confirmName(@RequestParam("data")String name){
        Map<String,Object> map=new HashMap<String, Object>();
        String result = visitorService.confirmName(name);
        map.put("check", result);
        return map;
    }

    @RequestMapping(value = "/nextstep", method = RequestMethod.POST)
    public String register(@RequestParam Map<String, Object> reqs, HttpSession session) {
        String flag = (String) reqs.get("userType");
        String id = IdUtil.uuid();
        session.setAttribute("userId", id);
        if (flag == "投资者") {
            reqs.put("investorId", id);
            reqs.remove("userType");
            investorService.registerInvestor(reqs);
            return "/";
        } else {
            reqs.put("companyId", id);
            reqs.remove("userType");
            companyService.userRegister(reqs);
            return "/";
        }

    }

    @RequestMapping(value = "/financeCom", method = RequestMethod.GET)
    public String getFinancingCom() {
        return "visitor/finacing-company";
    }

    @RequestMapping("/financing_more/{num}")
    public String getComDetail(@PathVariable("num") int num) {
        return "visitor/customer_financing_more" + num;
    }

    //主界面
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage(Map<String,Object> map) {
        return "visitor/customer-index";
    }

    //
    @RequestMapping(value = "/sign.htm", method = RequestMethod.GET)
    public String getSinaturePage() {
        return "visitor/customer-service-signature";
    }

    @RequestMapping(value = "/consulting.htm", method = RequestMethod.GET)
    public String getDetailsPage() {
        return "visitor/customer-consulting";
    }

    @RequestMapping(value = "/infoPolicy.htm", method = RequestMethod.GET)
    public String getInfoPolicyPage() {
        return "visitor/customer-information-policy";
    }

    @RequestMapping(value = "/invesStock.htm", method = RequestMethod.GET)
    public String getInvesStock() {
        return "visitor/customer-investment-stock";
    }

    @RequestMapping(value = "/marketNews.htm", method = RequestMethod.GET)
    public String getMarketNewsPage() {
        return "visitor/customer-market-news";
    }

    @RequestMapping(value = "/serviceAsset.htm", method = RequestMethod.GET)
    public String getserviceAssetPage() {
        return "visitor/customer-service-asset";
    }

    @RequestMapping(value = "/codeCheck", method = RequestMethod.POST)
    public @ResponseBody Map<String,Object> confirmCode(@RequestParam("data")String code){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("check","success");
        return map;
    }
    //导航栏跳转请求响应，首页
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexPageAgain(Map<String,Object> map) {
        map.put("flag", 0);
        return "visitor/customer-index";
    }
    //导航栏跳转请求响应，融资企业
    @RequestMapping(value = "/finance", method = RequestMethod.GET)
    public String getFinancePage(Map<String, Object> map) {
        map.put("flag", 1);
        return "visitor/customer_financing_more";
    }
    //导航栏跳转请求响应，投资中心
    @RequestMapping(value = "/invest", method = RequestMethod.GET)
    public String getInvestPage(Map<String,Object> map) {
        map.put("flag", 2);
        return "visitor/customer_investment_debt";
    }
    //导航栏跳转请求响应，企业服务
    @RequestMapping(value = "/service", method = RequestMethod.GET)
    public String getServicePage(Map<String,Object> map) {
        map.put("flag", 3);
        return "visitor/customer-service-asset";
    }

}
