package com.citibank.controller;

import com.citibank.dao.Page;
import com.citibank.mail.MailSender;
import com.citibank.service.*;
import com.citibank.service.impl.UploadFileService;
import com.citibank.utils.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by zjm on 2015/7/13.
 */

@Controller("CompanyController")
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private UploadFileService uploadFileService;

    @Autowired
    private FinanceService financeService;

    @Autowired
    private ReportService reportService;

    @Autowired
    private SystemMessageService systemMessageService;

//    @Autowired
//    private AppointService appointService;

    @Autowired
    private AttentionService attentionService;

    private final static String IMG_DESC_PATH = Constant.uploadPath;

    //企业模式已登陆首页
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexPage(Map<String, Object> map) {
        List<Map<String, Object>> policy = reportService.getInformation(7);
        List<Map<String, Object>> market = reportService.getInformation(8);
        map.put("policy", policy);
        map.put("market", market);
        return "company/logined-business-index";
    }

    //我的关注
    @RequestMapping(value = "/ifollow.htm", method = RequestMethod.GET)
    public String getIfollowPage(@RequestParam(value = "column", required = false, defaultValue = "id") String column,
                                 @RequestParam(value = "queryContent", required = false, defaultValue = "") String queryContent,
                                 HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("userId");
        Page results = attentionService.getMyAttentionByCompanyId(userId, 1, column);
        map.put("attention", results.getList());
        System.out.println(results.getList().toString());
        return "company/personal-attiontion";
    }

    //查看更多投资人
    @RequestMapping(value = "/more_investor.htm", method = RequestMethod.GET)
    public String getMore_investorPage() {
        return "company/user-corporate-mode-finance-patch";
    }

    //我的消息
    @RequestMapping(value = "/inews.htm", method = RequestMethod.GET)
    public String getInewsPage(Map<String, Object> map) {
        //返回系统消息,首先得获取公司id.
        Map<String, Object> map0 = new HashMap<String, Object>();
        map0.put("companyId", "a");//公司id;
        map0.put("pageIndex", 1);//数据起始位置
        Page page = systemMessageService.getSystemMessage(map0, 0);//0代表企业
        List<Map<String, Object>> results = page.getList();
        map.put("system_message", results);
        return "company/private-center-my-news";
    }

    //私信
    @RequestMapping(value = "/p_letter", method = RequestMethod.GET)
    public String getP_letterPage() {
        return "company/personal_center_my_message_privately_down";
    }

    //定向披露
    @RequestMapping(value = "/d_disclosure", method = RequestMethod.GET)
    public String getD_disclosurePage() {
        return "company/personal_center_my_message_direction_down";
    }

    //预约管理
//    @RequestMapping(value = "/reservation/{type}", method = RequestMethod.GET)
//    public String getReservationPage(@PathVariable("type") int type, HttpSession session, Map<String, Object> map) {
//        map.put("user_id", session.getAttribute("userId")); //公司id
//        map.put("pageIndex", 1);//数据起始位置
//        map.put("flag", type);//是否已读
//        Page page = appointService.getAppoint(map);
//        List<Map<String, Object>> results = page.getList();
//        map.put("manage_message_current", results);
//        return "company/reservation-management-current-reservation";
//    }

//    @RequestMapping(value = "/compReser/{reserId}/{type}", method = RequestMethod.GET)
//    public String completeReservation(@PathVariable(value = "reserId") String reserId,
//                                      @PathVariable(value = "type") int type,
//                                      HttpSession session, Map<String, Object> map) {
//        appointService.completeReservation(reserId);
//        map.put("user_id", session.getAttribute("userId")); //公司id
//        map.put("pageIndex", 1);//数据起始位置
//        map.put("flag", type);//是否已读
//        Page page = appointService.getAppoint(map);
//        List<Map<String, Object>> results = page.getList();
//        map.put("manage_message_current", results);
//        return "company/reservation-management-current-reservation";
//    }
//
//    当前预约
//    @RequestMapping(value = "/reservation_current.htm", method = RequestMethod.GET)
//    public String getReservation_currentPage(Map<String,Object> map)
//    {
//        map.put("companyId","a"); //公司id
//        map.put("pageIndex",1);//数据起始位置
//        map.put("flag",0);//是否已读-未读
//        Page page = appointService.getAppoint(map);
//        List<Map<String,Object>> results = page.getList();
//        map.put("manage_message_current",results);
//        return "company/reservation-management-current-reservation";
//    }
//
//    已完成预约
//    @RequestMapping(value = "/reservation_finish.htm", method = RequestMethod.GET)
//    public String getReservation_finishPage(Map<String,Object> map)
//    {
//        map.put("companyId","a"); //公司id
//        map.put("pageIndex",1);//数据起始位置
//        map.put("flag",1);//是否已读-已读
//        Page page = appointService.getAppoint(map);
//        List<Map<String,Object>> results = page.getList();
//        map.put("manage_message_finish",results);
//        return "company/reservation-management-finished-reservation";
//    }

    //资料管理
    @RequestMapping(value = "/isource", method = RequestMethod.GET)
    public String getIsourcePage(HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("userId");
        Map<String, Object> userInfo = companyService.getCompanyInfo(userId);
        userInfo.put("logo", "/uploads/" + userInfo.get("logo"));
        map.put("userInfo", userInfo);
        return "company/data_management-edit";
    }

    //退出按钮
    @RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
    public String getLogoutPage() {
        return "visitor/login";
    }

    //跳转到公司融资板块的界面
    @RequestMapping(value = "/finance.htm", method = RequestMethod.GET)
    public String getFinancePage() {
        return "company/user-corporate-mode-finance-patch";
    }

    //融资板块-撮合配对
    @RequestMapping(value = "/management.htm", method = RequestMethod.GET)
    public String getMacthing() {
        return "company/user-corporate-mode-finance-patch";
    }


    //跳转到公司信息发布的界面-中心公告
    @RequestMapping(value = "/invest.htm", method = RequestMethod.GET)
    public String getInformationPage() {
        return "company/logined-company-issue";
    }

    //信息发布-私募债列表
    @RequestMapping(value = "/private-list.htm", method = RequestMethod.GET)
    public String getPrivateList() {
        return "company/message-publish-private-list";
    }

    //信息发布-我要发布
    @RequestMapping(value = "/message-publish.htm", method = RequestMethod.GET)
    public String getMessagePublishPage() {
        return "company/message-publish-my-publish";
    }


    //跳转到公司资产管理的界面-股权管理
