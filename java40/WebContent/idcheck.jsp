<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% //스크립트릿(scriptlet)
	String id = request.getParameter("id2");
	String pw = request.getParameter("pw");
	MemberDAO dao = new MemberDAO();
	boolean result = dao.read(id, pw);
	String check = "로그인 not!";
	if(result){
		check = "로그인 ok!";
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
<body>
	중복된 아이디 입니다.
	<a href="js07.html">로그인 페이지로</a>
</body>
</html>