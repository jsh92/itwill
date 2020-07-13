package com.mystudy.pd.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.pd.model.PdDAO;
import com.mystudy.pd.model.PdDTO;


//@WebServlet("/DetailServ")
public class detailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ListServlet.java���� ��ǰ�� Ŭ���ؼ� get������� �̵�
		//=>http://localhost:9090/mystudy/DetailServ?no=6
		response.setContentType("text/html;charset=euc-kr");
		//1
		String no = request.getParameter("no");
		
		//2
		PdDAO dao = new PdDAO();
		PdDTO dto = null;
		
		try {
			dto =dao.selectByNo(Integer.parseInt(no));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//3
		PrintWriter out = response.getWriter();
		DecimalFormat df = new DecimalFormat("#,###");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		out.print("<html><head><title>��ǰ �󼼺���</title>");		
		out.print("<script type='text/javascript'>");
		out.print("function pdDel(){");		
		out.print("	 if(confirm('�����Ͻðڽ��ϱ�?')){");		
		out.print("	 	location.href='/mystudy/delServ?no="
				+ no +"';");		
		out.print("	 }");		
		out.print("}");		
		out.print("</script>");		
		out.print("</head>");		
		out.print("<body><h1>��ǰ �󼼺���</h1>");		
		out.print("<p>��ȣ : "+ no +"</p>");
		out.print("<p>��ǰ�� : "+ dto.getPdName() +"</p>");
		out.print("<p>���� : "+ df.format(dto.getPrice()) +"��</p>");
		out.print("<p>����� : "+ dto.getRegdate() +"</p><br>");		
		out.print("<a href='/mystudy/ListServ'>���</a> | ");
		out.print("<a href='/mystudy/EditSv?no="+no+"'>����</a> | ");
		out.print("<a href='#' onclick='pdDel()'>����</a>");		
		out.print("</body>");
		out.print("</html>");
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}