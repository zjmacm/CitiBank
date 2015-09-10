package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.FinancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.rmi.dgc.Lease;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by zjm on 2015/7/21.
 * 公司的撮合配对
 * 加上投资者的撮合配对
 */

@Service("FinancingService")
public class FinancingServiceImpl implements FinancingService {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public MySQLSimpleDaoImpl getMySQLSimpleDao() {
        return mySQLSimpleDao;
    }

    public void setMySQLSimpleDao(MySQLSimpleDaoImpl mySQLSimpleDao) {
        this.mySQLSimpleDao = mySQLSimpleDao;
    }

    public Page<Map<String, Object>> getMatching(String userId,
                                                 int userType,
                                                 int pageIndex,
                                                 String investArea,
                                                 String investIndustry,
                                                 int fundBody,
                                                 int lowMoney,
                                                 int highMoney,
                                                 double leastDemand,
                                                 double highestDemand) {
        Order order = new Order().asc("id");
        StringBuffer sb = new StringBuffer();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("investArea", investArea);
        map.put("investIndustry", investIndustry);
        map.put("fundBody", fundBody);
        map.put("lowMoney", lowMoney);
        map.put("highMoney", highMoney);
        map.put("least", leastDemand);
        map.put("highest", highestDemand);
        if (userType == 0) {

            sb.append("select s.productName,s.investType,s.investArea,s.investMoney,s.investorName,v.investorName from stockcreditor s left join  investor i " +
                    "on s.userId = i.investorId where 1 = 1");

            if (investArea != "") {
                sb.append(" and investArea=:investArea");
            }
            if (investIndustry != "") {
                sb.append(" and investIndustry=:investIndustry");
            }
            if (fundBody != -1) {
                sb.append(" and fundBody=:fundBody");
            }
            if (lowMoney != -1 && highMoney != -1) {
                sb.append(" and investMoney between :lowMoney and :highMoney");
            }
            if (highestDemand != -1 && leastDemand != -1) {
                sb.append(" and leastReturnDemand between :leastDemand and :highestDemand");
            }
            sb.append(";");

        }
        return mySQLSimpleDao.pageQuery(sb.toString(), map, pageIndex, 10, order);

    }

    public Page<Map<String, Object>> getDefaultCompany() {
        String sql="select s.*, c.* from " +
                "stockcreditor as s,company as c where " +
                "s.userId=c.companyId";
        return mySQLSimpleDao.pageQuery(sql, new HashMap<String, Object>(), 1, 10, new Order());
    }
    public Page<Map<String,Object>> getDefaultInvestor()
    {
        String sql="select s.*, i.username from " +
                "stockcreditor as s,investor as i where " +
                "s.userId=i.investorId";
        return mySQLSimpleDao.pageQuery(sql, new HashMap<String, Object>(), 1, 10, new Order());

    }
    //通过搜索名称和产品类型
    public Page<Map<String,Object>> getProductByNameAndType(Map<String,Object> req)
    {
        String sql="select * from stockcreditor where productName:=productName and " +
                "productType:=productType";
        return mySQLSimpleDao.pageQuery(sql,req,1,10,new Order());
    }
    //通过搜索名称
    public Page<Map<String, Object>> getProductByName(Map<String, Objects> reqs)
    {
        String sql="select * from stockcreditor where productName:=productName";
        return mySQLSimpleDao.pageQuery(sql,reqs,1,10,new Order());

    }

    public Page<Map<String, Object>> getMatchingCompany(Map<String, Object> map, int pageIndex) {
        String sql = "select * from stockcreditor where investArea=:investArea " +
                "and investIndustry=:investIndustry and investMoney between :lowMoney and :highMoney " +
                "and creditRank between :lowCreditRank and :highCreditRank and leastReturnDemand between :lowLeastReturnDemand and :highLeastReturnDemand";
        Order order = new Order().asc("productName");
        return mySQLSimpleDao.pageQuery(sql, map, (pageIndex - 1) * 10 + 1, 10, order);

    }

}