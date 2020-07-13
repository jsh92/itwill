package com.mystudy.pd.serv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mystudy.pd.model.PdDAO;
import com.mystudy.pd.model.PdDTO;

@WebServlet("/InsertServ")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }

	
    protected void doPost(HttpServletRequest request, 
    		HttpServletResponse response) throws ServletException, IOException {
    	//registerPd.html에서 post방식으로 서브밋
    	response.setContentType("text/html;charset=euc-kr");
    	
    	//1
    	request.setCharacterEncoding("euc-kr");
    	String pdName=request.getParameter("pdName");
    	String price=request.getParameter("price");
    	
    	//2
    	PdDAO dao = new PdDAO();
    	PdDTO dto = new PdDTO();
    	dto.setPdName(pdName);
    	dto.setPrice(Integer.parseInt(price));
    	try {
			int cnt=dao.insertPd(dto);
			
			//3
			if(cnt>0) {
				System.out.println("상품 등록 성공!");
				response.sendRedirect("/mystudy/ListServ");
			}else {
				System.out.println("상품 등록 실패!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }

}
