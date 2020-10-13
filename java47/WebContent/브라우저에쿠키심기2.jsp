<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>브라우저에쿠키심기</title>
</head>
<body>
<%
	Cookie c1 = new Cookie("name","홍길동");
	c1.setMaxAge(0);//쿠키에 생명주기 주기
	response.addCookie(c1);
%>
<a href="브라우저에서쿠키가져오기.jsp"><h1>브라우저에 쿠키를 심었음.</h1></a>
</body>
</html>