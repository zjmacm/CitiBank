package com.citibank.controller.investor;

import com.citibank.service.register.InvestorService;
import javafx.beans.binding.ObjectExpression;
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
    @RequestMapping(value = "investorLogin",method = RequestMethod.POST)
    public ModelAndView login(@RequestParam Map<String ,Object> reqs,
                              HttpSession session)
    {
        Map<String ,Object> mapResult=new HashMap<String,Object>();
        mapResult=investorService.loginInvestor(reqs);
        JSONObject jsonObject=JSONObject.fromObject(mapResult);
        if(mapResult.get("result")=="success")
        {
            session.setAttribute("id",mapResult.get("id"));
            return new ModelAndView("/investor/investorMain",
                    "mapResult",jsonObject.toString());
        }
        else
        {
            return new ModelAndView("/investor/investorLogin");
        }
    }
}
