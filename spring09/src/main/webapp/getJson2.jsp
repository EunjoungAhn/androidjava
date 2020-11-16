<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc1 json처리 방법</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	$.ajax({
		url: "json.jsp",
		dataType: "json",
		success: function(result){
			//console.log(result)
			total = result.list
			$(total).each(function(i, item) {
				alert(item.name)
			})
		/* 	id = result.id
			pw = result.pw
			name = result.name
			tel = result.tel
			$('#d1').append(id+", "+pw+", "+name+", "+tel) */
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