<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 메인 헤더 -->
	<header>
		Day Write <a href="../write/add.jsp">하루적기</a>
		<h6><%=session.getAttribute("uID")%>
			님을 환영합니다.
		</h6>
		<a href="../index.jsp">로그아웃</a>
	</header>

	<!-- 중간 body -->
	<c:forEach var="vo" items="${list}">
		<table id="tab" border="1">
			<tr>
				<th width="300">날짜 ${vo.addDate}</th>
			</tr>
			<tr>
				<th colspan="2" width="300">내용 ${vo.content}</th>
				<th width="300">
					<form action="../write/oneSearch.do">
						<button>수정</button>
						<input id="addID" name="addID" value="${vo.addID}" type="hidden">
					</form>
					<button id="delete">삭제</button>
				</th>
			</tr>
		</table>
	</c:forEach>
</body>
</html>