<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
스프링 9 프로젝트입니다@@@
<hr color="green">게시판 검색입니다.	
<a href="one.do?no=1">1 검색하기</a>
<a href="one.do?no=2">2 검색하기</a>
<a href="one.do?no=3">3 검색하기</a>
<hr color="red">
<!-- 태그 사이에 내용(contents)이 비어있음. 빈태그 -->
<sql:setDataSource
url="jdbc:mysql://127.0.0.1:3366/shop"
driver="com.mysql.jdbc.Driver"
user="root"
password="1234"
scope="application"
var="db"
/>
<!-- el문법 sql에서 var이 위의 정보를 객체 형식으로 가지고 있는 것이다.  -->
<sql:query var="list" dataSource="${db}">
	select * from reply
</sql:query>
<c:forEach items="${list.rows}" var="vo">
- content: ${vo.content}, no: ${vo.no}<br>
</c:forEach>
<hr color="gray">
<c:set var="date" value="<%= new Date() %>"/>
<!-- el은 무조건 속성이  -->
fmt 첫번째 - 날짜만: <fmt:formatDate value="${date}" type="date" dateStyle="short"/><br>
fmt 두번째 - 날짜와 시간: <fmt:formatDate value="${date}" type="both" dateStyle="full"/><br>
<hr color="gray">
functions 첫번째 -  <c:set var="name" value=" 홍길동 " /><br>
제 이름은 ${fn:trim(name)} 입니다.
이름에 동이 포함되어 있을까?<br>
정답은 ${fn:contains(name, "동")} 입니다.<br>
functions 두번째 - 
<c:set var="english" value="abcdefg" /><br>
소문자로 변환 ${fn:toUpperCase(english)}
<hr color="gray">
core 첫번째 문자 출력 - <c:out value="hello"/><br>
core 두번째 if문 확인 - 
<c:set var="num" value="11"/>
<c:if test="${num eq '10'}">10입니다.</c:if>
<c:if test="${num != '10'}" >10이 아닙니다.</c:if>
<hr color="gray">
<%-- <sql:update dataSource="${db}">
	insert into bbs values(4, "java", "Nice", "c")
</sql:update> --%>
</body>
</html>