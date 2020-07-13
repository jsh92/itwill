package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PostServ")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		//postTest.html 에서 post방식으로 서브밋
		
		response.setContentType("text/html;charset=euc-kr");
		
		//1
		request.setCharacterEncoding("euc-kr");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		//2
		
		//3
		PrintWriter out=response.getWriter();
		
		out.print("<html><head><title>post 서블릿</title></head>");		
		out.print("<body>");
		out.print("<h1>post - 요청 파라미터 값</h1>");
		out.print("<p>아이디 - "+ id+"</p>");
		out.print("<p>비밀번호 - "+ pwd+"</p>");		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}

}
