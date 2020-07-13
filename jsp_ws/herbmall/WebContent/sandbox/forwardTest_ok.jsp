<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>forwardTest_ok.jsp</h1>
<%
	request.setAttribute("userName", "홍길동");
%>
<jsp:forward page="b.jsp"></jsp:forward>
<!-- include 액션태그와  forward 액션태그를 이용하면 request를 공유함  -->
<!-- 현재 페이지와 b.jsp는 같은 request를 사용함 
forward로 이동하면 request 공유됨-->
<h1>ok의 페이지</h1>
<h1>ok의 페이지</h1>
<h1>ok의 페이지</h1>
<h1>ok의 페이지</h1>
</body>
</html>