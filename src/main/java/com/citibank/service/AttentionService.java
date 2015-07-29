package com.citibank.service;

import com.citibank.dao.Page;

import java.util.Map;

/**
 * Created by dell on 2015/7/28.
 */
public interface AttentionService{
    public Page<Map<String,Object>> getMyAttentionByCompanyId(Map<String,Object> reqs);
    public Page<Map<String,Object>> getMyAttentionByInvestorId(Map<String,Object> reqs);
}
