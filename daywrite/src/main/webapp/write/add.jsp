<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<body>
<!-- 메인 헤더 -->
	<header>
	  Day Write
        <a class="" href="../write/add.jsp">하루적기</a>
       		<h6  class=""><%=session.getAttribute("uID")%> 님을 환영합니다.</h6>
        <a class="" href="../index.jsp">로그아웃</a>
</header>

<!-- 중간 body -->
		<!--일기 등록 폼  -->
		<form action="../write/add.do">
			<div>
			<h5>"오늘 당신의 하루를 작성해 주세요!"</h5>
			<!-- 날짜  -->
			  날짜
			  <input type="text" name="addDate" placeholder="입력해주세요.">
			</div>
	      		내용
			<div class="">
	      		<textarea rows="20" cols="50" name="content" placeholder="입력해주세요."></textarea>
	    	</div>
	    	<!-- 일기 등록 버튼 -->
	    	<div class="">
	              <button type="submit">추가</button>
	        </div>
        </form>
</body>
</html>