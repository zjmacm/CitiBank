package com.citibank.test;

import com.citibank.service.AssetService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by liwang on 15-7-30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/datasource-config.xml")
public class AssetServiceTest {

    @Autowired
    private AssetService assetService;

    public void testCompany(){
        assetService.getCompanyStock("")
    }

}
