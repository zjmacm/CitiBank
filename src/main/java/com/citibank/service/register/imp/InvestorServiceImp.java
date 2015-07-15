package com.citibank.service.register.imp;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.register.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liuhao on 15-7-14.
 */
public class InvestorServiceImp implements InvestorService {
    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;
    public MySQLSimpleDaoImpl getMySQLSimpleDao() {
        return mySQLSimpleDao;
    }

    public void setMySQLSimpleDao(MySQLSimpleDaoImpl mySQLSimpleDao) {
        this.mySQLSimpleDao = mySQLSimpleDao;
    }


    @Override
    public String registerInvestor(Map<String, Object> reqs) {
        String result="";
        String username=(String)reqs.get("username");
        String sql="select * from investor where username='"+username+"'";
        if(mySQLSimpleDao.queryForList(sql,new HashMap<String,Object>()).size()>0){
            result = "repeat";
        }
        else
        {
            try {
                mySQLSimpleDao.create("investor", reqs);
                result = "success";
            }
            catch (Exception e){
                e.printStackTrace();
                result = "failed";
            }
        }
        return result;

    }

    @Override
    public Map<String, Object> loginInvestor(Map<String, Object> reqs) {
        Map<String,Object> result=new HashMap<String,Object>();
        if(!reqs.containsKey("username")||!reqs.containsKey("password"))
        {
            result.put("result","failed");
        }
        else
        {
            String sql="select * from investor where investorName:investorName and" +
                    " password:password";
            List<Map<String,Object>> list=mySQLSimpleDao.queryForList(sql,reqs);
            if(list.size()==1){
                result.put("result","success");
                result.put("id",list.get(0).get("id"));
            }
            else{
                result.put("result","failed");
            }
        }

        return result;
    }
}
