package test;

import com.citibank.common.uploadFile;
import com.citibank.service.impl.CompanyServiceImpl;
import com.citibank.service.impl.InvestorServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;

/**
 * Created by liuhao on 15-7-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:datasource-config.xml")
public class Testbase {
@Autowired
    private CompanyServiceImpl companyService;
    @Autowired
    private InvestorServiceImp investorServiceImp;

    @Autowired
    private uploadFile uploadFile;

    @Test
    public void testCompany()
    {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username","liuhao");
        map.put("password","123");
        map.put("companyName","broker");
        map.put("companyType",0);
        map.put("registerCapital",244);
        map.put("businessLisence","aaaa");
        map.put("legalPresentative","liuhao");
        map.put("formedTime",new Date());
        map.put("officialWeb","www.baidu.com");
        map.put("baseAddress","dalian");
        map.put("registerAddress","dalian");
        map.put("consultPhone", "188409484848");
        map.put("workingFiled", "it");
        map.put("majorAffair", "it co");
        map.put("revenueModels", 0);
        Map<String,Object> nMap=new HashMap<String, Object>();
        nMap.put("officialWeb", "www.tianmao.com");;
        //System.out.println(companyService.userRegister(map));
       // System.out.println(companyService.userLogin(map));
      //  System.out.println(companyService.userLogin(map));
        //System.out.println(companyService.confirmCompanyName(map));
        //System.out.println(companyService.confirmBussinessLisence(map));
        //System.out.println(companyService.getCompanyInfo("CD2F4BA3E4EF49BB9B1C42D0AAA2D694"));
        System.out.println(companyService.saveCompanyInfo(nMap, "CD2F4BA3E4EF49BB9B1C42D0AAA2D694"));


    }
    @Test
    public void testInvestor()
    {

        Map<String,Object> map=new HashMap<String, Object>();
        map.put("username","刘浩");
        map.put("password", "123456");
        map.put("investorName","刘浩");
        map.put("fundBody",222);
        map.put("companyName","大连");
        map.put("address","大连二舍");
        map.put("registeredCapital",222);
        map.put("legalRepresentative", "刘浩");
        map.put("legalRepresentativeMandator", "刘浩");
        map.put("companyScale", "大连");
        map.put("totalMoney", 333);
        map.put("contactWay", "qq");
        map.put("companyArea", "大连");
        map.put("investArea", "大连");
        map.put("investField", "软件");
        map.put("investStage", 0);
        map.put("investPeriod", "八十年代");
        Map<String,Object> mapc=new HashMap<String, Object>();
        mapc.put("investIndustry", "hangzouali");

        Map<String,Object> mapnew=new HashMap<String, Object>();
        mapnew.put("fundBody",11111);
        mapnew.put("username","2537945384@qq.com");
        //System.out.println(investorServiceImp.registerInvestor(map));
        //System.out.println("registerInvestor" + investorServiceImp.registerInvestor(map));
        //System.out.println("loginInvestor:"+investorServiceImp.loginInvestor(map));
        //System.out.println("complete:"+investorServiceImp.completeInfo(mapc,"C363DF0894D044639F9EFB40B6A20BBA"));
        //System.out.println("hasEmail:"+investorServiceImp.hasEmail("2537945384@qq.com"));
        //System.out.println("getInvestorInfo:"+investorServiceImp.getInvestorInfo("C363DF0894D044639F9EFB40B6A20BBA"));
        //System.out.println("saveInvestorInfo:" + investorServiceImp.saveInvestorInfo(mapnew, "C363DF0894D044639F9EFB40B6A20BBA"));
    }

    @Test
    public void testUploadImage(){


    }





}

