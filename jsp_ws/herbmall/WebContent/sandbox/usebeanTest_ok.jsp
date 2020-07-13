<%@page import="com.herbmall.test.SimpleBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/* //기존 방식
	request.setCharacterEncoding("utf-8");
	String userid =request.getParameter("userid");
	String name =request.getParameter("name");
	String no =request.getParameter("no");
	
	SimpleBean sb = new SimpleBean();
	sb.setUserid(userid);
	sb.setName(name);
	sb.setNo(Integer.parseInt(no)); */
	
	//useBean, setProperty 액션 태그 사용
	request.setCharacterEncoding("utf-8");
	
%>
<%-- <h1>요청 파라미터 값</h1>
<p>아이디 : <%=sb.getUserid() %></p>
<p>이름 : <%=sb.getName() %></p>
<p>번호 : <%=sb.getNo() %></p> --%>
<!-- useBean 액션태그를 이용하여 SimepleBean 객체 생성  -->
<jsp:useBean id="sb" class="com.herbmall.test.SimpleBean" scope="page"></jsp:useBean>

<!-- setProperty 액션 태그를 이용하여 파라미터를 읽어서 SimpleBean의 멤버변수(property)에 파라미터 값 셋팅 -->
<jsp:setProperty property="name" name="sb"/>
<jsp:setProperty property="userid" name="sb"/>
<jsp:setProperty property="no" name="sb"/>

<p>아이디 : <jsp:getProperty property="userid" name="sb"/> </p>
<p>번호 : <jsp:getProperty property="no" name="sb"/> </p>
<p>이름 : <jsp:getProperty property="name" name="sb"/> </p>

</body>
</html>