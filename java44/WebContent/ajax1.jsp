<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(function() {//body부분을 먼저 읽어서 dom-tree를 만들도록 해야함. - 콜백함수 정의
		$('#b1').click(function() {//id가 b1인 것을 클릭하면 함수 실행
			$.ajax({//ajax 함수 호출
				url : "data/member.xml", //1.ajax로 처리할 url을 적어준다.
				//xml에서 doc(document)를 파라미터로 가져온다.
				//ajax url(주소)로 값을 넘겨서 성공(실행)시 받을  
				success : function(doc) {//2.넘길 데이터가 없다면, 3. success를 하였을때 할 함수 설정.
					console.log('xml요청성공')//요청이 잘 되었는지 콘솔에 출력
					console.log('xml결과' + doc)//결과도 잘되었는지 콘솔에 출력
					list = $(doc).find('record')//파라미터로 받은 doc에서 'record'를 찾아 list에 저장.
					console.log('레코드의 개수:' + list.length)//콘솔에 레코드 길이를 찍어보기
					//console.log(list[0])
					if (list.length > 0) {//리스트 길이가 0이 아니라면 
						$(list).each(function(index, item) {//for-each를 반복
							id = $(this).find('id').text()//list에 담겨있는 id를 찾아서 저장
							first_name = $(this).find('first_name').text()//list에 찾고 저장
							last_name = $(this).find('last_name').text()//list에 찾고 저장
							email = $(this).find('email').text()//list에 찾고 저장
							gender = $(this).find('gender').text()//list에 찾고 저장
							address = $(this).find('address').text()//list에 찾고 저장
							console.log(index +'id:'+ id + '이름:'+ first_name)//콘솔에 찍어보기
							$('#d1').append('id:'+ id+"<br>")//브라우저에 찍어보기
							$('#d1').append('성:'+ last_name+"<br>")//브라우저에 찍어보기
							$('#d1').append('이름:'+ first_name+"<br>")//브라우저에 찍어보기
							$('#d1').append('이메일:'+ email+"<br>")//브라우저에 찍어보기
							$('#d1').append('성별:'+ gender+"<br>")//브라우저에 찍어보기
							$('#d1').append('ip주소:'+ address+"<br><br>")//브라우저에 찍어보기
			$.ajax({//위의 ajax가 실행하여 성공하면 success안에 있는 if문안에 같이 반복 실행할 ajax함수 추가
				url: "db1.jsp",//db에 저장하는 담당을 하는 주소로 이동하고
				data:{//db.jsp로 넘길 데이터를 입력
					id : id,//key , 값으로(value) 설정.
					first_name : first_name,//key , 값으로(value) 설정.
					last_name : last_name,//key , 값으로(value) 설정.
					email : email,//key , 값으로(value) 설정.
					gender : gender,//key , 값으로(value) 설정.
					address : address//key , 값으로(value) 설정.
				},
				success: function(result) {//true,false 값을 받기위한 파라미터
					//이미 첫번째 ajax에서 success시 실행될 함수 안에 2번째 ajax를 넣어서 실행하였기 때문에
					//2번째 ajax의 success는 없어도 db에 저장은 된다.
					alert('db1.jsp를 통해서 db에 넣기! - 성공적으로 전송함.')
					alert('db1.jsp의 결과:'+ result)
					}
			})//2번째 db저장하는 ajax
						})//each list의 내용 반복
						
					}//if
				}//success
			})//ajax
		})//b1
		
		$('#b2').click(function() {
			$.ajax({
				url : "data/member.json",
				success : function(doc) {
					console.log('json요청성공')
					console.log(doc)
					$(doc).each(function(index, item) {
						//console.log(index + ":"+ item.id)//json은 .(점)을 통해서 가져온다.
						id = item.id
						first_name = item.first_name,
						last_name = item.last_name,
						email = item.email,
						gender = item.gender,
						address = item.address
						
						total = 'id : ' + id 
						+ '<br>first_name : ' + first_name 
						+ '<br>last_name : ' + last_name
						+ '<br>email : ' + email
						+ '<br>gender : ' + gender
						+ '<br>address : ' + address + "<br>"
						
						console.log(total)
						$('#d1').append(total +"<br>")

					})//for-each
				}//success
			})//json ajax
		})//b2
		
		$('#b3').click(function() {
			
		})//b3
	})
</script>
</head>
<body>
	<button id="b1">xml읽어오기,저장하기</button>
	<button id="b2">Json읽어오기</button>
	<button id="b3">DB에 넣기</button>
	<div id="d1"></div>
</body>
</html>