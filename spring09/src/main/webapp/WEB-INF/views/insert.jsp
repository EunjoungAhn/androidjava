<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
<h3>게시물 등록 정보 입니다.</h3>
게시물 번호: ${bbsVO.no} <br>
게시물 제목: ${bbsVO.title} <br>
게시물 내용: ${bbsVO.content} <br>
게시물 작성자: ${bbsVO.writer} <br>
<a href="index.jsp">첫페이지</a>
</body>
</html>