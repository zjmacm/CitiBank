package com.citibank.controller;

import com.citibank.service.impl.ElectronicalContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhao on 15-7-22.
 */
@Controller("ElectronicalContractController")

public class ElectronicalContractController {
    @Autowired
    private ElectronicalContractServiceImpl electronicalContractService;
    //跳转到签合同页面
    @RequestMapping("/signContract")
    public ModelAndView getSignContractPage()
    {
        Map<String,Object> result=new HashMap<String, Object>();
        result.put("oppositors",electronicalContractService.getOppositorList());
        return new ModelAndView("signContractPage","oppositors",result);
    }
    //单选公司然后出现合同内容
    @RequestMapping("/getContractContent")
    public Map<String,Object> getContractContent(@RequestParam Map<String,Object> reqs)
    {
        String id= (String) reqs.get("id");
        return electronicalContractService.getStateZeroOppositor(id);
    }
    //点击协议查询返回默认按时间排序
    @RequestMapping("/checkContract")
    public ModelAndView checkContract()
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("result",electronicalContractService.orderByTime());
        return new ModelAndView("checkContract","result",map);
    }

}
