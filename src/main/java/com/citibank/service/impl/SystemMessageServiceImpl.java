package com.citibank.service.impl;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.SystemMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mrtian on 2015/7/16.
 */
@Service
public class SystemMessageServiceImpl implements SystemMessageService{
    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public MySQLSimpleDaoImpl getMySQLSimpleDao() {
        return mySQLSimpleDao;
    }

    public void setMySQLSimpleDao(MySQLSimpleDaoImpl mySQLSimpleDao) {
        this.mySQLSimpleDao = mySQLSimpleDao;
    }

    public List<Map<String,Object>> getAllMessage()
    {
        String sql = "select * from message";
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list = mySQLSimpleDao.queryForList(sql);
        if(list.size() > 0)
        {
            System.out.println("找到list!");
            return list;
        }
        else {
            System.out.println("没找到list!");
            return null;
        }
    }
    public List<Map<String,Object>> getMessageById(Map<String,Object> reqs)
    {
        String sql = "select * from message where id=:id";
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list = mySQLSimpleDao.queryForList(sql,reqs);
        if(list.size() > 0)
        {
            System.out.println("找到list!");
            return list;
        }
        else {
            System.out.println("没找到list!");
            return null;
        }
    }
    public List<Map<String,Object>> getMessageByTime(Map<String,Object> reqs)
    {
        String sql = "select * from message where time=:time";
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list = mySQLSimpleDao.queryForList(sql,reqs);
        if(list.size() > 0)
        {
            System.out.println("找到list!");
            return list;
        }
        else {
            System.out.println("没找到list!");
            return null;
        }
    }
    public List<Map<String,Object>> getMessageByContent(Map<String, Object> reqs)
    {
        String sql = "select * from message where content=:content";
        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        list = mySQLSimpleDao.queryForList(sql,reqs);
        if(list.size() > 0)
        {
            System.out.println("找到list!");
            return list;
        }
        else {
            System.out.println("没找到list!");
            return null;
        }
    }
}
