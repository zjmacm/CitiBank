package com.citibank.service;

import java.util.Map;
import java.util.Objects;

/**
 * Created by liuhao on 15-7-14.
 */
public interface InvestorService {
    public String registerInvestor(Map<String, Object> reqs);
    public Map<String,Object> loginInvestor(Map<String,Object> reqs);
    public String completeInfo(Map<String, Objects> infos, String userId);
    public boolean hasEmail(String email);
}
