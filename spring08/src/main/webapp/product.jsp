<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3> 제품입력 시작합니다.</h3>
<hr color="red">
<form action="create.do">
제품 번호 : <input type="text" name="no"><br>
제품 이름 : <input type="text" name="name"><br>
제품 내용 : <input type="text" name="content"><br>
제품 가격 : <input type="text" name="prices"><br>
<button type="submit">입력하기</button>
<hr color="red">

<h3> 제품삭제 시작합니다.</h3>
<hr color="blue">
</form>
<form action="delete.do">
제품 번호 : <input type="text" name="no"><br>
<button type="submit">삭제하기</button>
</form>
<hr color="blue">

<h3> 제품갱신 시작합니다.</h3>
<hr color="green">
<form action="update.do">
제품 번호 : <input type="text" name="no"><br>
제품 내용 : <input type="text" name="content"><br>
<button type="submit">업데이트 하기</button>
</form>
<hr color="green">

<!-- <h3> 제품정보 검색 시작합니다.</h3>
<hr color="pink">
<form action="one.do">
제품 번호 : <input type="text" name="no"><br>
<button type="submit">회원 검색 하기</button>
</form>
<hr color="pink"> -->

<h3> 전체정보 검색 시작합니다.</h3>
<hr color="yellow">
<a href="list.do">전체 검색하기</a>
<hr color="yellow">
</body>
</html>