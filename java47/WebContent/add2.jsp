<%@page import="java47.BasketVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%	//장바구니넣기2.jsp에서 product, price를 가지고 Parameter 설정
	String product = request.getParameter("product");
	String price = request.getParameter("price");
	//값을 한번에 담아서 뽑기 위해서 
	//vo에 값을 넣어 ArrayList로 설정
	ArrayList<BasketVO> list = null;
	//product null이 아니라면 값을 vo에 담기
 	if(product != null){
		BasketVO vo = new BasketVO();
		vo.setProduct(product);
		vo.setPrice(price);
		//session이 null인 경우를 체크하기 위해서
		if (session.getAttribute("basket2") != null) {
			//null이 아니라는 의미는 이미 장바구니가 만들어져있다는 얘기
			//기존에 있던 세션으로 잡아둔 장바구니 목록을 가지고 와서
			//거기에다가 새로운 장바구니 물건을 추가한다.
			list = (ArrayList<BasketVO>)session.getAttribute("basket2");
			list.add(vo);//list에 vo에 담긴 값을 add해준다.
		} else {
			//null이라는 의미는 장바구니 목록이 안만들어져있다는 얘기
			list = new ArrayList<>();
			list.add(vo);
		}
		session.setAttribute("basket2", list);
 	}
	else{//product null이라면 list를 ArrayList<BasketVO>하여서 만들어 줘라.
		list = (ArrayList<BasketVO>)session.getAttribute("basket2");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	
	if(session.getAttribute("basket2") == null){
%>
		<h3>장바구니가 비어있음.</h3>
	<%
	}else{//session이 있다면 장바구니가를 출력한다. 
	%>
		<h3>장바구니의 개수<%=list.size()%>개 들어있음.</h3>
	<h3>장바구니 목록</h3>
	<hr color="blue">
	<%  //list갯수 만큼 출력한다.
		for(BasketVO vo2: list){
	%>	<!-- vo에 set하여 담은 값을 get으로 가져오기  -->
		<%= vo2.getProduct() %>: <%= vo2.getPrice() %> <br>
	<%		
		}
	}
	%>
	<hr color="green">
	<a href="장바구니에넣기2.jsp">장바구니에 넣기</a>
	<a href="null2.jsp">장바구니 비우기</a>
</body>
</html>