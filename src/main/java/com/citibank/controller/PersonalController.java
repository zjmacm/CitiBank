package com.citibank.controller;

import com.citibank.service.PersonalService;
import com.citibank.service.impl.PersonalServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhao on 15-7-22.
 */
@Controller("PersonalController")
public class PersonalController {
    @Autowired
    private PersonalServiceImp personalServiceImp;
    @RequestMapping("/orderByDefault")
    public Map<String,Object> orderByDefault(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",personalServiceImp.orderByDefault(reqs));
        return map;
    }
    @RequestMapping("/orderByCompanyName")
    public Map<String,Object> orderByCompanyName(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",personalServiceImp.orderByCompanyName(reqs));
        return map;
    }
    @RequestMapping("/orderByProductName")
    public Map<String,Object> orderByProductName(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",personalServiceImp.orderByProductName(reqs));
        return map;
    }
    @RequestMapping("/orderByDefault")
    public Map<String,Object> orderByAttentionState(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",personalServiceImp.orderByAttentionState(reqs));
        return map;
    }
    @RequestMapping("/orderByDefault")
    public Map<String,Object> orderByAttentionTime(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",personalServiceImp.orderByAttentionTime(reqs));
        return map;
    }
    @RequestMapping("/orderByDefault")
    public Map<String,Object> orderByProductType(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",personalServiceImp.orderByProductType(reqs));
        return map;
    }
    @RequestMapping("/orderByKeyValue")
    public Map<String,Object> orderByKeyValue(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",personalServiceImp.orderByKeyValue(reqs));
        return map;
    }

}
