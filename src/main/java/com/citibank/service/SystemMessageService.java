package com.citibank.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by mrtian on 2015/7/16.
 */
public interface SystemMessageService {
    public List<Map<String,Object>> getAllMessage();
    public List<Map<String,Object>> getMessageByDate(Map<String, Object> reqs);
    public List<Map<String,Object>> getMessageByContent(Map<String, Object> reqs);

}
