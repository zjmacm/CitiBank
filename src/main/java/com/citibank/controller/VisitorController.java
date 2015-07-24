package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.entity.Investor;
import com.citibank.service.InvestorService;
import com.citibank.service.ReportService;
import com.citibank.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value = "/getFinancingCompany", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> getFinancingCom(
            @RequestParam(value = "pageIndex", required = false, defaultValue = "1") int pageIndex,
            Map<String, Object> map) {
        Page<Map<String, Object>> page = visitorService.getFinancingCom(pageIndex);
        map.put("pageIndex", page.getIndex());
        map.put("pageSize", page.getpageCount());
        map.put("data", page.getList());
        return map;
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
