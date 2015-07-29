package com.citibank.service.impl;

import com.citibank.dao.ConditionUtil;
import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.AppointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
@Service
public class AppointServiceImpl implements AppointService {
    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public MySQLSimpleDaoImpl getMySQLSimpleDao() {
        return mySQLSimpleDao;
    }

    public void setMySQLSimpleDao(MySQLSimpleDaoImpl mySQLSimpleDao) {
        this.mySQLSimpleDao = mySQLSimpleDao;
    }



    public Page<Map<String, Object>> getAppoint(Map<String,Object> reqs) {
        String sql = "select * from appointment where companyId=:companyId and flag =:flag";
        int pageSize = 10;
        String companyId = (String)reqs.get("companyId");
        int flag = Integer.parseInt(reqs.get("flag").toString());
        int pageIndex = Integer.parseInt(reqs.get("pageIndex").toString());
        Order order=new Order().asc("companyId");
        Page<Map<String, Object>> page = mySQLSimpleDao.pageQuery(sql,reqs,pageIndex,pageSize,order);
        if(page.getSize() > 0)
        {
            System.out.println("找到page!");
            return page;
        }
        else {
            System.out.println("没找到page!");
            return null;
        }
    }



}
