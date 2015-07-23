package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zjm on 2015/7/22.
 */
@Service("VisitorService")
public class VisitorServiceImpl implements VisitorService{

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public Page<Map<String, Object>> getMarketList(int pageIndex) {
        Order order = new Order();
        order.asc("id");
        String sql = "select *from information";
        return mySQLSimpleDao.pageQuery(sql,new HashMap<String, Object>(),pageIndex,10,order);
    }

    public Page<Map<String, Object>> getPolicyList(int pageIndex) {
        Order order = new Order();
        order.asc("id");
        String sql = "select *from information";
        return mySQLSimpleDao.pageQuery(sql,new HashMap<String, Object>(),pageIndex,10,order);
    }

    public Map<String, Object> getPolicyInfoDetail(String id) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",id);
        String filePath = mySQLSimpleDao.queryForList("select *from information where id=:id",map)
                .get(0).get("path").toString();
        FileReader fr = null;
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
             fr = new FileReader(filePath);
             br = new BufferedReader(fr);

            String s = new String();
            while((s=br.readLine())!=null) {
                sb.append(s).append("\r\n");
            }


        }catch(IOException e){
            e.printStackTrace();

        }
        map.put("data",sb.toString());
        return map;
    }

    public Map<String, Object> getMarketInfoDetail(String id) {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("id",id);
        String filePath = mySQLSimpleDao.queryForList("select *from information where id=:id",map)
                .get(0).get("path").toString();
        FileReader fr = null;
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);

            String s = new String();
            while((s=br.readLine())!=null) {
                sb.append(s).append("\r\n");
            }


        }catch(IOException e){
            e.printStackTrace();

        }
        map.put("data",sb.toString());
        return map;
    }

    public Page<Map<String, Object>> getFinancingCom(int pageIndex) {
        Order order = new Order().asc("id");
        return mySQLSimpleDao.pageQuery("select *from information",new HashMap<String, Object>(),pageIndex,10,order);
    }

    public Map<String, Object> investCenter() {
        return null;
    }

    public Map<String, Object> companyService() {
        return null;
    }
}
