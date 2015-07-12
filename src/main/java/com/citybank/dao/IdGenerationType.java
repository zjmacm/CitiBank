package com.citybank.dao;

/**
 * 主键生成类型枚举
 * @author chenr
 * @version 2.0.0, 2011-6-22
 * 
 */
public enum IdGenerationType {

	/**
	 * 使用数据库内置机制自动生成主�?
	 */
	AUTO,
	
	/**
	 * 手动指定
	 */
	ASSIGN,
	
	/**
	 *  使用32�?16进制字符串，无中划线分隔�? 的UUID作为主键
	 */
	UUID,
	
	/**
	 *  数据库序列，各数据库不一�?
	 */
	SEQUENCE
}
