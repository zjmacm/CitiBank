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
import java.util.Objects;

/**
 * Created by Nikolas on 2015/7/21.
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public Page<Map<String,Object>> getReport(int pageIndex, String queryContent,int type) {
        StringBuffer templateSql = new StringBuffer("select i.id, i.name from information i where flag = :type");
        if(!queryContent.equals("")){
            templateSql.append(" and i.name like %:query_content%");
        }
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("type",type);
        map.put("query_content", queryContent);
        return mySQLSimpleDao.pageQuery(templateSql.toString(), map, pageIndex, 10, new Order().asc("id"));
    }

    public List<Map<String, Object>> getImformation(int type) {
        String sql  = "select i.id, i.name from information i where flag = :type";
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("type", type);
        return mySQLSimpleDao.queryForList(sql, map);
    }

    public String getReportFile(String id) {
        String sql="select i.path from information i where id = "+id;
        List<Map<String, Object>> result = mySQLSimpleDao.queryForList(sql, new HashMap<String, Object>());
        return (String) result.get(0).get("path");
    }

}
