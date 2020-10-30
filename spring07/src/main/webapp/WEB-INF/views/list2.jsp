<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%//자바를 태그처럼 사용하기 위해 jsp파일에서 설정%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원 검색 정보입니다.</h3>
<table border=1>
   <tr>
      <th width="150">id</th>
      <th width="150">pw</th>
      <th width="150">name</th>
      <th width="150">tel</th>
   </tr>
    <%//html에 자바 코드 쓰는 법 c: 이름은 위의 prfix에서 설정 가능하나 공통적으로 c로 통일해서 쓴다.%>
   <c:forEach var="vo" items="${list}">
   <tr>
      <td>${vo.id}</td>
      <td>${vo.pw}</td>
      <td>${vo.name}</td>
      <td>${vo.tel}</td>
   </tr>
   </c:forEach>
</table>
<%-- 회원 id: ${vo.id} <br>
회원 pw: ${vo.pw}<br>
회원 name: ${vo.name}<br>
회원 tel: ${vo.tel} --%>
</body>
</html>