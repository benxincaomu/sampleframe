package org.sample.core.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractResourceReader implements ResourceReader{
	/** 资源文件路径列表 */
	private List<String> resouresPath =new ArrayList<>();
	/** 配置文件k-v映射 */
	private Map<String,String> configVariableMap=new HashMap<>();
	private String basePath="classpath:/";

	@Override
	public void setReoursesPath(){
		

	}

	@Override
	public void setConfigVariable(String key,String value){
		configVariableMap.put(key, value);

	}
	@Override
	public String getConfigVariable(String key){
		return configVariableMap.get(key);
		
	}
}
