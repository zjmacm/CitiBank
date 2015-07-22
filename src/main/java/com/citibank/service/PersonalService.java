package com.citibank.service;

import com.citibank.dao.Page;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by liwang on 15-7-21.
 */
public interface PersonalService {
    public Page<Map<String, Object>> orderByDefault(@RequestParam Map<String, Object> reqs);
    public Page<Map<String, Object>> orderByCompanyName(@RequestParam Map<String, Object> reqs);
    public Page<Map<String, Object>> orderByProductName(@RequestParam Map<String, Object> reqs);
    public Page<Map<String, Object>> orderByAttentionState(@RequestParam Map<String, Object> reqs);
    public Page<Map<String, Object>> orderByAttentionTime(@RequestParam Map<String, Object> reqs);
    public Page<Map<String, Object>> orderByProductType(@RequestParam Map<String, Object> reqs);
    public Page<Map<String, Object>> orderByKeyValue(@RequestParam Map<String, Object> reqs);
}
