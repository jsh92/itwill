<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdEdit_ok.jsp</title>
</head>
<body>
<%
	//pdEdit.jsp에서 post방식으로 서브밋됨
	//1. 요청 파라미터 읽어오기
	//요청 파라미터에 대한 한글 인코딩 처리
	request.setCharacterEncoding("euc-kr");

	String pdname=request.getParameter("pdName");
	String price=request.getParameter("price");
	String no=request.getParameter("no");
	
	//2 db작업
	PdDAO dao=new PdDAO();
	try{
		PdDTO dto = new PdDTO();
		dto.setPdName(pdname);
		dto.setPrice(Integer.parseInt(price));
		dto.setNo(Integer.parseInt(no));
		
		int cnt=dao.updatePd(dto);
		
		//3 결과 처리
		if(cnt>0){
			System.out.println("상품 수정 성공");
			response.sendRedirect("pdDetail.jsp?no="+no);
		}else{
			System.out.println("상품 수정 실패");			
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
%>


</body>
</html>