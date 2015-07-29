package com.citibank.service.impl;

import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.AttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by dell on 2015/7/28.
 */
@Service
public class AttentionServiceImpl implements AttentionService {
    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    public MySQLSimpleDaoImpl getMySQLSimpleDao() {
        return mySQLSimpleDao;
    }

    public void setMySQLSimpleDao(MySQLSimpleDaoImpl mySQLSimpleDao) {
        this.mySQLSimpleDao = mySQLSimpleDao;
    }

    public Page<Map<String, Object>> getMyAttentionByCompanyId(Map<String, Object> reqs)
    {
        String sql = "select investor.username,attention.investorId,attentionState,productName,attention.productType from investor,stockcreditor,attention WHERE attention.investorId = investor.investorId AND attention.stockCreditorId = stockcreditor.id AND attention.companyId =:companyId";
        int pageSize = 10;
        String companyId = (String)reqs.get("companyId");
        int pageIndex = Integer.parseInt(reqs.get("pageIndex").toString());
        System.out.println(companyId+"   "+pageIndex);
        Order order=new Order().asc("companyId");
        Page<Map<String, Object>> page = mySQLSimpleDao.pageQuery(sql,reqs,pageIndex,pageSize,order);
        if(page.getSize() > 0)
        {
            System.out.println("找到page!");
            return page;
        }
        else {
            System.out.println("没找到page!");
            return null;
        }
    }

    public Page<Map<String, Object>> getMyAttentionByInvestorId(Map<String, Object> reqs)
    {
        String sql = "select company.username,attention.companyId,attention.investorId,attentionState,productName,attention.productType from company,stockcreditor,attention WHERE attention.companyId=company.companyId AND attention.stockCreditorId = stockcreditor.id AND attention.investorId =:investorId";
        int pageSize = 10;
        String companyId = (String)reqs.get("investorId");
        int pageIndex = Integer.parseInt(reqs.get("pageIndex").toString());
        System.out.println(companyId+"   "+pageIndex);
        Order order=new Order().asc("companyId");
        Page<Map<String, Object>> page = mySQLSimpleDao.pageQuery(sql,reqs,pageIndex,pageSize,order);
        if(page.getSize() > 0)
        {
            System.out.println("找到page!");
            return page;
        }
        else {
            System.out.println("没找到page!");
            return null;
        }
    }
}
