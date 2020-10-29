<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 페이지</title>
</head>
<body>
삭제 페이지
<!-- webapp아래로 자동으로 페이지 넘김 -->
<%-- <% response.sendRedirect("index.jsp"); %> --%>

<!-- views아래의 파일로 자동으로 페이지 넘긴 -->
<jsp:forward page="home.jsp"></jsp:forward>
<!-- webapp에 있기 때문에 서버가 자기가 호출해서 넘기기 때문에  -->
<a href="index.jsp">첫페이지</a>
</body>
</html>