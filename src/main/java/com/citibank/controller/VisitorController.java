package com.citibank.controller;

import com.citibank.common.IdUtil;
import com.citibank.dao.Page;
import com.citibank.entity.Investor;
import com.citibank.service.InvestorService;
import com.citibank.service.ReportService;
import com.citibank.service.VisitorService;
import com.citibank.service.impl.CompanyServiceImpl;
import com.citibank.service.impl.InvestorServiceImp;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    private VisitorService visitorService;
    @Autowired
    private InvestorServiceImp investorServiceImp;
    @Autowired
    private CompanyServiceImpl companyServiceImp;
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
    @RequestMapping(value = "/register.htm",method = RequestMethod.GET)
    public String getRegisterPage()
    {
        return "/visitor/reg";
    }

    @RequestMapping(value = "/nextstep",method = RequestMethod.POST)
    public String  register(@RequestParam Map<String,Object> reqs,HttpSession session)
    {
        String flag=(String)reqs.get("userType");
        String id= IdUtil.uuid();
        session.setAttribute("userId",id);
        if(flag=="投资者")
        {
            reqs.put("investorId",id);
            reqs.remove("userType");
            investorServiceImp.registerInvestor(reqs);
            return "/";
        }
        else
        {
            reqs.put("companyId",id);
            reqs.remove("userType");
            companyServiceImp.userRegister(reqs);
            return "/";
        }

   }
    @RequestMapping(value = "/financeCom", method = RequestMethod.GET)
    public String getFinancingCom() {
        return "visitor/finacing-company";
    }

    @RequestMapping("/financing_more/{num}")
    public String getComDetail(@PathVariable("num") int num){
        return "visitor/customer_financing_more"+num;
    }

    //主界面
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndexPage() {
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

}
