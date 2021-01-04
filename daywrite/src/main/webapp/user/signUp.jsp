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
	  <div>
	    <ul>
	      <li>
	        <a href="../index.jsp">Home</a>
	      </li>
	    </ul>
	  </div>
</header>

<!-- 회원가입 input  --> 
	<form action="../user/create.do">
		<!-- 로그인 아이디 input  --> 
			<div>
				<!--로그인  -->
				<div>
				  ID
				  <input type="text" placeholder="아이디를 입력해주세요." name="uID">
				</div>
				<!-- 비밀번호 -->
				<div >
		      		Password
		      		<input type="text" placeholder="비밀번호를 입력해주세요." name="password">
		    	</div>
		    	<!--이름  -->
				<div class="form-group">
				  Name
				  <input type="text" placeholder="이름을 입력해주세요." name="name">
				</div>
		    	<!-- 회원가입 버튼  -->
		    	<div>
		              <button type="submit">회원가입</button>
		        </div>
			</div>
	</form>
</body>
</html>