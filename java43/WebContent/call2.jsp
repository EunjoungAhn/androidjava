<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	String result;
	String score = request.getParameter("score");
	if(Integer.parseInt(score) >= 90){
		result = "최우수";
	}else if(Integer.parseInt(score) >= 80){
		result = "우수";
	}else{
		result = "보통";//엔터를 최대한 없애주어야 한다.
	}%><%= result %>