<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 메인 헤더 -->
	<header>
	  Day Write
        <a href="../write/add.jsp">하루적기</a>
       		<h6><%=session.getAttribute("uID")%> 님을 환영합니다.</h6>
        <a href="../index.jsp">로그아웃</a>
</header>
<!-- 중간 body -->
		<!--일기 등록 폼  -->
		<form action="../write/edit.do">
			<div>
			<!-- 날짜  -->
			  날짜
			  <input type="text" name="addDate" value="${oneS.addDate}">
			</div>
	    	<!-- 내용-->
			<div>
	      		내용
	      		<input type="text" name="content" value="${oneS.content}">
	    	</div>
	    	<!-- 일기 등록 버튼  -->
	    	<div>
	    	 <input name="addID" value="${oneS.addID}" type="hidden">
	              <button type="submit">수정 완료</button>
	        </div>
        </form>
</body>
</html>