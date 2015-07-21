package com.citibank.test;

import com.citibank.dao.ConditionUtil;
import com.citibank.dao.Order;
import com.citibank.dao.Page;
import com.citibank.dao.impl.MySQLSimpleDaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.StringBuffer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nikolas on 2015/7/16.
 */
public class SystemTest {




    public void getAppoint(String userId, boolean isComplete, String columnName, String queryContent, int pageIndex,int pageSize) {
        StringBuffer sb=new StringBuffer();
        sb.append(isComplete?" where flag = 1 ":"");
        if(sb.length()!=0) {
            sb.append(queryContent == null ? "" : " and appointmentName like " + ConditionUtil.like(queryContent));
        }else{
            sb.append(queryContent == null ? "" : " where appointmentName like " + ConditionUtil.like(queryContent));
        }
        String sql="select appointmentName, contractWay, appointmentTime, submitTime from appointment"+sb.toString();
        System.out.println(sql);
    }

    @Test
    public void pageTest(){
        getAppoint("123", false, "name",null, 1, 10);
    }



}
