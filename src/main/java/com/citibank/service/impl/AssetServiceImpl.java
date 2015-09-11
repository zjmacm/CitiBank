package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by liwang on 15-7-21.
 */

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;


    public Page<Map<String, Object>> getCompanyStock(String userId, int pageIndex, String queryContent,
                                                     String duration, int type) {
        StringBuffer sb = new StringBuffer("select s.createTime, s.investTime, s.investMoney, sum(totalMoney) sum" +
                " from stockcreditor where userId = :user_id and createTime < :create_time and productType = :product_type");
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("user_id", userId);
        parms.put("create_time", getAimDate(duration));
        parms.put("product_type", type);
        if (!queryContent.equals("")) {
            sb.append(" and productName like %:product_name%");
            parms.put("product_name", queryContent);
        }

        return mySQLSimpleDao.pageQuery(sb.toString(), parms, pageIndex, 10, new Order().asc("id"));
    }

    public int getTotalMoney(String userId, String duration) {
        String sql = "select sum(investMoney) totalMoney from stockcreditor where userId = :user_id and createTime = :create_time";
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("user_id", userId);
        parms.put("create_time", getAimDate(duration));
        List<Map<String, Object>> results = mySQLSimpleDao.queryForList(sql, parms);
        return Integer.valueOf(results.get(0).get("totalMoney").toString());
    }

    public Page<Map<String, Object>> getInvestorStock(String userId, int pageIndex, String queryContent, String duration, int type) {
        StringBuffer sb = new StringBuffer("select s.investMoney, s.investArea, s.stockRate" +
                " from stockcreditor s where s.userId = :user_id and s.createTime > :create_time");
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("user_id", userId);
        parms.put("create_time", getAimDate(duration));
        if (!queryContent.equals("")) {
            sb.append(" and productName like %:product_name%");
            parms.put("product_name", queryContent);
        }
        if(type!=0){
            sb.append(" and productType = :product_type");
            parms.put("product_type", type);
        }
        Page<Map<String, Object>> pages = mySQLSimpleDao.pageQuery(sb.toString(), parms, pageIndex, 10, new Order().asc("s.createTime"));
        List<Map<String, Object>> datas = pages.getList();
        Random random=new Random();
        for(Map<String,Object> data:datas){
            data.put("stockRate",random.nextInt(10));
        }
        return pages;
    }

    private Date getAimDate(String duration) {
        Calendar calendar = Calendar.getInstance();
        if (duration.equals("1_month")) {
            calendar.add(calendar.MONTH, -1);
        } else if (duration.equals("3_month")) {
            calendar.add(calendar.MONTH, -3);
        } else if (duration.equals("6_month")) {
            calendar.add(calendar.MONTH, -6);
        } else if (duration.equals("1_year")) {
            calendar.add(Calendar.YEAR, -1);
        } else {
            calendar.add(Calendar.YEAR, -2);
        }
        return calendar.getTime();
    }

    public List<Map<String,Object>> getCompanyStockManage(int value){
        String type = "1";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", type);
        if(value ==-1) {
            String sql = "select *from asset where type = :type";
            return mySQLSimpleDao.queryForList(sql, map);
        }
        else {
            if(value==1){
                map.put("value",1);
            }
            else if(value==2){
                map.put("value",3);
            }
            else if(value==3){
                map.put("value",6);
            }
            else if(value==4){
                map.put("value",12);
            }
            else if(value ==5){
                map.put("value",24);
            }
            String sql = "select *from asset where type=:type and publishedTime<=:value";
            return mySQLSimpleDao.queryForList(sql,map);
        }

    }


    public List<Map<String,Object>> getCompanyDebtManage(int value){
        String type = "2";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("type", type);
        if(value==-1) {
            String sql = "select *from asset where type = :type";
            return mySQLSimpleDao.queryForList(sql, map);
        }
        else{
            if(value==1){
                map.put("value",1);
            }
            else if(value==2){
                map.put("value",3);
            }
            else if(value==3){
                map.put("value",6);
            }
            else if(value==4){
                map.put("value",12);
            }
            else if(value ==5){
                map.put("value",24);
            }

            String sql = "select *from asset where type=:type and publishedTime<=:value";
            return mySQLSimpleDao.queryForList(sql,map);
        }
    }


    public List<Map<String, Object>> getSearchContent(int type,String content) {
        type = type+1;
        String sql = "select *from asset where  type=:type and name =:content";
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("type",type);
        map.put("content",content);
        return mySQLSimpleDao.queryForList(sql,map);
    }


}
