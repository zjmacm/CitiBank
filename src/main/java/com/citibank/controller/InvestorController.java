package com.citibank.controller;

import com.citibank.service.InvestorService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuhao on 15-7-14.
 */
@Controller("InvestorController")
@RequestMapping("/investor")
public class InvestorController {

    @Autowired
    private InvestorService investorService;

    @RequestMapping(value = "investorLogin.htm",method = RequestMethod.GET)
    public String getLoginPage()
    {
        return "/investor/investorLogin";
    }

}
