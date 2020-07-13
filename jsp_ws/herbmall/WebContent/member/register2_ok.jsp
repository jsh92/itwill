<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register2_ok.jsp</title>
</head>
<body>
<%
	//agreement.jsp 에서 post방식으로 서브밋
	request.setCharacterEncoding("utf-8");

	//1
%>

<jsp:useBean id="memDao" class="com.herbmall.member.model.MemberDAO" 
	scope="session"></jsp:useBean>
<jsp:useBean id="vo" class="com.herbmall.member.model.MemberVO" 
	scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="vo"/>	
	
<%
	//2
	try{
		int cnt=memDao.insertMember(vo); 
		if(cnt>0){ %>			
			<script type="text/javascript">
				alert('회원가입되었습니다.');
				location.href="../index.jsp";
			</script>
		<%}else{%>
			<script type="text/javascript">
				alert('회원가입 실패!');
				history.go(-1);
			</script>
		<%}			
	}catch(SQLException e){
		e.printStackTrace();
	}
	
%>	
</body>
</html>




