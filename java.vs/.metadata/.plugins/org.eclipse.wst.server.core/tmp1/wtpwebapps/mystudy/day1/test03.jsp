<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>test03.jsp</title>
</head>
<body>
	<%
		//test02.jsp에서 get방식으로 이동함
		//=> http://localhost:9090/mystudy/day1/test03.jsp?no=7&name=홍길동
		//요청 파라미터 읽어오기
		String no=request.getParameter("no");
		String name=request.getParameter("name");
		
	%>
	<h1>get방식</h1>
	<h2>요청 파라미터 값</h2>
	<p>번호 : <%=no %></p>
	<p>이름 : <%=name %></p>
	
</body>
</html>








