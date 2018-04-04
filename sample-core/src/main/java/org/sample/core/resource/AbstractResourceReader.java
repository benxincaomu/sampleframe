package org.sample.core.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractResourceReader implements ResourceReader{
	private List<String> resouresPath =new ArrayList<>();
	private Map<String,String> configVariableMap=new HashMap<>();;

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
