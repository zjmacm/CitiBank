package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.service.FinanceService;
import com.citibank.service.ReportService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/21.
 */
//公告部分
@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @Autowired
    private FinanceService financeService;

    @RequestMapping(value = "/getReport/{type}", method = RequestMethod.GET)
    public ModelAndView getReport(@RequestParam(value = "pageIndex", required = false, defaultValue = "2") int pageIndex,
                            @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                            @PathVariable("type") int type,
                            Map<String, Object> map) {
        Page<Map<String, Object>> result = reportService.getReport(pageIndex, queryContent, type);
        map.put("pageIndex", pageIndex);
        map.put("totalPage", result.getpageCount());
        map.put("data", result.getList());
        map.put("type",type);
        return new ModelAndView("data",map);
    }

    @RequestMapping(value = "/policy.htm", method = RequestMethod.GET)
    public @ResponseBody Map<String,Object> getPolicyReport(@RequestParam(value = "type", required = false, defaultValue = "0") int type,
                                  Map<String, Object> map) {
        List<Map<String, Object>> result = reportService.getInformation(type);
        map.put("data", result);
        return map;
    }

    @RequestMapping(value = "/detail.htm", method = RequestMethod.GET)
    public String getReportDetail(@RequestParam("reportId") String reportId, Map<String, Object> map) {
        String fileUrl = reportService.getReportFile(reportId);
        map.put("url", fileUrl);
        return "";
    }

    @RequestMapping("/companyInfo.htm")
    public String getCompanyInfo(@RequestParam("companyId")String companyId, HttpSession session,
                                 Map<String,Object> map){
        String userId= (String) session.getAttribute("userId");
        List<Map<String, Object>> onTime = reportService.getReportById(6, companyId);
        List<Map<String, Object>> temporary = reportService.getReportById(7, companyId);
        Map<String, Object> finance = financeService.getFinance(userId);
        map.put("onTime",onTime);
        map.put("temporary",temporary);
        map.put("finance", finance);
        return "";
    }
//中心公告
    @RequestMapping("/getCenter")
    public String getCenterPage()
    {
        return "investor/information-center-notice";
    }
    //信用公告
    @RequestMapping("/getCredit")
    public String getCreditPage()
    {
        return "investor/information_credit";
    }
    //备案发行公告
    @RequestMapping("/getIssue")
    public String getIssuePage()
    {
        return "investor/information_issue";
    }
    //定期公告
    @RequestMapping("/getRegular")
    public String getRegularPage()
    {
        return "investor/information_regular";
    }
    //转让交易
    @RequestMapping("/getTransform")
    public String getTransformPage()
    {
        return "investor/information_transform";
    }
    //临时报告
    @RequestMapping("/getTemporary")
    public String getTemporaryPage()
    {
        return "investor/information_temporary";
    }


}