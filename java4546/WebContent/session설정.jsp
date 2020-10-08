<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션적용</title>
</head>
<body>
<% 
session.setAttribute("id", "park"); 
session.setAttribute("name", "박길동"); 
application.setAttribute("count", 100);
%>
<a href="세션보기.jsp">세션보기</a>
<a href="세션보기2.jsp">세션보기2</a>
</body>
</html>