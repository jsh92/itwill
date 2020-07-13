<%@page import="com.herbmall.comment.model.CommentVO"%>
<%@page import="java.util.List"%>
<%@page import="com.herbmall.board.model.ReBoardVO"%>
<%@page import="com.herbmall.board.model.ReBoardDAO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <jsp:useBean id="sc" scope="page" class="com.herbmall.comment.model.CommentService"></jsp:useBean>
<%

	//list.jsp에서 [제목]클릭하면 get방식으로 이동
	//=> http://192.168.11.31:9090/herbmall/reBoard/detail.jsp?no=7  

	//1
	String no=request.getParameter("no");
	if(no==null || no.isEmpty()){ %>
		<script type="text/javascript">
			alert("잘못된 url 입니다.");
			location.href="list.jsp";
		</script>
		
		<%return;
	} 
	
	//2
	ReBoardDAO dao = new ReBoardDAO();
	ReBoardVO vo=null;
	List<CommentVO> list = null;
	try{
		vo=dao.selectByNo(Integer.parseInt(no));
		list = sc.showComment();
	}catch(SQLException e){
		e.printStackTrace();	
	}
	
	//3
	String content = vo.getContent();
	if(content!=null && !content.isEmpty()){
		content=content.replace("\r\n", "<br>");
	}else{
		content="";
	} 
	
	
%>    
<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta charset="utf-8">
<title>답변형 게시판 상세보기 - 허브몰</title>
<link rel="stylesheet" type="text/css" href="../css/mainstyle.css" />
<link rel="stylesheet" type="text/css" href="../css/clear.css" />
<link rel="stylesheet" type="text/css" href="../css/formLayout.css" />
<link rel="stylesheet" type="text/css" href="../css/mystyle.css" />
<style type="text/css">
	body{
		padding:5px;
		margin:5px;
	 }
	.divForm {
		width: 500px;
		}

	
	table tr td{
		border: 1px solid gray;
	}
</style>  
</head>
<body >
<div>
	<h2>글 상세보기</h2>
	<div class="divForm">
		<div class="firstDiv">
			<span class="sp1">제목</span> <span><%=vo.getTitle() %></span>
		</div>
		<div>
			<span class="sp1">작성자</span> <span><%=vo.getName() %></span>
		</div>
		<div>
			<span class="sp1">등록일</span> <span><%=vo.getRegdate() %></span>
		</div>
		<div>
			<span class="sp1">조회수</span> <span><%=vo.getReadcount() %></span>
		</div>
		<div class="lastDiv">			
			<p class="content"><%=content %></p>
		</div>
		<div class="center">
			<a href='edit.jsp?no=<%=no%>'>수정</a> |
        	<a href='delete.jsp?no=<%=no%>&step=<%=vo.getStep()%>&groupNo=<%=vo.getGroupNo()%>'>삭제</a> |
        	<a href='reply.jsp?no=<%=no%>'>답변</a> |
        	<a href='list.jsp'>목록</a>			
		</div>
	</div>
	<div class="divList">
	<table>
		<colgroup>
		<col style="width:10%;" />
		<col style="width:50%;" />
		<col style="width:*;" />
	</colgroup>
	<thead>
	  <tr>
	    <th scope="col">이름</th>
	    <th scope="col">내용</th>
	    <th scope="col">작성일</th>
	  </tr>
	</thead>
	<tbody>
		<%for(int i=0;i<list.size();i++){ 
			CommentVO cv = list.get(i);
		%>
		<tr>
			<td align="center"><%=cv.getName() %></td>
			<td align="center"><%=cv.getContent() %></td>
			<td align="center"><%=cv.getRegdate() %></td>
		</tr>
		<%} %>
			
	</tbody>
	
	</table>
	</div>
		<h2>댓글</h2>
	<br>
	
	<form action="comment_ok.jsp" name="frmRe" method="post">
	<input type="text" name="no" value="<%=no%>">
		<div>
			<label for="name">이름</label>
			<input type="text" id="name" name="name">
			<label for="name">비밀번호</label>
			<input type="password" id="pwd" name="pwd">
		</div>
		<br>
		<div>
			<textarea id="content" name="content" rows="5" cols="60"></textarea>
		</div>
		<div id="bt">
			<input type="submit" value="확인" >
		</div>
	</form>
</div>
</body>
</html>