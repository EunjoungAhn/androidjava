<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#reply').click(function() {
			contentValue = $('#content').val()
			$.ajax({
				url: "create.do",
				data: {
					content: contentValue,
					original: '${one.no}',//one.get~~
					writer: '${id}'
				},
				success: function(result) {
					//alert(result);
					$('#table2').append(result)
					location.reload()
				}
			})
		})
	})
</script>
</head>
<body>
<h3>게시물 하나 검색화면입니다.</h3>
<hr color="red">
<table align="center">
	<tr>
		<td style=color:blue;width:150px;background:yellow;>게시물 번호</td>
		<td style=color:blue;width:250px;background:pink;>${one.no}</td>
	</tr>
	<tr>
		<td style=color:blue;width:150px;background:yellow;>게시물 제목</td>
		<td style=color:blue;width:250px;background:pink;>${one.title}</td>
	</tr>
	<tr>
		<td style=color:blue;width:150px;background:yellow;>게시물 내용</td>
		<td style=color:blue;width:250px;height:100px;background:pink;>${one.content}</td>
	</tr>
	<tr>
		<td style=color:blue;width:150px;background:yellow;>게시물 작성자</td>
		<td style=color:blue;width:250px;background:pink;>${one.writer}</td>
	</tr>
</table>
<hr color="green">
댓글: <input id="content"> <button id="reply">댓글달기</button>
	<div id="d2" style="width: 450px; height: 50px; background: lime;">
		<table align="center" id="table2">
			<c:forEach items="${list}" var="vo" varStatus="status">
				<tr style="height: 50px;">
					<!-- ${status.index + 1}: 순번찍기 -->
					<!-- ${total - status.index}: 역순찍기 -->
					<td style="width: 50px;">${status.index + 1}</td>
					<td style="width: 300px;">${vo.content}</td>
					<td style="width: 100px;">${vo.writer}</td>
					<td style="width: 100px;">
						<!-- one.do?no=1 --> <a
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





