<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<tr style="background: lime">
	<td style="width: 50px;">${total - status.index}</td>
	<td style="width: 300px;">${replyVO.content}</td>
	<td style="width: 100px;">${replyVO.writer}</td>
	<td style="width: 100px;">
<a href="delete3.do?no=${replyVO.no}&original=${replyVO.original}">
			<button style="background: yellow;">삭제</button>
	</a>
	</td>
</tr>