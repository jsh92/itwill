<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>responseTest.jsp</title>
</head>
<body>
	<%
		//test.jsp 로 이동
		response.sendRedirect("test.jsp");
	%>
</body>
</html>