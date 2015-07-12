package com.citybank.dao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * POJO映射到数据库表的列标�?;
 * 标记值为对应表的字段名称，默认为空串
 * @author chenr
 * @version 2.0.0, 2011-6-22
 * @see cn.com.higinet.rapid.base.dao.Table
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
	String value() default "";
}
