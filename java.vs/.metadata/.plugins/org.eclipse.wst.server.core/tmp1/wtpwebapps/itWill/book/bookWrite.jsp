<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>책 등록</h1>
<form name="frm" method="post" action="bookWrite_ok.jsp">
<label for="bookName" >책 이름</label>
<input type="text" name="bookName" id="bookName"><br>
<label for="price" >책 가격</label>
<input type="text" name="price" id="price"><br>
<label for="publisher" >책 가격</label>
<input type="text" name="publisher" id="publisher"><br>
<input type="submit" value="등록" >
<input type="reset" value="취소" >
</form>
<hr>
<a href="bookList.jsp">책 목록</a>

</body>
</html>