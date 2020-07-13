/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingapp.product.model;

import diet.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author TEA
 */
public class ProductDAO {
    /**
     * 상품전체 조회
     * @return
     * @throws SQLException 
     */
    public ArrayList<ProductDTO> selectAll() throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        ArrayList<ProductDTO> list = new ArrayList<>();
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3.
            String sql="select * from product order by no desc";
            ps=con.prepareStatement(sql);
            
            //4.
            rs=ps.executeQuery();
            while(rs.next()){
                int no =rs.getInt("no");
                String pdName=rs.getString("productname");
                String desc=rs.getString("description");
                int price =rs.getInt("price");
                Timestamp regdate=rs.getTimestamp("regdate");
                
                ProductDTO dto = new ProductDTO(no, pdName, price, 
                        desc, regdate);
                list.add(dto);
            }
            System.out.println("상품 전체 조회 결과, list.size="
                    +list.size());
            
            return list;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
    
    public int insertPd(ProductDTO dto) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            //1,2
            con = DBUtil.getConnection();
            
            //3.
            String sql="insert into product(no, productname, price, "
                    + "description)" +
                " values(product_seq.nextval,?, ?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getProductName());
            ps.setInt(2, dto.getPrice());
            ps.setString(3, dto.getDescription());
            
            //4.
            int cnt = ps.executeUpdate();
            System.out.println("상품 입력 결과, cnt="+cnt
                    +", 매개변수 dto="+dto);
            
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }
    
    /**
     * 번호로 조회
     * @param no
     * @return
     * @throws SQLException 
     */
    public ProductDTO selectByNo(int no) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        ProductDTO dto = new ProductDTO();
        try{
            //1,2 con
            con=DBUtil.getConnection();
            
            //3.ps
            String sql="select * from product where no=?";
            ps=con.prepareStatement(sql);
            
            ps.setInt(1, no);
            
            //4. exec
            rs = ps.executeQuery();
            if(rs.next()){
                int price=rs.getInt("price");
                String pdName=rs.getString("productname");
                String desc=rs.getString("description");
                Timestamp regdate=rs.getTimestamp("regdate");
                
                dto.setNo(no);
                dto.setDescription(desc);
                dto.setPrice(price);
                dto.setProductName(pdName);
                dto.setRegDate(regdate);
            }
            System.out.println("번호로 조회 결과, dto="+dto
                    +", 매개변수 no="+no);
            
            return dto;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
    
    public int updateProduct(ProductDTO dto) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            //1,2 con
            con=DBUtil.getConnection();
            
            //3. ps
            String sql="update product" +
                " set productname=?, price=?, description=?" +
                " where no=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getProductName());
            ps.setInt(2, dto.getPrice());
            ps.setString(3, dto.getDescription());
            ps.setInt(4, dto.getNo());
            
            //4. exec
            int cnt = ps.executeUpdate();
            System.out.println("상품수정 결과, cnt="+cnt
                    +", 매개변수 dto="+dto);
            
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }
    
    public Vector<String> selectPdName() throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        Vector<String> list=new Vector<>();
        
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="select distinct productname from product";
            ps=con.prepareStatement(sql);
            
            //4
            rs=ps.executeQuery();
            while(rs.next()){
                String pdName=rs.getString(1);
                
                list.add(pdName);                        
            }
            System.out.println("상품명 검색 결과, list.size="+list.size());
            
            return list;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
    
}
