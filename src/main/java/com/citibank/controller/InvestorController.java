package com.citibank.controller;

import com.citibank.common.IdUtil;
import com.citibank.mail.MailSender;
import com.citibank.service.InvestorService;


import com.citibank.service.impl.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
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
    @Autowired
    private UploadFileService uploadFileService;
    private final static String IMG_DESC_PATH = File.separator + "uploads" + File.separator;

    //投资者模式已登陆首页
    @RequestMapping(value = "/index.htm", method = RequestMethod.GET)
    public String getIndexPage()
    {
        return "investor/logined-invest-index";
    }
    @RequestMapping(value = "/login.htm", method = RequestMethod.GET)
    public String getLoginPage() {
        return "investor/investorLogin";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(@RequestParam Map<String, Object> reqs,
                          HttpSession session) {
        Map<String, Object> result = investorService.loginInvestor(reqs);
        if (result.get("result").equals("success")) {
            session.setAttribute("userId", result.get("id"));
            return "investor/index";
        } else {
            return "investor/login";
        }
    }

    @RequestMapping(value = "/register.htm", method = RequestMethod.GET)
    public String getRegisterPage() {
        return "investor/investorRegister";
    }


    @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
    public String doRegister(@RequestParam Map<String, Object> regs) {
        regs.put("id", IdUtil.uuid());
        Map<String, Object> map = new HashMap<String, Object>();
        map = investorService.registerInvestor(regs);
        String result = map.get("result").toString();
        if (result.equals("failed")) {
            return "investor/investorRegister";
        } else {
            MailSender.sendMail(regs.get("username").toString(), "恭喜您成功注册!");
            return "investor/completeInfo";
        }
    }

    @RequestMapping(value = "/doCompleteInfo", method = RequestMethod.POST)
    public String completeInfo(@RequestParam Map<String, Object> infos, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        String result = investorService.completeInfo(infos, userId);
        if (result.equals("failed")) {
            return "investor/completeInfo";
        } else {
            return "investor/index";
        }
    }

    @RequestMapping(value = "/completeInfo.htm", method = RequestMethod.GET)
    public String getCompleteInfoPage() {
        return "investor/completeInfo";
    }

    @RequestMapping(value = "/getUserInfo.htm", method = RequestMethod.GET)
    public String getUserInfo(HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("userId");
        map.putAll(investorService.getInvestorInfo(userId));
        return "common/userInfo";
    }

    @RequestMapping(value = "/saveUserInfo", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, String> saveUserInfo(@RequestParam Map<String, Object> parms, HttpSession session) {
        String userId = (String) session.getAttribute("userId");
        int result = investorService.saveInvestorInfo(parms, userId);
        Map<String, String> status = new HashMap<String, String>();
        if (result == 0) {
            status.put("result", "failed");
        } else {
            status.put("result", "success");
        }
        return status;
    }

    @RequestMapping(value = "/nextstep", method = RequestMethod.POST)
    public String getNextStepPage(@RequestParam("logoPath") CommonsMultipartFile multipartFile, @RequestParam Map<String, Object> reqs, HttpSession session,
                                  HttpServletRequest request) {
        String id = (String) session.getAttribute("investorId");
        String phoneNum = reqs.remove("firstNum").toString() + reqs.remove("secondNum").toString();
        reqs.put("consultPhone", phoneNum);
        String path = request.getSession().getServletContext().getRealPath("") + IMG_DESC_PATH;

        reqs.put("logoPath", uploadFileService.uploadFile(multipartFile, path));
        investorService.saveInvestorInfo(reqs, id);
        return "/investor/finsh-reg";
    }


}
