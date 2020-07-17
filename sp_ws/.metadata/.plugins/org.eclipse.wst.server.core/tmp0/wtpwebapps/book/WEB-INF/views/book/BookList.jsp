<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/mainstyle.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/clear.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/formLayout.css'/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value='/resources/css/mystyle.css'/>" />
<script type="text/javascript"
	src="<c:url value='/resources/js/jquery-3.5.1.min.js'/>"></script>
<script type="text/javascript">	
	function pageProc(curPage){
		$('input[name=currentPage]').val(curPage);
		$('form[name=frmPage]').submit();
	}
	
	$(function(){
		$('.divList table.box2 tbody tr').hover(function(){
			$(this).css('background','skyblue')
					.css('cursor','pointer');
		}, function(){
			$(this).css('background','');
		});
	});
</script>
<style type="text/css">
	body{
		padding:5px;
		margin:5px;
	 }	
</style>
</head>
<body>
	<h1>도서 목록</h1>
	<c:if test="${!empty param.searchKeyword }">
		<p>검색어 : ${param.searchKeyword }, ${pagingInfo.totalRecord}건
			검색되었습니다.</p>
	</c:if>
	<!-- post방식으로 페이징 처리 -->
	<form action="<c:url value='/book/BookList.do' />" name="frmPage"
		method="post">
		<input type="hidden" name="currentPage"> <input type="hidden"
			name="searchCondition" value="${param.serchCondition }"> <input
			type="hidden" name="searchKeyword" value="${param.serchKeyword }">
	</form>
	<div class="divList">
		<table border="1" class="box2" style="width: 500px">
			<colgroup>
				<col style="width: 10%;" />
				<col style="width: 40%;" />
				<col style="width: 15%;" />
				<col style="width: 15%;" />
				<col style="width: 20%;" />
			</colgroup>
			<thead>
			<tr>
				<th scope="col">번호</th>
				<th scope="col">제목</th>
				<th scope="col">가격</th>
				<th scope="col">출판사</th>
				<th scope="col">날짜</th>
			</tr>
			</thead>
			<tbody>
			<c:if test="${empty list }">
				<tr>
					<td colspan="5">상품이 없습니다.</td>
				</tr>
			</c:if>
			<c:if test="${!empty list }">
				<!-- 반복 시작 -->
				<c:forEach var="vo" items="${list }">
					<tr>
						<td>${vo.no}</td>
						<td>
							<!-- 파일이 첨부된 경우 파일 img 보여주기 -->
							<a href='<c:url value="/book/BookDetail.do?no=${vo.no }"/>'>
								<!-- 제목이 긴 경우 일부만 보여주기 -->
								<c:if test="${fn:length(vo.title)>30 }">
									${fn:substring(vo.title,0,30) }...
								</c:if> 
								<c:if test="${fn:length(vo.title)<=30 }">
									${vo.title }
								</c:if>
							</a>
							<!-- 24시간 이내의 글인 경우 new 이미지 보여주기-->
							
							</td>
						<td style="text-align: right"><fmt:formatNumber
								value="${ vo.price }" pattern="#,###" />원</td>
						<td>${vo.publisher }</td>
						<td><fmt:formatDate value="${ vo.regdate }"
								pattern="yyyy-MM-dd" /></td>
					</tr>
				</c:forEach>
			</c:if>

			</tbody>
		</table>
	</div>
	<div class="divPage">
	<!-- 페이지 번호 추가 -->		
	<!-- 이전 블럭으로 이동 ◀ -->
	<c:if test="${pagingInfo.firstPage>1 }">
		<a href="#" onclick="pageProc(${pagingInfo.firstPage-1})">
			<img src="<c:url value='/resources/images/first.JPG'/>" 
				alt="이전 블럭으로 이동">
		</a>
	</c:if> 
	
	<!-- [1][2][3][4][5][6][7][8][9][10] -->
	<c:forEach var="i" begin="${pagingInfo.firstPage }" 
		end="${pagingInfo.lastPage }">		
		<c:if test="${i!=pagingInfo.currentPage }">
			<a href="#" onclick="pageProc(${i})">[${i}]</a>			
		</c:if>
		<c:if test="${i==pagingInfo.currentPage }">
			<span style="color:blue;font-weight:bold">${i}</span>			
		</c:if>		
	</c:forEach>
		
	<!-- 다음 블럭으로 이동 ▶ -->
	<c:if test="${pagingInfo.lastPage < pagingInfo.totalPage }">
		<a href="#" onclick="pageProc(${pagingInfo.lastPage+1})">
			<img src="<c:url value='/resources/images/last.JPG'/>" 
				alt="다음 블럭으로 이동">
		</a>
	</c:if>
	<!--  페이지 번호 끝 -->
</div>
<div class="divSearch">
   	<form name="frmSearch" method="post" 
   		action='<c:url value="/reBoard/list.do"/>'>
        <select name="searchCondition">
            <option value="title" 
            	<c:if test="${param.searchCondition=='title' }">
            		selected="selected"
            	</c:if>
            >제목</option>
            <option value="content" 
            	<c:if test="${param.searchCondition=='content' }">
            		selected="selected"
            	</c:if>
            >내용</option>
            <option value="name" 
            	<c:if test="${param.searchCondition=='name' }">
            		selected="selected"
            	</c:if>
            >작성자</option>
        </select>   
        <input type="text" name="searchKeyword" title="검색어 입력"
        	value="${param.searchKeyword}">   
		<input type="submit" value="검색">
    </form>
</div>

	<div class="divBtn">
		<a href='<c:url value="/book/BookWrite.do"/>'>책 등록</a>
	</div>
</body>
</html>