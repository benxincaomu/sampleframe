package io.github.benxincaomu.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 请求分发器
 * 
 * @author sunft
 *
 */
public class DispatcherServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		super.doPost(req, resp);
	}

	@Override
	protected void doPut(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		super.doPut(req, resp);
	}

	@Override
	protected void doDelete(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		super.doDelete(req, resp);
	}

	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		super.service(req, resp);
	}
	/**
	 * 请求分发
	 */
	void doDispatch(){

	}

}
