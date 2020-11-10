<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc2 json처리 방법</title>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$('#bts').click(function() {
		noValue = $("#no").val()
	$.ajax({
		url: "json2.do",
		data: {
			no: noValue
		},
		success: function(json){
			console.log(json)
		 	no = json.no
			title = json.title
			content = json.content
			writer = json.writer
			$('#d1').append(no+", "+title+", "+content+", "+writer+"<br>") 
			}//success
		})//ajax
	})//click
})//function
</script>
</head>
<body>
	<h3>json으로 검색해서 받아온 값</h3>
	<hr color="red">
	검색할 번호 입력: <input type="text" id="no">
	<button id="bts">입력</button>
	<div id="d1"></div>
</body>
</html>