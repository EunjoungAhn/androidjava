<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- memberVO은 자동으로 등록 되기 때문에 수동으로 넘기 vo로 찍어야 한다.  -->
회원 id: ${vo.id} <br>
회원 pw: ${vo.pw} <br>
회원 name: ${vo.name} <br>
회원 tel: ${vo.tel} <br>
<a href="member.do">첫페이지</a>
</body>
</html>