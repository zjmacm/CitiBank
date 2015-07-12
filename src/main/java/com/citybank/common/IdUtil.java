package com.citybank.common;
import java.util.UUID;

/**
 * 主键操作工具
 * @author zmy
 * @version 2014-07-03
 * 
 */
public class IdUtil {

	/**
	 * 产生�?个不含分隔符�?32位长度字符串
	 * @return 字符�?
	 */
	public static String uuid(){
		return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
	}

}
