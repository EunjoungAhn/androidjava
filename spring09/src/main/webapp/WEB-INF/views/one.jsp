<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('#reply').click(function() {
			contenValue = $('#content').val()     
			$.ajax({
				url: "create.do",
				data: {
					content: contenValue,
					original: '${one.no}',//one.get~~
					writer: '${id}'//세션 아이디
				},
				success: function(result) {
					//alert(result);
					$('#table2').append(result);
					location.reload()
				}
			})//ajax
		})//click
	})//function
</script>
</head>
<body>
	<hr color="green">
	게시판 검색 화면입니다.
	<table>
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물
				번호</td>
			<td style="color: blue; width: 150px; background: pink;">${one.no}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물
				제목</td>
			<td style="color: blue; width: 150px; background: pink;">${one.title}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물
				내용</td>
			<td style="color: blue; width: 150px; background: pink;">${one.content}</td>
		</tr>
		<tr>
			<td style="color: blue; width: 150px; background: yellow;">게시물
				작성자</td>
			<td style="color: blue; width: 150px; background: pink;">${one.writer}</td>
		</tr>
	</table>
	<hr color="green">
	댓글: <input id="content"> <button id="reply">댓글달기</button>
	<div id="d2" style="width: 350px; height: 30px;">
		<%-- ${status.index + 1} : 순번 찍기 --%>
		<%-- ${total - status.index} : 역순 찍기 total은 계산해서 model에서 넘기는 것이다.--%>
		<table align="center" width=350 id="table2">
			<!-- varStatus="status" 인덱스를 갖겠다는 뜻이다. -->
			<c:forEach items="${list}" var="vo" varStatus="status">
				<tr style="background: lime">
					<td style="width: 50px;">${total - status.index}</td>
					<td style="width: 300px;">${vo.content}</td>
					<td style="width: 100px;">${vo.writer}</td>
					<td style="width: 100px;">
						<!--  one.do?no=1  --> <a
						href="delete3.do?no=${vo.no}&original=${vo.original}">
							<button style="background: yellow;">삭제</button>
					</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>