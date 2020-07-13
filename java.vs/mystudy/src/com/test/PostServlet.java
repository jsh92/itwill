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
		//postTest.html ���� post������� �����
		
		response.setContentType("text/html;charset=euc-kr");
		
		//1
		request.setCharacterEncoding("euc-kr");
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		//2
		
		//3
		PrintWriter out=response.getWriter();
		
		out.print("<html><head><title>post ������</title></head>");		
		out.print("<body>");
		out.print("<h1>post - ��û �Ķ���� ��</h1>");
		out.print("<p>���̵� - "+ id+"</p>");
		out.print("<p>��й�ȣ - "+ pwd+"</p>");		
		out.print("</body>");
		out.print("</html>");
		
		out.close();
	}

}