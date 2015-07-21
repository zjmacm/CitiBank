package com.citibank.controller;

import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.entity.Investor;
import com.citibank.service.impl.IntentionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by liuhao on 15-7-21.
 */
@Controller
@RequestMapping("/investor")
public class IntentionController {
    @Autowired
    private IntentionServiceImpl intentionService;
    @Autowired
    private MySQLSimpleDaoImpl simpleDao;
    @RequestMapping("/intention.htm")
    public Map<String,Object> investorInfo(HttpSession session)
    {
        String investorid= (String) session.getAttribute("userId");
        Map<String,Object> result=intentionService.getInvestorinfoById(investorid);
        return result;

    }
    @RequestMapping("/intentionPublish")
    public Map<String,Object> intentionPublish(@RequestParam Map<String,Object> reqs)
    {
        Map<String,Object> map=new HashMap<String, Object>();
        if(intentionService.publishIntention(reqs))
        {
            map.put("result","suceess");
        }
        else
        {
            map.put("result","fail");
        }
        return map;
    }

}
