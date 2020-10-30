<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="create2.do">
		아이디:<input type="text" name="id"><br>
		비번:<input type="text" name="pw"><br>
		이름:<input type="text" name="name"><br>
		전화번호:<input type="text" name="tel"><br>
		<button type="submit">회원가입</button>
	</form>
		<hr color="green">
		<form action="update.do">
		아이디:<input type="text" name="id"><br>
		전화번호:<input type="text" name="tel"><br>
		<button type="submit">수정</button>
	</form>
	<hr color="green">
		<form action="delete.do">
		아이디:<input type="text" name="id"><br>
		<button type="submit">삭제</button>
	</form>
		<hr color="green">
		<a href="list2.do">전체 회원검색 완료</a>
			<hr color="green">
		<form action="one2.do">
		아이디:<input type="text" name="id"><br>
		<button type="submit">아이디 검색</button>
	</form>
</body>
</html>