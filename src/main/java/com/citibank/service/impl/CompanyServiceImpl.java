package com.citibank.service.impl;

import com.citibank.common.IdUtil;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/**
 * Created by zjm on 2015/7/13.
 */
@Service("CompanyService")
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;



    public MySQLSimpleDaoImpl getMySQLSimpleDao() {
        return mySQLSimpleDao;
    }

    public void setMySQLSimpleDao(MySQLSimpleDaoImpl mySQLSimpleDao) {
        this.mySQLSimpleDao = mySQLSimpleDao;
    }

    public String userRegister(Map<String, Object> reqs) {
        String result = "success";
        try{
            Date date = new Date();
            reqs.put("formedTime","date");
            String id = IdUtil.uuid();
            reqs.put("companyId",id);
            mySQLSimpleDao.create("company",reqs);

        }catch (Exception e){
            e.printStackTrace();
            result = "failed";
        }

        return result;
    }

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

    public String confirmEmail(Map<String, Object> reqs) {

        String result = "success";
        String sql = "select *from company where username=:username";
        if(mySQLSimpleDao.queryForList(sql,reqs).size()!=0){
            result = "failed";
        }
        return result;
    }

    public String confirmCompanyCode(Map<String, Object> reqs) {
        String result = "success";
        String sql = "select *from company where companyCode=:companyCode";
        if(mySQLSimpleDao.queryForList(sql,reqs).size()!=0){
            result = "failed";
        }
        return result;
    }

    public String confirmCompanyName(Map<String, Object> reqs) {
        String result = "success";
        String sql = "select *from company where companyName=:companyName";
        if(mySQLSimpleDao.queryForList(sql,reqs).size()!=0){
            result = "failed";
        }
        return result;
    }

    public String confirmBussinessLisence(Map<String, Object> reqs) {
        String result = "success";
        String sql = "select *from company where bussinessLisence=:bussinessLisence";
        if(mySQLSimpleDao.queryForList(sql,reqs).size()!=0){
            result = "failed";
        }
        return result;
    }

    public Map<String, Object> getCompanyInfo(String userId) {
        List<Map<String, Object>> result = mySQLSimpleDao.queryForList("select * from company");
        if(result.size()==0){
            Map<String ,Object> map=new HashMap<String, Object>();
            map.put("error","true");
            return map;
        }
        return result.get(0);
    }

    public int saveCompanyInfo(Map<String, Object> map,String userId) {
        Map<String,Object> cons=new HashMap<String, Object>();
        cons.put("companyId", userId);
        return mySQLSimpleDao.update("company", map, cons);
    }
}
