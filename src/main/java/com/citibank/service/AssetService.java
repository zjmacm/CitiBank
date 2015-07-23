package com.citibank.service;

import com.citibank.dao.Page;

import java.util.Map;

/**
 * Created by liwang on 15-7-21.
 */
public interface AssetService {
    public Page<Map<String, Object>> getCompanyStock(String userId, int pageIndex, String queryContent,
                                                     String duration, int type);

    public int getTotalMoney(String userId, String duration);

    public Page<Map<String,Object>> getInvestorStock(String userId, int pageIndex, String queryContent,
                                                     String duration, int type);
}
