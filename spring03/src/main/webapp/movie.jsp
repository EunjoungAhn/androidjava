<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel=stylesheet  href="resources/css/out.css">
<script src="resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(function() {
	//alert("영화 예매를 환영합니다!")
	$("#b1").click(function() {
		replyValue = $('#reply').val()
		$.ajax({
			url: "reply.do",
			data: {
				reply: replyValue
			},
			success: function(result) {
				//alert(result)
				$("#d1").append(result)
			}//success
		})//ajax
	})//b1
	
	$("#b2").click(function() {
		checkValue = $('#check').val()
		$.ajax({
			url: "check.do",
			data: {
				check: checkValue
			},
			success: function(check) {
				$("#d2").html(check)
			}//success
		})//ajax
	})//b1
})
</script>
</head>
<body>
	<form action="movie.do">
		예매 페이지<br>
		영화 제목:<input type="text" name="title"><br>
		영화 가격:<input type="number" name="money">
		<button>입장</button>
	</form>
		<hr color="red">
		댓글: <input type="text" id="reply">
		<button id="b1">댓글달기</button>
		<hr color="blue">
		<div id="d1">
		</div>
		<hr color="green">
		가입할 아이디: <input type="text" id="check">
		<button id="b2">중복체크</button>
		<div id="d2">
		</div>
</body>
</html>