package com.citibank.service;

import com.citibank.dao.Page;

import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
public interface AppointService {
    public Page<Map<String, Object>> getAppoint(String userId, boolean isComplete, String columnName,String queryContent, int pageIndex,int pageSize);
}
