package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/21.
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public List<Map<String, Object>> getCenterReport() {
        String sql="select i.id, i.name from information i where flag =2";
        return mySQLSimpleDao.queryForList(sql,new HashMap<String, Object>());
    }

    public Page<Map<String,Object>> getCreditReport(int pageIndex) {
        String sql="select i.id, i.name from information i where i.flag=3";
        Page<Map<String, Object>> result = mySQLSimpleDao.pageQuery(sql, new HashMap<String, Object>(), pageIndex, 10, new Order().asc("id"));
        return result;
    }

    public List<Map<String, Object>> getPolicyReport() {
        String sql="select i.id, i.name from information i where i.flag=0";
        return mySQLSimpleDao.queryForList(sql, new HashMap<String, Object>());
    }

    public List<Map<String, Object>> getMarketReport() {
        String sql="select i.id, i.name from information i where i.flag = 1";
        return mySQLSimpleDao.queryForList(sql, new HashMap<String, Object>());
    }

    public String getReportFile(String id) {
        String sql="select i.path from information i where id = "+id;
        List<Map<String, Object>> result = mySQLSimpleDao.queryForList(sql, new HashMap<String, Object>());
        return (String) result.get(0).get("path");
    }

}
