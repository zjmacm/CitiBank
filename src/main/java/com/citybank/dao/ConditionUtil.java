package com.citybank.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 条件表达式拼装工�?;
 * @author chenr
 * @version 2.0.0, 2011-6-22
 * 
 */
public class ConditionUtil {

	/**
	 * 条件连接关系符：AND
	 */
	public static final String AND = " AND ";
	/**
	 * 条件连接关系符：OR
	 */
	public static final String OR = " OR ";
	
	
	/**
	 * 拼装�?个where到条件表达式前面
	 * @param s 条件表达�?
	 * @return �?"WHERE"的条件表达式
	 */
	public static String where(String s){
		if(!isEmpty(s)){
			return " WHERE " + s;
		}
		return "";
	}
	
	/**
	 * 拼装like的模糊查询的通配�?(%?%)
	 * @param s 字符�?
	 * @return 前后�?"%"的字符串
	 */
	public static String like(String s){
		return like(s, "%?%");
	}
	
	/**
	 * 拼装like的模糊查�?,使用指定的�?�配符模�?
	 * @param s 字符�?
	 * @param pattern 模板字符串，其中?将被传入字符串替�?
	 * @return 字符�?
	 */
	public static String like(String s, String pattern){
		if(isEmpty(s)) return s;
		return pattern.replaceAll("\\?", s);
	}
	
	/**
	 * 与连接查询条�?,条件数组格式如下�?
	 * <p>
	 * {$op, $sqlParamName, $namedParamName}<br />
	 * 其中�?
	 * <ul><li>$op：条件表达式操作关系符（= �?<> �? > �? <  �?>= �?<=、like等）</li>
	 * <li>$sqlParamName：条件表达式中字段名</li>
	 * <li>$namedParamName：传入Map中的键名�?</li></ul></p>
	 * <p>
	 * 例如:
	 * <code>
	 * {"=", "psid", "psid"},
	 * {"like", "p.psname", "psname"}
	 * </code>
	 * </p>
	 * @param map 包含条件表达式中名称参数键的Map
	 * @param condArr 条件表达式的拼装参数数组
	 * @return AND连接的条件表达式
	 */
	public static String and(Map<String, String> map, String[][] condArr){
		if(condArr == null || map == null || map.size() == 0) return "";
		return joinArray(conds(map, condArr), AND);
	}
	
	/**
	 * 或连接查询条�?,条件数组格式如下�?
	 * <p>
	 * {$op, $sqlParamName, $namedParamName}<br />
	 * 其中�?
	 * <ul><li>$op：条件表达式操作关系符（= �?<> �? > �? <  �?>= �?<=、like等）</li>
	 * <li>$sqlParamName：条件表达式中字段名</li>
	 * <li>$namedParamName：传入Map中的键名�?</li></ul></p>
	 * <p>
	 * 例如:
	 * <code>
	 * {"=", "psid", "psid"},
	 * {"like", "p.psname", "psname"}
	 * </code>
	 * </p>
	 * @param map 包含条件表达式中名称参数键的Map
	 * @param condArr 条件表达式的拼装参数数组
	 * @return OR连接的条件表达式
	 */
	public static String or(Map<String, String> map, String[][] condArr){
		if(condArr == null || map == null || map.size() == 0) return "";
		return joinArray(conds(map, condArr), OR);
	}
	
	/**
	 * 拼装�?个命名参数查询的条件表达�?
	 * @param op 操作关系符（= �?<> �? > �? <  �?>= �?<=�?
	 * @param sqlParamName sql中的参数名称
	 * @param namedParamName 用于Spring 的NamedParameterJdbcTemplate使用的命名参�?
	 * @return 拼装好的带命名参数的条件表达�?
	 */
	private static String makeNamedParameterSql(String op, String sqlParamName, String namedParamName){
		StringBuffer sb = new StringBuffer();
		sb.append(sqlParamName).append(' ').append(op)
		.append(" :").append(namedParamName);
		return sb.toString();
	}

	/**
	 * 是否为空�?
	 * @param s 字符�?
	 * @return boolean�?
	 */
	private static boolean isEmpty(String s){
		return null == s || "".equals(s);
	}
	
	/**
	 * 条件的�?�择拼装
	 * @param map 包含条件表达式中名称参数键的Map
	 * @param condArr 条件表达式的拼装参数数组
	 * @return 条件表达式列�?
	 */
	private static List<String> conds(Map<String, String> map, String[][] condArr){
		List<String> list = new ArrayList<String>();
		if(condArr != null && map != null){ 
			for(String[] c : condArr){
				if(c != null && c.length == 3 && !isEmpty(map.get(c[2]))){
					String cond = makeNamedParameterSql(c[0], c[1], c[2]);
					if(cond.length() > 0)
						list.add(cond);
				}
			}
		}
		return list;
	}
	
	/**
	 * 将字符串列表连接成一个带指定分隔符的�?
	 * @param list 字符串列�?
	 * @param s 分隔符字符串
	 * @return 字符�?
	 */
	private static String joinArray(List<?> list, String s){
		if(list == null) return null;
		if(list.size()==0) return "";
		String ss = "";
		for(int i = 0; i < list.size(); i++){
			ss += s + list.get(i);
		}
		if(ss.length() > 0){ss = ss.substring(s.length());}
		return ss;
	}
	
}
