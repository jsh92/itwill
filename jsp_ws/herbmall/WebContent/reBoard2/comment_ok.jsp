<%@page import="com.herbmall.comment.model.CommentVO"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<<jsp:useBean id="cs" scope="page" class="com.herbmall.comment.model.CommentService"></jsp:useBean>
<%
	//detail.jsp 에서 [확인]클릭 되어서 post 방식을 서브밋
	//1
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	String content =request.getParameter("content");
	String dbno = request.getParameter("no");
	//2
	CommentVO vo = new CommentVO();
	vo.setName(name);
	vo.setPwd(pwd);
	vo.setContent(content);
	vo.setBdNo(Integer.parseInt(dbno));
	String msg="댓글 입력 실패!", url="/reBoard/detail.jsp?no="+dbno;
	try{
		int cnt = cs.uploadComment(vo);
		if(cnt>0){
			msg="댓글 입력 성공.";
		}
	}catch(SQLException e){
		e.printStackTrace();	
	}
	request.setAttribute("msg", msg);
	request.setAttribute("url", url);	
%>
<jsp:forward page="../common/message.jsp"></jsp:forward>
