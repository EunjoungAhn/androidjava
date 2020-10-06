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
			$('#d1').empty()
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fdanmee.chosun.com%2Fsite%2Fdata%2Frss%2Frss.xml&api_key=t8v9lils9dccusbsrbkhjwoxtcpgdkjzyvgss3iq",
				data: {
					url: 'http://danmee.chosun.com/site/data/rss/rss.xml',
					api_key: 't8v9lils9dccusbsrbkhjwoxtcpgdkjzyvgss3iq',
					count : 20
				},
				success: function(result) {
					console.log('성공!'+result)
					list = result.items
					console.log(list.length)
					if (list.length > 0) {
						$(list).each(function(index, news) {
							console.log(news.title)
							console.log(news.pubDate)
							console.log(news.link)
							title = news.title
							pubDate = news.pubDate
							link = news.link
							total = "<b><a href="+ link + ">" + title + "</a></b>" + pubDate + "<br><br>"
								$('#d1').append(total)
							})//each 
						}//if
					}//success
			})//ajax
		})//b1
		
		$('#b2').click(function() {
			$('#d1').empty()
			$.ajax({
				url: " https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Finside.chosun.com%2Frss%2Frss.xml&api_key=t8v9lils9dccusbsrbkhjwoxtcpgdkjzyvgss3iq",
				data: {
					url: 'http://thestory.chosun.com/rss/rss.xml',
					api_key: 't8v9lils9dccusbsrbkhjwoxtcpgdkjzyvgss3iq',
					count: 20
				},
				success: function(info) {
						list = info.items
						if (list.length > 0) {
							$(list).each(function(index, info) {
								title = info.title
								pubDate = info.pubDate
								link = info.link
								total = "<b><a href="+ link + ">" + title + "</a></b>" + pubDate + "<br><br>"
							$('#d1').append(total)
							})//each
						}//if
				}//success
			})//ajax
		})//b2
		
		$('#b3').click(function() {
			$('#d1').empty()
			$.ajax({
				url: "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fhealth.chosun.com%2Frss%2Fcolumn.xml&api_key=t8v9lils9dccusbsrbkhjwoxtcpgdkjzyvgss3iq",
				data: {
					url: 'http://health.chosun.com/rss/column.xml',
					api_key: 't8v9lils9dccusbsrbkhjwoxtcpgdkjzyvgss3iq',
					count: 20
				},
				success: function(health) {
						list = health.items
						if (list.length > 0) {
							$(list).each(function(index, health) {
								title = health.title
								pubDate = health.pubDate
								link = health.link
								total = "<b><a href="+ link + ">" + title + "</a></b>" + pubDate + "<br><br>"
							$('#d1').append(total)
							})//each
						}//if
				}//success
			})//ajax
		})//b3
	})//function
</script>
</head>
<body>
	<button id="b1">생활여성 연결</button>
	<button id="b2">인포그래픽 연결</button>
	<button id="b3">헬스 연결</button>
	<div id="d1"></div>
</body>
</html>