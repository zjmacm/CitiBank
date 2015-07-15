package com.citibank.service.impl;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Administrator on 2015/7/13.
 */
@Service("UserService")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public MySQLSimpleDaoImpl getMySQLSimpleDao() {
        return mySQLSimpleDao;
    }

    public void setMySQLSimpleDao(MySQLSimpleDaoImpl mySQLSimpleDao) {
        this.mySQLSimpleDao = mySQLSimpleDao;
    }

    @Override
    public String userRegister(Map<String, Object> reqs) {
        String result = "success";
        String userName = reqs.get("username").toString();
        String sql = "select *from db_user where userName = '"+userName+"'";
        if(mySQLSimpleDao.queryForList(sql,new HashMap<String,Object>()).size()>0){
            result = "repeat";
        }
        else{
            try{
                Date date = new Date();
                reqs.put("formedTime","date");
                mySQLSimpleDao.create("companyInfo",reqs);


            }catch (Exception e){
                e.printStackTrace();
                result = "failed";
            }
        }
        return result;
    }

    @Override
    public Map<String,Object> userLogin(Map<String, Object> reqs) {
        Map<String,Object> result = new HashMap<String, Object>();
        String sql = "select *from companyInfo where username=:username and password=:password";
        List<Map<String,Object>> list = mySQLSimpleDao.queryForList(sql,reqs);
        if(list.size()==1){
            result.put("result","success");
            result.put("companyId",list.get(0).get("companyId"));
        }
        else{
            result.put("result","failed");
        }
        return result;

    }

    @Override
    public Integer getUserType(String user_id) {
        return null;
    }



}
