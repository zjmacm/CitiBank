package dao;

import com.citibank.dao.SimpleDao;
import com.citibank.dao.impl.BaseDaoImpl;

import java.util.HashMap;
import java.util.Objects;
import java.util.logging.Logger;

/**
 * Created by liuhao on 15-7-13.
 */
public class testDao{
    static Logger logger=Logger.getLogger
            (String.valueOf(testDao.class));
    public static void main(String [] args)
    {
        logger.info("hell");
        BaseDaoImpl baseDao=new BaseDaoImpl();
        HashMap<String,Object> map=new HashMap<String,Object>();
        map.put("name","hello");
        map.put("age",10);
        baseDao.create("info", map);
        logger.info("nihao");

    }

}
