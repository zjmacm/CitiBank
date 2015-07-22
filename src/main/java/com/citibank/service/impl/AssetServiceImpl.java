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
                                                     String duration,int type) {
        StringBuffer sb = new StringBuffer("select s.createTime, s.investTime, s.investMoney" +
                " from stockcreditor s where userId = :user_id and createTime > :create_time and productType = :product_type");
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("user_id", userId);
        parms.put("create_time", getAimDate(duration));
        parms.put("product_type", type);
        if(!queryContent.equals("")) {
            sb.append(" and s.productName like %:product_name%");
            parms.put("product_name", queryContent);
        }
        return mySQLSimpleDao.pageQuery(sb.toString(), parms, pageIndex, 10, new Order().asc("id"));
    }

    public int getTotalMoney(String userId, String duration) {
        String sql = "select sum(investMoney) totalMoney from stockcreditor where userId = :user_id and createTime > :create_time";
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("user_id", userId);
        parms.put("create_time", getAimDate(duration));
        List<Map<String, Object>> results = mySQLSimpleDao.queryForList(sql, parms);
        return Integer.valueOf(results.get(0).get("totalMoney").toString());
    }

    public Page<Map<String, Object>> getInvestorStock(String userId, int pageIndex, String queryContent, String duration, int type) {
        StringBuffer sb = new StringBuffer("select c.secondId companyId, c.secondName companyName, p.baseAddress from contract c join company p " +
                "on c.secondId = p.companyId right join stockcreditor s on c.stockCreditorId = s.id " +
                "where c.firstId = :first_id and c.signTime < : sign_time");
        Map<String, Object> parms = new HashMap<String, Object>();
        parms.put("user_id", userId);
        parms.put("create_time", getAimDate(duration));
        if(type==1||type==0){
            sb.append(" and s.productType = :product_type");
            parms.put("product_type", type);
        }
        parms.put("product_type", type);
        if(!queryContent.equals("")) {
            sb.append(" and s.productName like %:product_name%");
            parms.put("product_name", queryContent);
        }
        return mySQLSimpleDao.pageQuery(sb.toString(), parms, pageIndex, 10, new Order().asc("id"));
    }

    private Date getAimDate(String duration){
        Calendar calendar=Calendar.getInstance();
        if(duration.equals("1_month")){
            calendar.add(calendar.MONTH, -1);
        }else if(duration.equals("3_month")){
            calendar.add(calendar.MONTH, -3);
        }else if(duration.equals("6_month")){
            calendar.add(calendar.MONTH, -6);
        }else if(duration.equals("1_year")){
            calendar.add(Calendar.YEAR, -1);
        }else{
            calendar.add(Calendar.YEAR, -2);
        }
        return calendar.getTime();
    }
}
