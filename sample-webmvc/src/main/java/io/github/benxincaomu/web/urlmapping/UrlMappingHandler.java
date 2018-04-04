package io.github.benxincaomu.web.urlmapping;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import io.github.benxincaomu.web.enums.HttpMethod;

/**
 * 请求路径映射具体的方法
 * 
 * @author sunft
 *
 */
public class UrlMappingHandler{
	private Map<String, Method> getUrlMapping = new HashMap<>();
	private Map<String, Method> postUrlMapping = new HashMap<>();
	private Map<String, Method> putUrlMapping = new HashMap<>();
	private Map<String, Method> deleteUrlMapping = new HashMap<>();

	public Method getMethod(String path,HttpMethod httpMethod){
		switch (httpMethod) {
		case GET:
			return getUrlMapping.get(path);
		case POST:
			return postUrlMapping.get(path);
		case PUT:
			return putUrlMapping.get(path);
		case DELETE:
			return deleteUrlMapping.get(path);
		default:
			return null;
		}

	}
}
