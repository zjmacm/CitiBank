package com.citibank.service;


import com.citibank.dao.Page;

import java.util.Map;

/**
 * Created by zjm on 2015/7/21.
 */
public interface FinancingService {
    //撮合配对

    public Page<Map<String,Object>> getMatching(String userId,int userType,int pageIndex,String investArea,String investIndustry,int fundBody,int lowMoney, int highMoney);

    public Page<Map<String,Object>> getMatchingCompany(Map<String,Object> map,int pageIndex);





    //意向发布


    //业务洽谈


    //电子签约






}
