<%@page import="com.herbmall.board.model.ReBoardVO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.ReBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href='<c:url value='/css/mainstyle.css'></c:url>' />
<link rel="stylesheet" type="text/css" href='<c:url value='/css/clear.css'></c:url>' />
<link rel="stylesheet" type="text/css" href='<c:url value='/css/formLayout.css'></c:url>' />
<link rel="stylesheet" type="text/css" href='<c:url value='/css/mystyle.css'></c:url>' />

<title>답변형 게시판 답변하기 - 허브몰</title>
<script type="text/javascript" src='<c:url value='/js/jquery-3.5.1.min.js'></c:url>'></script>
<script type="text/javascript">
	$(function(){
		$('.btList').click(function(){
			location.href	='list.jsp';	
		});
		
		$('form[name=frmWrite]').submit(function(){
			if($('#title').val()==''){
				alert('제목을 입력하세요');
				$('#title').focus();
				event.preventDefault();
			}else if($('#name').val().length<1){
				alert('이름을 입력하세요');
				$('#name').focus();
				event.preventDefault();
			}else if(!$('#pwd').val()){
				alert('비밀번호를 입력하세요');
				$('#pwd').focus();
				event.preventDefault();
			}
			
		});
	});
	
</script>

</head>
<body>
<div class="divForm">
<form name="frmWrite" method="post" action='<c:url value='/reBoard/reply_ok.jsp'></c:url>' >
	<!-- hidden  필드에 원본글에 해당하는 정보 저장 -->
	<input type="text" name="groupNo" value="${vo.groupNo }">
	<input type="text" name="step" value="${vo.step }">
	<input type="text" name="sortNo" value="${vo.sortNo }">
	
 <fieldset>
	<legend>답변하기</legend>
        <div class="firstDiv">
            <label for="title">제목</label>
            <input type="text" id="title" name="title" 
            	value="Re: ${vo.title }" />
        </div>
        <div>
            <label for="name">작성자</label>
            <input type="text" id="name" name="name" />
        </div>
        <div>
            <label for="pwd">비밀번호</label>
            <input type="password" id="pwd" name="pwd" />
        </div>
        <div>
            <label for="email">이메일</label>
            <input type="text" id="email" name="email" />
        </div>
        <div>  
        	<label for="content">내용</label>        
 			<textarea id="content" name="content" rows="5" cols="60"></textarea>
        </div>
        <div class="center">
            <input type = "submit" value="답변"/>
            <input type = "Button" class="btList" value="글목록"  />         
        </div>
    </fieldset>
</form>
</div>   

              
</body>
</html>