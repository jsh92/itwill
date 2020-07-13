package com.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.DBUtil;
import com.person.model.PersonDTO;
import com.sun.jmx.snmp.Timestamp;

public class ProductDAO {
	
	public ProductDTO selectByPrice(int pNo1, int pNo2) throws SQLException {
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ProductDTO dto = new ProductDTO();
		try {
			con=DBUtil.getConnection();
			
			String sql="select * from product \r\n" + 
					"where price between ? and ?;";
			ps=con.prepareStatement(sql);
			
			ps.setInt(1, pNo1);
			ps.setInt(2, pNo2);
			
			rs=ps.executeQuery();
			if(rs.next()) {
				int no = rs.getInt(1);
				String pdName=rs.getString(2);
				int price=rs.getInt(3);
				String desc=rs.getString(4);

				
				dto.setNo(no);
				dto.setPdName(pdName);
				dto.setPrice(price);
				dto.setDesc(desc);

						
			}
			System.out.println("가격으로 조회 : "+dto);
			return dto;
			
			
		}finally {
			DBUtil.dbClose(rs, ps, con);
		}
		
		
	}

}
