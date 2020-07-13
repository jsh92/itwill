<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="memSv" scope="page" class="com.herbmall.member.model.MemberService"></jsp:useBean>
<body>
<%
	//memberOut.jsp에서 post 방식으로 옴
	//session.invalidate()
	//쿠키 제거
	//1
	request.setCharacterEncoding("utf-8");
	String userid = (String)session.getAttribute("userid");
	
	//2
	int cnt;
	try{
		cnt = memSv.deleteMem(userid);
		if(cnt>0){
			session.invalidate();
			Cookie ck = new Cookie("ck_userid",userid);
			ck.setMaxAge(0);
			ck.setPath("/");
			response.addCookie(ck);%>
			<script type="text/javascript">
				alert("회원탈퇴 했습니다");
			</script>
		<%}
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3
	
	

%>

</body>
</html>