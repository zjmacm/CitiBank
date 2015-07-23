package com.citibank.test;

import com.citibank.service.AppointService;
import com.citibank.service.InvestorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void testSql(){
       // assetService.getTotalMoney("123","1_month");
        //appointService.getAppoint("123", true, "name", "", 1, 10);
        investorService.getInvestorInfo("123");
    }

}
