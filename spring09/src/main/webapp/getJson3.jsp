<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc2 json처리 방법</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url: "json.do",
		dataType: "json",
		success: function(result){
			console.log(result)
		 	no = result.no
			title = result.title
			content = result.content
			writer = result.writer
			$('#d1').append(no+", "+title+", "+content+", "+writer) 
		}
	})
})
</script>
</head>
<body>
	<h3>json으로 받아온 값</h3>
	<hr color="red">
	<div id="d1"></div>
</body>
</html>