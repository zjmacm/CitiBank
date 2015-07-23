package com.citibank.service;

import com.citibank.dao.Page;

import java.util.Map;

/**
 * Created by Administrator on 2015/7/22.
 */
public interface VisitorService {

    public Page<Map<String,Object>> getPolicyList(int pageIndex);

    public Map<String,Object> getPolicyInfoDetail(String id);


    public Page<Map<String,Object>> getMarketList(int pageIndex);

    public Map<String,Object> getMarketInfoDetail(String id);


}
