<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>å ���</h1>
<form name="frm" method="post" action="bookWrite_ok.jsp">
<label for="bookName" >å �̸�</label>
<input type="text" name="bookName" id="bookName"><br>
<label for="price" >å ����</label>
<input type="text" name="price" id="price"><br>
<label for="publisher" >å ����</label>
<input type="text" name="publisher" id="publisher"><br>
<input type="submit" value="���" >
<input type="reset" value="���" >
</form>
<hr>
<a href="bookList.jsp">å ���</a>

</body>
</html>