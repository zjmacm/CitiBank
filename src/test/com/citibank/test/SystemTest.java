package com.citibank.test;

import com.citibank.common.IdUtil;

import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import com.citibank.service.*;
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
    private FinancingService financingService;

    @Autowired
    private AttentionService attentionService;

    @Autowired
    private SelfBoundsService selfBoundsService;

    @Test
    public void testfid() {
        System.out.println(financingService.getDefault().getList());
    }

    @Test
    public void testSql() {
        //assetService.getTotalMoney("123","1_month");
        investorService.getInvestorInfo("123");
    }

    @Test
    public void testComReg() {
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("username", "zjm");
        map.put("password", "123");
        map.put("companyName", "1");
        map.put("companyType", "1");
        map.put("registerCapital", "10000");
        map.put("bussinessLicense", "123456");
        map.put("legalPresentative", "刘浩");
      /*  Date date = new Date();*/
       /* map.put("formedTime",date);*/
        /*map.put("officialWeb","http://www.google.com.hk");*/
        map.put("baseAddress", "newYork");
        map.put("registerAddress", "newYork");
        map.put("consultPhone", "010-110");
        map.put("workingFiled", "金融");
        map.put("majorAffair", "软件");
        map.put("revenueModels", "0");
        comService.userRegister(map);
    }

    @Test
    public void testBaseDao() {
        String id = IdUtil.uuid();
        String name = "zjmhaha";
        String pwd = "123456";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", id);
        map.put("userName", name);
        map.put("userPwd", pwd);
        map.put("userType", 0);
        mySQLSimpleDao.create("tp_users", map);
    }

    @Test
    public void testAppoint() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("companyId", "a"); //公司id
        map.put("pageIndex", 1);//数据起始位置
        map.put("flag", 0);//是否已读
        System.out.println(appointService.getAppoint(map).getList());
    }

    @Test
    public void testAttention() {
        Page<Map<String, Object>> page = selfBoundsService.getSelfBounds("292ABC3521394FDEB6F553E5BD0D3C49", 1, "", 0);
        System.out.println(page.getList().toString());
    }

    @Test
    public void getUUID() {
        System.out.println(IdUtil.uuid());
    }

}
