<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DecimalFormat"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fc" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

</head>
<body>
	<h1>상품 상세보기</h1>
	<p>번호 : ${param.no}</p>
	<p>가격 : ${pdDto.title }</p>
	<p>가격 : <fmt:formatNumber value="${pdDto.price}" pattern="#,###"/>원</p>
	<p>출판사: ${pdDto.publisher }</p>
	<p>등록일 : <fmt:formatDate value="${pdDto.regdate}" pattern="yyyy-MM-dd"/></p>
	<br><br>
	<a href='<c:url value="/book/BookList.do" />'>목록</a>
	<a href='<c:url value="/book/BookEdit.do?no=${param.no }"/>'>수정</a>
	<a href="#" id="del">삭제</a>
	
	
</body>
</html>