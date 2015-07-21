package com.citibank.service;

import com.citibank.dao.Page;

import java.util.List;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/21.
 */
public interface ReportService {

    //获取中心公告
    public List<Map<String, Object>> getCenterReport();

    //获取信用监管报告
    public Page<Map<String,Object>> getCreditReport(int pageIndex);

    //获取政策资讯
    public List<Map<String,Object>> getPolicyReport();

    //获取市场咨询
    public List<Map<String, Object>> getMarketReport();

    //获取公告文件
    public String getReportFile(String id);

}
