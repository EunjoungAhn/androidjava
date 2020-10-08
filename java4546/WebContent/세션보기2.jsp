<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션보기2</title>
</head>
<body>
설정된 세션 id는 <%= session.getAttribute("id") %><br>
설정된 세션 name은 ${name}<br>
설정된 앱 count <%= application.getAttribute("count") %>
</body>
</html>