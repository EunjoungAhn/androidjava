package com.mega.mvc04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet {
	String id = null;
	String pw = null;
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) {
		id = config.getInitParameter("id");
		pw = config.getInitParameter("pw");
		System.out.println(id);
		System.out.println(pw);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("welcome!! get!!");
		PrintWriter out = response.getWriter();
		out.println("login id "+id);
		out.println("login pw "+pw);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("welcome!! post!!");
		PrintWriter out = response.getWriter();
		out.println("login id "+id);
		out.println("login pw "+pw);
		out.close();
	}

}
