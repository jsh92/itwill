<%@page import="com.mystudy.pd.model.PdDTO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.mystudy.pd.model.PdDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>pdWrite_ok.jsp</title>
</head>
<body>
<%
	//pdWrite.jsp���� post������� ����Ե�
	//1. ��û �Ķ���� �о����
	//��û �Ķ���Ϳ� ���� �ѱ� ���ڵ� ó��
	request.setCharacterEncoding("euc-kr");
	
	String pdName=request.getParameter("pdName");
	String price=request.getParameter("price");
	
	//2. db�۾�	
	PdDAO dao = new PdDAO();
	try{
		PdDTO dto = new PdDTO();
		dto.setPdName(pdName);
		dto.setPrice(Integer.parseInt(price));
		
		int cnt=dao.insertPd(dto);
		
		//3. ��� ó��
		if(cnt>0){
			System.out.println("��ǰ��� ����!");
			response.sendRedirect("pdList.jsp");
		}else{
			System.out.println("��ǰ��� ����!");			
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	
%>
</body>
</html>



