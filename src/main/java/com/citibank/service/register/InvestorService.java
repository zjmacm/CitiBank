package com.citibank.service.register;

import java.util.Map;

/**
 * Created by liuhao on 15-7-14.
 */
public interface InvestorService {
    /**
     *
     * @param reqs 注册请求信息
     * @return result 1."repeat":数据库中已经有该用户名
     * 2."success"成功
     * 3."failed"注册失败"
     */
    public String registerInvestor(Map<String,Object> reqs);

    /**
     *
     * @param reqs 登陆信息
     * @return key1:"result" value:"success"(成功) "fail:(失败)
     * key2:"id" value:用户id int型
     */
    public Map<String, Object> loginInvestor(Map<String, Object> reqs);
}
