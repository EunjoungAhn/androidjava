<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	//쿠기는 배열로 값을 불러온다.
	 Cookie[] list = request.getCookies();
	for(int i = 0; i < list.length; i++){
		//쿠키는 브라우저마다 배열값이 다를 수 있으므로 특정 쿠키를 
		//제외하려면 equals()로 확인하여 제외해야한다. 
		if(!list[i].getName().equals("JSESSIONID")){//! 값이 아니라면
%>
<!-- 자바코드로 브라우저에 출력하기  -->
<%= list[i].getName()%>
:<%= list[i].getValue() %> <br>
<%
		}
	}
%>
</body>
</html>