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
		//BookDetail.jsp에서 get방식으로 읽어오기
			//1
			String no = request.getParameter("no");
		
			//2
			BookDAOImpl dao = new BookDAOImpl();
			int cnt = dao.deleteBook(Integer.parseInt(no));
			
			//3
			if(cnt > 0){
		System.out.println("삭제 성공!");
		response.sendRedirect("BookList.jsp");
			}else{
		System.out.println("삭제 실패!");
			}
	%>
</body>
</html>