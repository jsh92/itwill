<%@page import="com.itWill.book.model.bookDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//bookWrite에서 [등록]을 클릭하여 post방식으로 이동
	//한글 입력 가능하게 만들기
	request.setCharacterEncoding("euc-kr");

	//1.
	String name = request.getParameter("bookName");
	String price =request.getParameter("price");
	String publisher=request.getParameter("publisher");
	
	
	//2.db작업
	bookDAO dao = new bookDAO();
	dao.insertBook(dto)
	
	//3.결과 처리
%>

</body>
</html>