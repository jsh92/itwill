<%@page import="com.herbmall.board.model.BoardVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	//detail.jsp에서 [삭제]를 클릭해서 get 방식으로 이동
	//1
	String no = request.getParameter("no");
	if(no==null || no.isEmpty()){%>
	<script type="text/javascript">
		alert("잘못된 url입니다");
		location.href="list.jsp";
		</script>
<% return;	
	}
	//2
	BoardDAO dao = new BoardDAO();
	BoardVO vo=null;
	try{
		vo = dao.selectByNo(Integer.parseInt(no));
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3
	
%>


<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>자유게시판 글 삭제 - 허브몰</title>
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />
<script type="text/javascript" src="../js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#submit').click(function(){
			if($('#pwd').val().length<1){
				alert("비밀번호를 입력하세요");
				$('#pwd').focus();
				return false;
			}else if($('#pwd').val()!=<%=vo.getPwd()%> ){
				alert("비밀번호가 틀립니다");
				return false;
			}
			
			if(!confirm("삭제하시겠습니까?")){
				return;
			}
			
		});
	});
</script>
<style type="text/css">
body {
	padding: 5px;
	margin: 5px;
}

.divForm {
	width: 650px;
	border: 1px solid #ddd;
}
/* .divForm form{
		width:650px;
	} */
.divForm div {
	/* clear: both; */
	border: none;
	padding: 7px 0;
	margin: 0;
	overflow: auto;
}

.sp {
	font-size: 0.9em;
	color: #0056AC;
}

.divForm fieldset {
	border: 0;
}
</style>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="divForm">
		<form name="frmDelete" method="post"
			action="delete_ok.jsp?no=<%=no %>">
			<input type="hidden" name="no" value="<%=no %>">
			<fieldset>
				<legend>글 삭제</legend>
				<div>
					<span class="sp"><%=no %>번 글을 삭제하시겠습니까?</span>
				</div>
				<div>
					<label for="pwd">비밀번호</label> <input type="password" id="pwd"
						name="pwd" />
				</div>
				<div class="center">
					<input type="submit" value="삭제" id="submit" /> <input
						type="Button" value="글목록" OnClick="location.href='list.jsp'" />
				</div>
			</fieldset>
		</form>
	</div>

</body>
</html>