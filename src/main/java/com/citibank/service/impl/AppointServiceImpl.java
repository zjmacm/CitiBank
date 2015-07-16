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

    public Page<Map<String, Object>> getAppoint(String userId, boolean isComplete, String columnName, String queryContent, int pageIndex,int pageSize) {
        StringBuffer sb=new StringBuffer();
        sb.append(isComplete?" where flag = 1 ":"");
        if(sb.length()!=0) {
            sb.append(queryContent == null ? "" : " and appointmentName like " + ConditionUtil.like(queryContent));
        }else{
            sb.append(queryContent == null ? "" : " where appointmentName like " + ConditionUtil.like(queryContent));
        }
        String sql="select appointmentName, contractWay, appointmentTime, submitTime from appointment"+sb.toString();
        Order order=new Order().asc(columnName);
        Page<Map<String, Object>> result = mySQLSimpleDao.pageQuery(sql, new HashMap<String, Object>(), pageIndex, pageSize, order);
        return result;
    }

}
