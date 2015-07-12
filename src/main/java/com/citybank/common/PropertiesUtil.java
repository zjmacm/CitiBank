package com.citybank.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.util.PropertyPlaceholderHelper.PlaceholderResolver;

/**
 * 属性文件加载工具类
 * @author zmy
 * @version 2014-07-01
 */
public class PropertiesUtil {
	
//	private static final String PROPERTIES_SUFFIX = ".properties";
	/**
	 * xml后缀结尾的属性文件
	 */
	private static final String XML_SUFFIX = ".xml";


	/**
	 * 加载一个属性文件，返回属性集合对象
	 * @param path 路径 （使用类加载器相对路径）
	 * @return 属性集合对象
	 * @throws java.io.IOException
	 */
	public static Properties load(String path) throws IOException{
		Properties p = new Properties();
//		InputStream in  = ClassLoader.getSystemResourceAsStream(path);//tomcat下面不好使用
		
		if (path!=null && !path.substring(0, 1).equals("/")) {
			path = "/"+path;
		}
		InputStream in  = PropertiesUtil.class.getResourceAsStream(path);
		try {
			if(path.endsWith(XML_SUFFIX)){
				p.loadFromXML(in);
			}else{
				p.load(in);
			}
		} finally {
				in.close();
		}
		return p;
	}
}
