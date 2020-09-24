<%@page import="bean.BbsDAO"%>
<%@page import="bean.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));
	BbsDAO dao = new BbsDAO();
	BbsVO vo = dao.one(no);
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><%= vo.getNo() %>번째 게시판 수정 페이지입니다.</h3>
<hr color="red">
<form action="bbsupdateOk.jsp">
<table>
	<tr align="center">
		<td width="100" bgcolor="yellow">번호</td>
		<td width="200" bgcolor="pink"><%= vo.getNo() %>
			<input type="hidden" name="no" value="<%= vo.getNo() %>" >
		 </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">제목</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="title" value="<%= vo.getTitle() %>"> </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">내용</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="content" value="<%= vo.getContent()%>"> </td>
	</tr>
	<tr align="center">
		<td width="100" bgcolor="yellow">작성자</td>
		<td width="200" bgcolor="pink">
			<input type="text" name="writer" value="<%= vo.getWriter() %>"> </td>
	</tr>
	<tr align="center">
		<td colspan="2">
			<button type="submit" style=width:300px;background:red;color:white;>수정 처리 요청</button>
		</td>
	</tr>
</table>
</form>
<hr color="green">
[ 	<a href="index.html"><button style=background:green>처음페이지로</button></a> |
	<a href="one.jsp?id=<%= vo.getNo() %>"><button style=background:gold>검색</button></a> |
	<a href="bbsdelete.jsp?no=<%= vo.getNo() %>"><button style=background:lime>삭제</button></a> 
]  








</body>
</html>