//    @RequestMapping(value = "/service.htm",method = RequestMethod.GET)
//    public String getServicePage(){ return "/company/logined-company-proprety-debat";}

    //资产管理-债权管理
//    @RequestMapping(value ="/stock-manag.htm",method = RequestMethod.GET)
//    public String getServicedebatPage(){ return "/company/logined-company-proprety";}

    //公司电子签约未完成
    @RequestMapping(value = "/invetfinane.htm", method = RequestMethod.GET)
    public String getSignPage() {
        return "company/undefined-financing-sign";
    }

    //二级目录 融资板块-电子签约-协议查询
    @RequestMapping(value = "/xieyichaxun.htm", method = RequestMethod.GET)
    public String getXieyichaxunPage() {
        return "company/inquiry-protocol-detail";
    }

    //电子签约-返回
    @RequestMapping(value = "/xieyifanhui.htm", method = RequestMethod.GET)
    public String getSign2Page() {
        return "company/undefined-financing-sign";
    }


    //意向发布 私募股权
    @RequestMapping(value = "/esignature.htm", method = RequestMethod.GET)
    public String getInventionPage() {
        return "company/financing-publish";
    }

    //意向发布 私募债
    @RequestMapping(value = "/simuzhai.htm", method = RequestMethod.GET)
    public String getInvention2Page() {
        return "/company/release_privately_raised_bonds";
    }


    @RequestMapping(value = "/getCompanyInfo", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> getCompanyInfo(HttpSession session) {
        Map<String, Object> map = new HashMap<String, Object>();
        String userId = session.getAttribute("userId").toString();
        map = companyService.getCompanyInfo(userId);
        return map;
    }

    @RequestMapping(value = "confirmBussinessLisence", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> confirmBussinessLicense(@RequestParam Map<String, Object> reqs) {
        Map<String, Object> map = new HashMap<String, Object>();
        String result = companyService.confirmBussinessLisence(reqs);
        map.put("check", result);
        return map;
    }

    @RequestMapping(value = "/companyRegister", method = RequestMethod.POST)
    public ModelAndView userRegister(@RequestParam Map<String, Object> reqs) {
        //new一个模型
        ModelAndView model = new ModelAndView();
        String result = companyService.userRegister(reqs).get("result").toString();
        if (result.equals("success")) {
            MailSender.sendMail(reqs.get("username").toString(), "恭喜您注册成功");
        }
        model.addObject("result", result);
        return model;
    }

    @RequestMapping(value = "/getUserInfo.htm", method = RequestMethod.GET)
    public String getUserInfo(HttpSession session, Map<String, Object> map) {
        String userId = (String) session.getAttribute("companyId");
        map.putAll(companyService.getCompanyInfo(userId));
        return "common/userInfo";
    }

    @RequestMapping(value = "/saveUserInfo", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, String> saveUserInfo(@RequestParam Map<String, Object> parms, HttpSession session) {
        String userId = (String) session.getAttribute("companyId");
        int result = companyService.saveCompanyInfo(parms, userId);
        Map<String, String> status = new HashMap<String, String>();
        if (result == 0) {
            status.put("result", "failed");
        } else {
            status.put("result", "success");
        }
        return status;
    }

    @RequestMapping(value = "/saveFinance", method = RequestMethod.POST)
    public Map<String, Object> saveFinance(@RequestParam Map<String, Object> params,
                                           HttpSession session) {
        String userId = (String) session.getAttribute("companyId");
        params.put("companyId", userId);
        Map<String, Object> result = financeService.saveFinance(params);
        return result;
    }

    @RequestMapping(value = "/nextstep", method = RequestMethod.POST)
    public String saveInfo(@RequestParam("logo") CommonsMultipartFile multipartFile, @RequestParam Map<String, Object> reqs, HttpSession session,
                           HttpServletRequest request) {
        String id = (String) session.getAttribute("companyId");
        String phoneNum = reqs.remove("firstNum").toString() + reqs.remove("secondNum").toString();
        reqs.put("consultPhone", phoneNum);
        String path = request.getSession().getServletContext().getRealPath("") + IMG_DESC_PATH;
        reqs.put("logo", uploadFileService.uploadFile(multipartFile, path));
        companyService.saveCompanyInfo(reqs, id);
        return "/investor/finsh-reg";
    }


}
