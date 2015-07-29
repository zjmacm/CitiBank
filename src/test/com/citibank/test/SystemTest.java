package com.citibank.test;

import com.citibank.common.IdUtil;

import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.*;
import net.sf.json.JSONArray;
import com.citibank.service.AppointService;
import com.citibank.service.CompanyService;
import com.citibank.service.InvestorService;
import com.citibank.service.impl.IntentionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

/**
 * Created by Nikolas on 2015/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/datasource-config.xml")
public class SystemTest {

    @Autowired
    private MySQLSimpleDaoImpl mySQLSimpleDao;

    @Autowired
    private AppointService appointService;

    @Autowired
    private InvestorService investorService;

    @Autowired
    private CompanyService comService;

    @Autowired
    private IntentionServiceImpl intentionService;
	
    @Autowired
    private SystemMessageService systemMessageService;

    @Test
    public void testIntention()
    {

    }

    @Test
    public void testSql(){
        //assetService.getTotalMoney("123","1_month");
        appointService.getAppoint("123", true, "name", "", 1, 10);
        investorService.getInvestorInfo("123");
    }
    @Test
    public void testH()
    {
        System.out.println("HHHHHHHHHH");
    }

    @Test
    public void test(){
        System.out.println("Hello");
    }

    @Test
    public void testComReg(){
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("username","zjm");
        map.put("password","123");
        map.put("companyName","1");
        map.put("companyType","1");
        map.put("registerCapital","10000");
        map.put("bussinessLicense","123456");
        map.put("legalPresentative","刘浩");
      /*  Date date = new Date();*/
       /* map.put("formedTime",date);*/
        /*map.put("officialWeb","http://www.google.com.hk");*/
        map.put("baseAddress","newYork");
        map.put("registerAddress","newYork");
        map.put("consultPhone","010-110");
        map.put("workingFiled","金融");
        map.put("majorAffair","软件");
        map.put("revenueModels","0");
       comService.userRegister(map);
    }

    @Test
    public void testBaseDao(){
        String id = IdUtil.uuid();
        String name = "zjmhaha";
        String pwd = "123456";
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("userId",id);
        map.put("userName",name);
        map.put("userPwd",pwd);
        map.put("userType",0);
        mySQLSimpleDao.create("tp_users", map);
    }
    @Test
    public void testAttention()
    {
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("companyId", "a");
        map.put("pageIndex",1);
        Page page = systemMessageService.getMessageById(map,0);
        System.out.println(page.getList().toString());
        //System.out.println(jsonArray);
    }



}
