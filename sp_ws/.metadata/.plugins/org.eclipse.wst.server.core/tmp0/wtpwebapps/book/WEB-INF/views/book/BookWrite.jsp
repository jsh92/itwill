<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/mainstyle.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/clear.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/formLayout.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/mystyle.css'/>" />
<script type="text/javascript" src="<c:url value='/resources/js/jquery-3.5.1.min.js'/>"></script>
<script type="text/javascript">
	$(function(){
		$('.btList').click(function(){
			location.href 
				= "<c:url value='/reBoard/list.do'/>";	
		});
		
		$('form[name=frmWrite]').submit(function(){
			if($('#title').val()==''){
				alert('제목을 입력하세요');
				$('#title').focus();
				event.preventDefault();
			}else if($('#price').val().length<1){
				alert('이름을 입력하세요');
				$('#price').focus();
				event.preventDefault();
			}else if(!$('#publisher').val()){
				alert('비밀번호를 입력하세요');
				$('#publisher').focus();
				event.preventDefault();
			}
			
		});
	});
	
</script>

</head>
<body>
<div class="divForm">
	<form name="frm1" method="post" 
	action="<%=request.getContextPath() %>/book/BookWrite.do"
	enctype="multipart/form-data">
	<h1>도서 등록</h1>
	<hr>
	<div>  
        <label for="content">제목</label>        
 		<input type="text" id="title" name="title"  />
    </div>
	<div>  
        <label for="content">가격</label>        
 		<input type="text" id="price" name="price"  />
    </div>
    <div>  
        <label for="content">출판사</label>        
 		<input type="text" id="publisher" name="publisher"  />
    </div>
	<div>  
        <label for="content">내용</label>        
 		<textarea id="content" name="content" rows="12" cols="40"></textarea>
    </div>
    <div>  
        <label for="upfile">첨부파일</label>        
        <input type="file" id="upfile" name="upfile" size="36" multiple="multiple"/>
    	<span>(최대 2M)</span>
    </div>
     <div class="center">
		<input type="submit" value="등록">
		<input type="reset" value="취소">
     </div>
	<hr>
	<a href="<%=request.getContextPath() %>/book/BookList.do">목록</a>
</form>
</div>

</body>
</html>