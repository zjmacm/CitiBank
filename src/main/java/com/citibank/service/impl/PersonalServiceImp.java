package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhao on 15-7-15.
 */
public class PersonalServiceImp implements PersonalService {
    @Autowired
    private JdbcTemplate jdbcTemplate;



    public Page<Map<String, Object>> orderByDefault(@RequestParam Map<String, Object> reqs) {
        MySQLSimpleDaoImpl personalDao=new MySQLSimpleDaoImpl();
        int start=Integer.parseInt((String) reqs.get("pageIndex"));
        personalDao.setJdbcTemplate(jdbcTemplate);
        String sql="select * from attentionState";
        return personalDao.pageQuery(sql,new HashMap<String, Object>(),start,10,new Order());


    }

    public Page<Map<String, Object>> orderByCompanyName(@RequestParam Map<String, Object> reqs) {
        MySQLSimpleDaoImpl personalDao=new MySQLSimpleDaoImpl();
        int start=Integer.parseInt((String) reqs.get("pageIndex"))+1;
        personalDao.setJdbcTemplate(jdbcTemplate);
        String sql="select * from attentionState left join company on attentioState.companyId=company.companyId";
        Order order=new Order().asc("companyName");
        return personalDao.pageQuery(sql,new HashMap<String, Object>(),start,10,order);
    }

    public Page<Map<String, Object>> orderByProductName(@RequestParam Map<String, Object> reqs) {
        MySQLSimpleDaoImpl personalDao=new MySQLSimpleDaoImpl();
        int start=Integer.parseInt((String) reqs.get("pageIndex"))+1;
        personalDao.setJdbcTemplate(jdbcTemplate);
        String sql="select * from attentionState left join stockcreditor on attentionState.stockCreditorId=stockcreditor.id";
        Order order=new Order().asc("productName");
        return personalDao.pageQuery(sql,new HashMap<String, Object>(),start,10,order);
    }

    public Page<Map<String, Object>> orderByAttentionState(@RequestParam Map<String, Object> reqs) {
        MySQLSimpleDaoImpl personalDao=new MySQLSimpleDaoImpl();
        int start=Integer.parseInt((String) reqs.get("pageIndex"))+1;
        personalDao.setJdbcTemplate(jdbcTemplate);
        String sql="select * from attentionState";
        Order order=new Order().asc("attentionState");
        return personalDao.pageQuery(sql,new HashMap<String, Object>(),start,10,order);
    }

    public Page<Map<String, Object>> orderByAttentionTime(@RequestParam Map<String, Object> reqs) {
        MySQLSimpleDaoImpl personalDao=new MySQLSimpleDaoImpl();
        int start=Integer.parseInt((String) reqs.get("pageIndex"))+1;
        personalDao.setJdbcTemplate(jdbcTemplate);
        String sql="select * from attentionTime";
        Order order=new Order().asc("attentionStateTime");
        return personalDao.pageQuery(sql,new HashMap<String, Object>(),start,10,order);
    }

    public Page<Map<String, Object>> orderByProductType(@RequestParam Map<String, Object> reqs) {
        MySQLSimpleDaoImpl personalDao=new MySQLSimpleDaoImpl();
        int start=Integer.parseInt((String) reqs.get("pageIndex"))+1;
        personalDao.setJdbcTemplate(jdbcTemplate);
        String sql="select * from productType";
        Order order=new Order().asc("productType");
        return personalDao.pageQuery(sql,new HashMap<String, Object>(),start,10,order);
    }

    public Page<Map<String, Object>> orderByKeyValue(@RequestParam Map<String, Object> reqs) {
        MySQLSimpleDaoImpl personalDao=new MySQLSimpleDaoImpl();
        int start=Integer.parseInt((String) reqs.get("pageIndex"))+1;
        personalDao.setJdbcTemplate(jdbcTemplate);
        String sql="select * from attentionState group by " +
                "companyName()";
        return personalDao.pageQuery(sql,new HashMap<String, Object>(),start,10,new Order());
    }
}
