package com.kfit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 啟用需在 App.java 開啟 
 * @ServletComponentScan // 啟動 servlet 掃描。
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.15
 */
@WebServlet("/myServlet2")
public class MyServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.print("MyServlet1");
		out.flush();
		out.close();
	}

}
