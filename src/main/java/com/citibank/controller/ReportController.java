package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.service.ReportService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/21.
 */
@Controller
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping(value = "/getReport.htm", method = RequestMethod.GET)
    public String getReport(@RequestParam(value = "pageIndex", required = false, defaultValue = "2") int pageIndex,
                            @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                            @RequestParam(value = "type", required = false, defaultValue = "0") int type,
                            Map<String, Object> map) {
        Page<Map<String, Object>> result = reportService.getReport(pageIndex, queryContent, type);
        map.put("pageIndex", pageIndex);
        map.put("totalPage", result.getpageCount());
        map.put("data", result.getList());
        return "";
    }

    @RequestMapping(value = "/policy.htm", method = RequestMethod.GET)
    public String getPolicyReport(@RequestParam(value = "type", required = false, defaultValue = "0") int type,
                                  Map<String, Object> map) {
        List<Map<String, Object>> result = reportService.getInformation(type);
        map.put("data", result);
        return "";
    }

    @RequestMapping(value = "/detail.htm", method = RequestMethod.GET)
    public String getReportDetail(@RequestParam("reportId") String reportId, Map<String, Object> map) {
        String fileUrl = reportService.getReportFile(reportId);
        map.put("url", fileUrl);
        return "";
    }

    @RequestMapping("/companyInfo.htm")
    public String getCompanyInfo(@RequestParam("companyId")String companyId, Map<String,Object> map){
        List<Map<String, Object>> onTime = reportService.getReportById(6, companyId);
        List<Map<String, Object>> temporary = reportService.getReportById(7, companyId);
        map.put("onTime",onTime);
        map.put("temporary",temporary);
        return "";
    }

}