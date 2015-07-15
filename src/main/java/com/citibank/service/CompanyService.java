package com.citibank.service;

import java.util.Map;

/**
 * Created by Administrator on 2015/7/13.
 */
public interface CompanyService {
    public String userRegister(Map<String,Object> reqs);

    public Map<String,Object> userLogin(Map<String,Object> reqs);

    public Integer getUserType(String user_id);


}
