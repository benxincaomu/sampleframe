package org.sample.core.resource;
/**
 * 定义读取资源文件的借口
 * @author sunft
 *
 */
public interface ResourceReader{
	/**
	 * 设置资源路径
	 */
	void setReoursesPath();
	/**
	 * 读取资源
	 */
	void loadResourses();
	/**
	 * 将资源文件中的数据设置为配置变量
	 */
	void setConfigVariable(String key,String value);
	
	String getConfigVariable(String key);
}
