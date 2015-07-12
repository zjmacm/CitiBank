package com.citybank.dao;

/**
 * 数据库类�?
 * 主要用于差异化语句识�?(SqlMap);
 * 
 * 类设计�?�路来源于java.util.Locale
 * 
 * @author chenr
 * @version 2.0.0, 2011-6-22
 */
public final class DbType {

	/**
	 * 类型名称
	 */
	private final String type;
	/**
	 * 版本
	 */
	private final String version;

	/**
	 * 预定义数据库类型：ORACLE 
	 */
	public static final DbType ORACLE = createSingleton("oracle", "");
	/**
	 * 预定义数据库类型：DB2 
	 */
	public static final DbType DB2 = createSingleton("db2", "");
	/**
	 * 预定义数据库类型：POSTGRESQL 
	 */
	public static final DbType POSTGRESQL = createSingleton("postgresql", "");
	/**
	 * 预定义数据库类型：默认类�?
	 */
	public static final DbType ROOT = createSingleton("", "");
	

	/**
	 * 实例化一个数据库类型对象
	 * @param type 数据库类�?
	 * @param version 版本
	 */
	public DbType(String type, String version){
		this.type = type.intern();
		this.version = version.intern();
	}
	
	/**
	 * 实例化一个数据库类型对象（类内部使用�?
	 * @param type 数据库类�?
	 * @param version 版本
	 * @param flag 和公用构造函数区分附加参�?
	 */
	private DbType(String type, String version, boolean flag) {
		this.type = type;
		this.version = version;
	}

	/**
	 * 创建数据库类型（内部使用�?
	 * @param type 数据库类�?
	 * @param version 版本
	 * @return 数据库类型对�?
	 */
	private static DbType createSingleton(String type, String version) {
		DbType dbtype = new DbType(type, version, false);
		return dbtype;
	}

	/**
	 * 获取类型
	 * @return 字符�?
	 */
	public String getType() {
		return type;
	}

	/**
	 * 获取版本
	 * @return 字符�?
	 */
	public String getVersion() {
		return version;
	}
	
	/**
	 * 获取默认数据库类型对�?(ORACLE)
	 * @return 数据库类型对�?
	 */
	public DbType getDefault(){
		return ORACLE;
	}
	
	/**
	 * 比较两个数据库类型对象是否相同（重载了Object该方法）
	 * @return boolean�?
	 */
	public boolean equals(Object obj) {
		if (this == obj) // quick check
			return true;
		if (!(obj instanceof DbType))
			return false;
		DbType other = (DbType) obj;
		return type == other.type 
			&& version == other.version;
	}
}
