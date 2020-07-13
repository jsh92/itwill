<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result3.jsp</title>
</head>
<body>
<h1>result3.jsp 페이지</h1>
<jsp:useBean id="cb" class="com.herbmall.test.CounterBean" 
	scope="page"></jsp:useBean>

<p>count - <jsp:getProperty property="count" name="cb"/> </p>
<hr>
<a href="scope3.jsp">scope3으로 이동</a>
<br>
<h2>session id : <%=session.getId() %></h2>	
</body>
</html>






