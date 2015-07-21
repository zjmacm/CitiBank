package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.SelfBoundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
@Service
public class SelfBoundsServiceImpl implements SelfBoundsService {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public Page<Map<String, Object>> getSelfBounds(String userId, int pageIndex, String queryContent, int userType) {
        Order order=new Order().asc("id");
        StringBuffer sb=new StringBuffer();
        if(userType==0) {
            sb.append("select a.finishedTime, u.investIndustry as industry, s.productName from appointment a left join investor u on a.userId = u.investorId " +
                    "left join stockcreditor s on a.stockId = s.id where a.flag = 1 and a.userId = ").append(userId);
        }else{
            sb.append("select a.finishedTime, u.workingFiled as industry, s.productName from appointment a left join company u on a.userId = u.companyId " +
                    "left join stockcreditor s on a.stockId = s.id where a.flag = 1 and a.userId = ").append(userId);
        }
        return mySQLSimpleDao.pageQuery(sb.toString(), new HashMap<String, Object>(), pageIndex, 10, order);
    }
}
