<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션보기</title>
</head>
<body>
설정된 세션 id는 <%= session.getAttribute("id") %><br>
<!-- 정규식으로 줄여서 값을 가져올때는 이렇게 사용 가능하다. 
표현식(Expression) => Expression Language(EL) : 속성으로 지정된 경우에만 프린트 가능
-->
설정된 세션 name은 ${name}<br>
설정된 앱 count <%= application.getAttribute("count") %>
</body>
</html>