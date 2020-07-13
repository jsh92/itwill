<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdDelete.jsp</title>
</head>
<body>
<%
	//pdDetail.jsp에서 [삭제]클릭하면 get방식으로 이동
	//=> http://localhost:9090/mystudy/pd/pdDelete.jsp?no=2
	//1. 요청 파라미터 읽어오기
	String no=request.getParameter("no");
	
	//2 db작업
	PdDAO dao=new PdDAO();
	try{
		int cnt=dao.deletePd(Integer.parseInt(no));
		
		//3 결과 처리
		if(cnt>0){
			System.out.println("상품 삭제 성공");
			response.sendRedirect("pdList.jsp");
		}else{
			System.out.println("상품 삭제 실패");			
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
%>
</body>
</html>