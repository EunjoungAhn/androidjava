<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
int no = Integer.parseInt(request.getParameter("no"));

	BbsDAO dao = new BbsDAO(); //1~2단계
 	boolean result = dao.delete(no);
	String check = "게시판 삭제 처리 중 문제가 발생함. 삭제처리 되지 않음.";
	if(result){
		check = "게시판 삭제 완료!!";
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>게시판 삭제 결과는 아래와 같습니다.</h3>
<hr color="blue">
<span style="color:red">
<%= check %>
</span>
</body>
</html>