<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String id = request.getParameter("id2");
	MemberDAO dao = new MemberDAO();
	boolean result = dao.read(id);
	String check;
	if(result){
		check = "사용가능한 아이디 입니다.!";
	}else{
		check = "사용 불가능한 아이디 입니다.";
	}
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중복확인</title>
</head>
<body>
<%= check %>
<span id="idspan"></span><br>
<a href="js07.html">로그인 페이지로</a>
</body>
</html>