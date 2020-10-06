<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	//콜백(call-back함수)
	//특정한 이벤트를 기다렸다가 그 이벤트가 발생하면
	//함수가 정의되어있는 곳으로 돌아가 자동 호출되는 함수
	//body의 하위 엘리먼트(태그)를 먼저 브라우저가 dom-tree를 구성한 후 
	//콜백함수를 정의하게 되어있음.
	//브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
	//body부분을 먼저 읽어서 dom-tree를 만들도록 해야함.
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "data/member.xml",
				success : function(doc) {
					console.log('xml요청성공')
					console.log('xml결과' + doc)
					list = $(doc).find('record')
					console.log('레코드의 개수:' + list.length)
					//console.log(list[0])
					if (list.length > 0) {
						$(list).each(function(index, item) {
							id = $(this).find('id').text()
							first_name = $(this).find('first_name').text()
							last_name = $(this).find('last_name').text()
							email = $(this).find('email').text()
							gender = $(this).find('gender').text()
							address = $(this).find('address').text()
							console.log(index +'id:'+ id + '이름:'+ first_name)
							$('#d1').append('id:'+ id+"<br>")
							$('#d1').append('성:'+ last_name+"<br>")
							$('#d1').append('이름:'+ first_name+"<br>")
							$('#d1').append('이메일:'+ email+"<br>")
							$('#d1').append('성별:'+ gender+"<br>")
							$('#d1').append('ip주소:'+ address+"<br><br>")
						})//each id,name
					}//if
				}//success
			})//ajax
		})//b1
		$('#b2').click(function() {
			$.ajax({
				url : "data/member.json",
				success : function() {
					console.log('json요청성공')
				}
			})
		})//b2
		$('#b3').click(function() {

		})//b3
	})
</script>
</head>
<body>
	<button id="b1">xml읽어오기</button>
	<button id="b2">Json읽어오기</button>
	<button id="b3">DB에 넣기</button>
	<div id="d1"></div>
</body>
</html>