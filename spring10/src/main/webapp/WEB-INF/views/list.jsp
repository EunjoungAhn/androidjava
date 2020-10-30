<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${list}" var="vo">
제품 번호: ${vo.no} <br>
제품 이름: ${vo.name} <br>
제품 내용: ${vo.content} <br>
제품 가격: ${vo.price} <br>
</c:forEach>
<a href="member.do">첫페이지</a>
</body>
</html>