package com.finsage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 啟用需在 App.java 開啟
 * @Bean public ServletRegistrationBean ...
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.15
 */
public class MyServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("MyServlet1");
		out.flush();
		out.close();
	}

}
