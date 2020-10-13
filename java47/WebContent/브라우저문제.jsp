<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	//쿠기는 내장객체가 아니므로 생성하여 설정한다.
	Cookie c1 = new Cookie("subject","스프링");
	//서버에서 브라우저로 심어준다
	response.addCookie(c1);
	Cookie c2 = new Cookie("place","709호");
	//쿠기 생명주기 조절();
	c2.setMaxAge(0);
	response.addCookie(c2);
	Cookie c3 = new Cookie("people","100");
	c3.setMaxAge(0);
	response.addCookie(c3);
%>
<a href="쿠기가져오기문제.jsp">쿠키가져오기</a>
</body>
</html>