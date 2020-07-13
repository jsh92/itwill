<%@page import="java.sql.SQLException"%>
<%@page import="com.herbmall.board.model.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//list.jsp에서 [게시물 이름]을 클릭하면 get방식으로 이동
	//=>http://localhost:9090/herbmall/board/countUpdate.jsp?no=2
	//파라미터 no에 해당하는 조회수를 1 증가
	//조회수가 1 증가 된 후 값을 가지고 detail.jsp로 이동
	//1
	String no=request.getParameter("no");
	if(no==null || no.isEmpty()){%>
		<script type="text/javascript">
			alert("잘못된 URL입니다.");
			location.href="list.jsp";
		</script>
	<% return;
	}
	//2
	BoardDAO dao = new BoardDAO();
	int cnt=0;
	try{
		cnt = dao.updateReadCount(Integer.parseInt(no));
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	//3
	if(cnt>0){
		System.out.println("조회수 증가 성공");
		response.sendRedirect("detail.jsp?no="+no);
	}else{%>
		<script type="text/javascript">
			alert("조회수 증가 실패");
			history.back();
		</script>
		
	<%}

%>

</body>
</html>