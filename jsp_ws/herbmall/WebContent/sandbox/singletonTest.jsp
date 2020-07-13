<%@page import="com.herbmall.test.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>singletonTest.jsp</title>
</head>
<body>
<%
	//Person p = new Person();
	Person p = Person.getInstance();
	p.showInfo();
	
%>

</body>
</html>