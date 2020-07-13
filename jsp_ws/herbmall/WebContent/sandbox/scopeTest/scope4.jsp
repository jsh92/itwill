<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>scope4.jsp</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="cb" class="com.herbmall.test.CounterBean" 
	scope="application"></jsp:useBean>
<jsp:setProperty property="count" name="cb"/>

<h1>application 영역 연습 - scope4.jsp페이지</h1>
<p>count : <jsp:getProperty property="count" name="cb"/> </p>
<hr>
<a href="result4.jsp">result4으로 이동</a>

<br><br>
<h2>session id : <%=session.getId() %></h2>
<p>세션 유지시간 : <%=session.getMaxInactiveInterval() %>초</p>

</body>
</html>



