<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- DAO를 이용해서 결과를 ArrayList로 받아온 후, html을 만든다.!  -->
<%
	String title = request.getParameter("title");
BbsDAO dao = new BbsDAO();
List<BbsVO> list = dao.all(title);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
td {
	width: 100px;
	text-align: center;
}
</style>
</head>
<body>
	<!-- 테이블 감싸서 표현하기 -->
	<h3>
		제목 검색결과의 개수는
		<%=list.size()%>개
	</h3>
	<table border="1">
		<tr>
			<td class="td">아이디</td>
			<td class="td">패스워드</td>
			<td class="td">이름</td>
			<td class="td">전화번호</td>
		</tr>
		<%
			for (int i = 0; i < list.size(); i++) {
			BbsVO vo = list.get(i);
		%>
		<tr>
			<td><%=vo.getNo()%></td>
			<td><%=vo.getTitle()%></td>
			<td><%=vo.getContent()%></td>
			<td><%=vo.getWriter()%></td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>