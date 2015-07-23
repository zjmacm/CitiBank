package com.citibank.service;

import com.citibank.dao.Page;
import javafx.beans.binding.ObjectExpression;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by liuhao on 15-7-15.
 */
public interface PersonalService {
    public Page<Map<String,Object>> orderByDefault( Map<String,Object> reqs);
    public Page<Map<String,Object>> orderByCompanyName( Map<String,Object> reqs);
    public Page<Map<String,Object>> orderByProductName( Map<String,Object> reqs);
    public Page<Map<String,Object>> orderByAttentionState( Map<String,Object> reqs);
    public Page<Map<String,Object>> orderByAttentionTime( Map<String,Object> reqs);
    public Page<Map<String,Object>> orderByProductType( Map<String,Object> reqs);
    public Page<Map<String,Object>> orderByKeyValue( Map<String,Object> reqs);
}
