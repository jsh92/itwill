<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="com.herbmall.member.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="boardSer" scope="page" class="com.herbmall.board.model.BoardService"></jsp:useBean>
<style type="text/css">
	#divMainNotice{
		width: 310px;
	}
	#divMainNotice div span:first-of-type{
		padding: 0 0 0 160px;
	}
	#divMainNotice div:nth-of-type(2) img {
		width: 310px;
		height: 5px;
	} 
	#divMainNotice div:nth-of-type(3) ul{
		list-style-type: none;		
		margin: 8px 0 0 0;
		padding: 0;
		font-size: 6px;
	}
	#divMainNotice div:nth-of-type(3) ul li{
		padding: 5px 0 5px 2px;		
	}
	
</style>
<%
	//1
	//2
	List<BoardVO> list = null;
	try{
		list = boardSer.selectMainNotice();
	}catch(SQLException e){
		e.printStackTrace();
	}

%>

<div id="divMainNotice">
	<div>
		<img src="<%=request.getContextPath() %>/images/notice2.JPG" 
			alt="공지사항">
		<span>
			<a href="<%=request.getContextPath()%>/board/list.jsp">
				<img src="<%=request.getContextPath() %>/images/more.JPG" 
					alt="more">
			</a>
		</span>
	</div>	
	<div>
		<img src="<%=request.getContextPath() %>/images/Line.JPG" 
			alt="line">
	</div>
	<div>
		<ul id="list">
		<!-- 반복 시작 -->
			<%if(list==null || list.isEmpty()){ %>
				<li>공지사항 없습니다</li>
			<%}else{ %>
				<%for(int i=0;i<list.size();i++){ 
				BoardVO vo=list.get(i);
				%>
				<li>
				<a href="<%=request.getContextPath()%>/board/detail.jsp?no=<%=vo.getNo()%>">
				<img alt="dot" src="<%=request.getContextPath()%>/images/dot.JPG"> <%=vo.getNo() %>. <%=vo.getTitle() %>
				</a>
				</li>
				
				<%} %>
			<%} %>
		<!-- 반복 끝 -->
		</ul>
	</div>
</div>


