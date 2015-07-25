package com.citibank.test;

import com.citibank.common.uploadFile;
import com.citibank.service.AppointService;
import com.citibank.service.CompanyService;
import com.citibank.service.InvestorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/datasource-config.xml")
public class SystemTest {

    @Autowired
    private AppointService appointService;

    @Autowired
    private InvestorService investorService;

    @Autowired
    private CompanyService comService;


    public uploadFile uploadImage = new uploadFile();


    @Test
    public void testSql(){
        //assetService.getTotalMoney("123","1_month");
        appointService.getAppoint("123", true, "name", "", 1, 10);
        investorService.getInvestorInfo("123");
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


}
