package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.FinancingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zjm on 2015/7/21.
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

    @Override
    public Page<Map<String, Object>> getMatching(String userId, int userType, int pageIndex, String investArea, String investIndustry,
                                                 int fundBody, int lowMoney, int highMoney) {
        Order order = new Order().asc("id");
        StringBuffer sb = new StringBuffer();
        //
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("investArea", investArea);
        map.put("investIndustry", investIndustry);
        map.put("fundBody", fundBody);
        map.put("lowMoney", lowMoney);
        map.put("highMoney", highMoney);
        if (userType == 0) {
            sb.append("select i.productName,i.investType,i.investArea,i.investMoney,i.investorName from investor i where 1 = 1");
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
            sb.append(";");

        }

        return mySQLSimpleDao.pageQuery(sb.toString(), map, pageIndex, 10, order);

    }

}