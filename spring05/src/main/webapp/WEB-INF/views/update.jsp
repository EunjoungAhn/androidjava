<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 페이지 </title>
</head>
<body>
수정 페이지 
<a href="index.jsp">첫페이지</a> <br>
검색결과: ${bbsVO2} <br>
게시물 번호: ${bbsVO2.no} <br>
<hr color="blue">
게시물 번호: ${bbsVO2.no} <br>
게시물 제목: ${bbsVO2.title} <br>
게시물 내용: ${bbsVO2.content} <br>
게시물 작성자: ${bbsVO2.writer} <br>
<a href="delete.do">삭제페이지</a>
</body>
</html>