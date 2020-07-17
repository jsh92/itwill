<%@page import="com.shastudy.pd.model.BookDTO"%>
<%@page import="com.shastudy.pd.model.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//BookDetail.jsp에서 no가 get 방식으로 이동하고
			//post 방식으로 입력을 새로 받아 BookDetail_ok.jsp로 보냄
			//=>http://localhost:9090/shastudy/book/BookEdit.jsp?no=2
			//1. 요청 파라미터 입력받기
			String no = request.getParameter("no");
			
			//2
			BookDAOImpl dao = new BookDAOImpl();
			BookDTO dto = dao.selectByNo(Integer.parseInt(no));
			
			
			//3
	%>
	
	<form name="frm1" method="post" action="BookEdit_ok.jsp?no=<%=no%>">
	<h1>도서 등록</h1>
	<hr>
	제목:
	<input type="text" name ="bookTitle" value="<%=dto.getTitle()%>"><br>
	가격:
	<input type="text" name ="price" value="<%=dto.getPrice()%>"><br>
	출판사:
	<input type="text" name ="bookPub" value="<%=dto.getPublisher()%>"><br>
	
	<input type="submit" value="수정">
	<input type="reset" value="취소">
	<hr>
	<a href="BookList.jsp">목록</a>
	</form>
</body>
</html>