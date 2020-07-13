/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package MyLauncher.app.model;

import MyLauncher.app.main.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jseun
 */
public class RoomDAO {
    
    
    public ArrayList<RoomDTO> showByPlace(String search) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            ArrayList<RoomDTO> list = new ArrayList<>();
            
            con=DBUtil.getConnection();
            String sql="select * from room" +
                    " where place like '%' || ? || '%'";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, search);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("name");
                String roomtype = rs.getString("roomtype");
                int price = rs.getInt("price");
                String place = rs.getString("place");
                String description =rs.getString("description");
                int discount = rs.getInt("discount");
                
                RoomDTO dto = new RoomDTO(name, roomtype,price,place,description,discount);
                list.add(dto);
            }//while
            return list;
        }finally{
            try {
                DBUtil.dbClose(rs, ps, con);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public int insertRoom(RoomDTO dto) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        
        try {
            con = DBUtil.getConnection();
            
            String sql="insert into room(name, roomType, price, place, discount, description)" +
                    " values(?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, dto.getName());
            ps.setString(2, dto.getRoomtype());
            ps.setInt(3, dto.getPrice());
            ps.setString(4, dto.getPlace());
            ps.setInt(5, dto.getDiscount());
            ps.setString(6, dto.getDescription());
            int cnt = ps.executeUpdate();
            System.out.println("상품 입력 결과, cnt="+cnt
                    +", 매개변수 dto="+dto);
            
            return cnt;
        }finally{
            try {
                DBUtil.dbClose(ps, con);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    public ArrayList<RoomDTO> showBySearch(String motel) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            ArrayList<RoomDTO> list = new ArrayList<>();
            
            con=DBUtil.getConnection();
            String sql="select * from room" +
                    " where name like '%' || ? || '%'";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, motel);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("name");
                String roomtype = rs.getString("roomtype");
                int price = rs.getInt("price");
                String place = rs.getString("place");
                String description =rs.getString("description");
                int discount = rs.getInt("discount");
                
                RoomDTO dto = new RoomDTO(name, roomtype,price,place,description,discount);
                list.add(dto);
            }//while
            return list;
        }finally{
            try {
                DBUtil.dbClose(rs, ps, con);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    public int updateRoom(RoomDTO dto) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        
        try {
            con = DBUtil.getConnection();
            
            String sql="update room set roomType=?, price=?, place=?, discount=?, description=?" +
                    " where name=?";
            
            ps=con.prepareStatement(sql);
            ps.setString(1, dto.getRoomtype());
            ps.setInt(2, dto.getPrice());
            ps.setString(3, dto.getPlace());
            ps.setInt(4, dto.getDiscount());
            ps.setString(5, dto.getDescription());
            ps.setString(6, dto.getName());
            int cnt = ps.executeUpdate();
            System.out.println("결과, cnt="+cnt
                    +", 매개변수 dto="+dto);
            
            return cnt;
        }finally{
            try {
                DBUtil.dbClose(ps, con);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }//
    
    public ArrayList<RoomDTO> showAll() throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            ArrayList<RoomDTO> list = new ArrayList<>();
            
            con=DBUtil.getConnection();
            String sql="select * from room";
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                String name = rs.getString("name");
                String roomtype = rs.getString("roomtype");
                int price = rs.getInt("price");
                String place = rs.getString("place");
                String description =rs.getString("description");
                int discount = rs.getInt("discount");
                
                RoomDTO dto = new RoomDTO(name, roomtype,price,place,description,discount);
                list.add(dto);
            }//while
            return list;
        }finally{
            try {
                DBUtil.dbClose(rs, ps, con);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//
    
    public int delete(String name, String roomtype) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        
        try {
            con = DBUtil.getConnection();
            String sql="delete from room where name=?, roomType=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2,roomtype);
            
            int cnt = ps.executeUpdate();
            System.out.println("삭제 결과: "+cnt);
            return cnt;
        }finally{
                DBUtil.dbClose(ps, con);
        }
        
    }
    
}//class
