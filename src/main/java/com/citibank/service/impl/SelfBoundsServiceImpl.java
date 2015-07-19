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

    public Page<Map<String, Object>> getSelfBounds(String userId, int pageIndex, String queryContent) {
        Order order=new Order().asc("id");
        StringBuffer sb=new StringBuffer();
        sb.append("select * from appointment where id = ").append(userId);
        return mySQLSimpleDao.pageQuery(sb.toString(), new HashMap<String, Object>(), pageIndex, 10, order);
    }
}
