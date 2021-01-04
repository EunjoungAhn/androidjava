<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% session.invalidate(); %>
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
</header>

<!-- 중간 body -->
<!-- 로그인 아이디 input  --> 
<div>
	<div">
		<!--로그인  -->
		<form action="user/checkId.do">
			<div>
			  ID
			  <input type="text" placeholder="아이디를 입력해주세요." name="uID">
			</div>
			<!-- 비밀번호 -->
			<div>
	      		Password
	      		<input type="password" name="password" placeholder="Password">
	    	</div>
	    	<!-- 로그인, 회원가입 버튼  -->
	    	<div>
	              <button type="submit">로그인</button>
	              <a href="user/signUp.jsp">회원가입</a>
	        </div>
        </form>
	</div>
</div>
</body>
</html>