package io.github.benxincaomu.tomcat;

import javax.servlet.http.HttpServlet;

import org.apache.catalina.startup.Tomcat;

public class EmbedTomcat{
	private Tomcat tomcat = new Tomcat();

	public void addServlet(Class<? extends HttpServlet> clazz,String path){
		
	}
}
