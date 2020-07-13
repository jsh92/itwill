<%@page import="com.herbmall.member.model.MemberService"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="memService" class="com.herbmall.member.model.MemberService" scope="session"></jsp:useBean>
<%
	//[1] register.jsp에서 중복확인 클릭하면 새창 열림 => get방식으로 이동
	//=> http://localhost:9090/herbmall/member/checkUserid.jsp?userid=aa
	//[2] checkUserid.jsp에서 아이디확인 클릭하면 post방식으로 서브밋	
			
	//1
	request.setCharacterEncoding("utf-8");
	String userid=request.getParameter("userid");
	
	//2
	int result=0;
	if(userid!=null && !userid.isEmpty()){
		try{
			result=memService.duplicateId(userid);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	//3
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checkUserid.jsp</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/mainstyle.css"/>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('input[type=button]').click(function(){
			$(opener.document).find('#userid').val("<%=userid%>")
			$(opener.document).find('#chkId').val("Y")
			
			self.close();
		});
	});

</script>
</head>
<body>
	<h1>아이디 중복 검사</h1>	
	<form name="frmDup" method="post" action="checkUserid.jsp">
		<label for="userid">아이디</label>
		<input type="text" name="userid" id="userid" value="<%=userid%>">
		<input type="submit" value="아이디 확인">
		
		<%if(result==MemberService.EXIT_ID){ %>
			<p>이미 등록된 아이디입니다. 다른 아이디를 입력하세요</p>
		<%}else if(result==MemberService.NON_EXIT_ID){ %>
			<input type="button" value="사용하기" id="btUse">
			<p>사용 가능한 아이디입니다. [사용하기]버튼을 클릭하세요</p>
		<%} %>
	</form>
</body>
</html>





