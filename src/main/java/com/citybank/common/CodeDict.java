package com.citybank.common;

import java.util.Map;


public interface CodeDict {

	/**
	 * 获取�?个代码类别下代码键的�?
	 * @param category 代码类别
	 * @param code 代码�?
	 * @return 键�??
	 */
	public String getCode(String category, String code);
	
	/**
	 * 获取�?个代码类别下�?有代�?
	 * @param category 代码类别
	 * @return 存放代码的键值对的Map对象
	 */
	public Map<String, String> getCodes(String category);
	
	/**
	 * 获取�?有代码定�?
	 * @return 存放代码的键值对的Map对象
	 */
	public Map<String, Map<String, String>> getAllCodes();
	
}
