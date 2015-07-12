package com.citybank.dao;

import java.util.List;
import java.util.Map;


/**
 * 基础数据库访问接�?
 * 
 * 1.单表增�?�改、查、删操作(CURD);
 * 2.执行更新操作;
 * 3.执行批量语句操作;
 * 
 * @author chenr
 * @version 2.0.0, 2011-6-22
 *
 */
public interface BaseDao {

	/**
	 * 创建�?条表记录
	 * @param tbName 表名
	 * @param row 记录行的�? （Map<列名�?, 列�??>�?
	 */
	public void create(String tbName, Map<String, ?> row);
	
	/**
	 * 通过主键信息获取表记�?
	 * @param tbName 表名
	 * @param conds 主键信息 （Map<列名�?, 列�??>�?
	 * @return 记录行的�? （Map<列名�?, 列�??>�?
	 */
	public Map<String, Object> retrieve(String tbName, Map<String, ?> conds);
	
	/**
	 * 通过主键信息更新表记�?
	 * @param tbName 表名
	 * @param row 记录行的�? （Map<列名�?, 列�??>�?
	 * @param conds 主键信息 （Map<列名�?, 列�??>�?
	 * @return 更新记录条数
	 */
	public int update(String tbName, Map<String, ?> row, Map<String, ?> conds);
	
	/**
	 * 通过主键信息删除表记�?
	 * @param tbName 表名
	 * @param conds 主键信息 （Map<列名�?, 列�??>�?
	 * @return 删除记录条数
	 */
	public int delete(String tbName, Map<String, ?> conds);
	
	/**
	 * 获取某表�?有记�?(慎用)
	 * @param tbName 表名
	 * @return 记录行的值列�? （列表中存放 Map<列名�?, 列�??>�?
	 */
	public List<Map<String, Object>> listAll(String tbName);
	
	/**
	 * 获取某表�?有记录，排序(慎用)
	 * @param tbName 表名
	 * @param o 排序参数
	 * @return 记录行的值列�? （列表中存放 Map<列名�?, 列�??>�?
	 */
	public List<Map<String, Object>> listAll(String tbName, Order o);
	
	
//	===========================================================================
	
	/**
	 * 查询总记录条�?
	 * @param sql SQL语句
	 * @return 记录�?
	 */
	public long count(String sql);
	
	/**
	 * 查询总记录条数，使用占位对象
	 * @param sql SQL语句（可带占位符?�?
	 * @param params 参数（对应占位符�?
	 * @return 记录�?
	 */
	public long count(String sql, Object... params);
	
	/**
	 * 查询总记录条数，使用命名参数
	 * @param sql SQL语句（可带命名参数）
	 * @param params 参数（Map中key对应命名参数�?
	 * @return 记录�?
	 */
	public long count(String sql, Map<String, ?> params);
	
	/**
	 * 
	 * 使用命名参数查询
	 * @param sql SQL语句（可带命名参数）
	 * @param params 参数（Map中key对应命名参数�?
	 * @return 记录行的值列�? （列表中存放 Map<列名�?, 列�??>�?
	 */
	public List<Map<String, Object>> queryForList(String sql, Map<String, ?> params);
	
	/**
	 * 使用占位符方式条件查�?
	 * @param sql SQL语句（可带占位符?�?
	 * @param params 参数（对应占位符�?
	 * @return 记录行的值列�? （列表中存放 Map<列名�?, 列�??>�?
	 */
	public List<Map<String, Object>> queryForList(String sql, Object... params);
	
	/**
	 * 执行�?个更新语�?
	 * @param sql SQL语句（可带占位符?�?
	 * @param params 参数（对应占位符�?
	 * @return 执行影响的记录条�?
	 */
	public int executeUpdate(String sql, Object... params);
	
	/**
	 * 执行�?个更新语�?
	 * @param sql SQL语句（可带命名参数）
	 * @param params 参数（Map中key对应命名参数�?
	 * @return 执行影响的记录条�?
	 */
	public int executeUpdate(String sql, Map<String, ?> params);
	
	/**
	 * 批量更新
	 * @param sql SQL语句
	 * @return 数组，包含每条语句执行影响的记录条数（不�?定准确的值，不同数据库驱动会返回不同结果�?
	 */
	public int[] batchUpdate(String[] sql);
	
	/**
	 * 命名参数语句批量更新
	 * @param sql SQL语句（可带命名参数）
	 * @param batchValues 参数列表（列表内Map中key对应命名参数�?
	 * @return 数组，包含每条语句执行影响的记录条数（不�?定准确的值，不同数据库驱动会返回不同结果�?
	 */
	public int[] batchUpdate(String sql, List<Map<String, ?>> batchValues);
	
	/**
	 * 占位符语句批量更�?
	 * @param sql SQL语句（可带占位符?�?
	 * @param batchValues  参数二维数组（第二维度对应占位符�?
	 * @return 数组，包含每条语句执行影响的记录条数（不�?定准确的值，不同数据库驱动会返回不同结果�?
	 */
	public int[] batchUpdate(String sql, Object[][] batchValues);
	
}
