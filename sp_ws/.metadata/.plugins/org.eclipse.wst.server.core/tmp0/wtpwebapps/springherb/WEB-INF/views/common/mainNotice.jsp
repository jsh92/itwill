<%@page import="com.mymvc.board.model.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		font-size: 0.9em;
	}
	#divMainNotice div:nth-of-type(3) ul li{
		padding: 5px 0 5px 2px;		
	}
</style>

<%
	List<BoardVO> list=(List<BoardVO>)request.getAttribute("list");

%>
<div id="divMainNotice">
	<div>
		<img src="<%=request.getContextPath() %>/images/notice2.JPG" 
			alt="공지사항">
		<span>
			<a href="<%=request.getContextPath() %>/board/list.do">
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
		<ul>
			<%if(list==null || list.isEmpty()){ %>
				<li>공지사항이 없습니다.</li>
			<%}else{ %>
				<!-- 반복 시작 -->
				<%for(BoardVO vo : list){ %>
					<li>
						<a href
				="<%=request.getContextPath() %>/board/detail.do?no=<%=vo.getNo()%>">
							<img src="<%=request.getContextPath() %>/images/dot.JPG" >
							<%=vo.getTitle() %></a>
					</li>		
				<%} %>		
				<!-- 반복 끝 -->
			<%} %>
		</ul>
	</div>
</div>

