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
import javax.swing.JOptionPane;

/**
 *
 * @author jseun
 */
public class ReservedListDAO {
    
    public int reserve(ReservedListDTO dto) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        try{
            
            //1,2
            con=DBUtil.getConnection();
            
            String sql="insert into reservation(name,geustName, phone, roomType,price,discount,payment,payBy,checkIn,checkOut,place)\n" +
                    "values(?,?,?,?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getName());
            ps.setString(2, dto.getGeustName());
            ps.setString(3, dto.getPhone());
            ps.setString(4, dto.getRoomType());
            ps.setString(5, dto.getPrice()+"");
            ps.setString(6, dto.getDiscount()+"");
            ps.setString(7, dto.getPayment()+"");
            ps.setString(8, dto.getPayBy());
            ps.setString(9, dto.getCheckIn());
            ps.setString(10, dto.getCheckOut());
            ps.setString(11, dto.getPlace());
            
            int cnt= ps.executeUpdate();
            System.out.println("회원가입 결과, cnt="+cnt);
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    };
    
    public int reserveId(ReservedListDTO dto) throws SQLException {
        Connection con=null;
        PreparedStatement ps=null;
        try{
            
            //1,2
            con=DBUtil.getConnection();
            
            String sql="insert into reservation(id,name,geustName, phone, roomType,price,discount,payment,payBy,checkIn,checkOut,place)\n" +
                    "values(?,?,?,?,?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getId());
            ps.setString(2, dto.getName());
            ps.setString(3, dto.getGeustName());
            ps.setString(4, dto.getPhone());
            ps.setString(5, dto.getRoomType());
            ps.setString(6, dto.getPrice()+"");
            ps.setString(7, dto.getDiscount()+"");
            ps.setString(8, dto.getPayment()+"");
            ps.setString(9, dto.getPayBy());
            ps.setString(10, dto.getCheckIn());
            ps.setString(11, dto.getCheckOut());
            ps.setString(12, dto.getPlace());
            
            int cnt= ps.executeUpdate();
            System.out.println("회원가입 결과, cnt="+cnt);
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }
    
    
    public ArrayList<ReservedListDTO> showReservation(String id) {
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        ArrayList<ReservedListDTO> list = new ArrayList<ReservedListDTO>();
        
        try {
            con=DBUtil.getConnection();
            String sql="select * from reservation where id=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                String name = rs.getString("name");
                String roomType = rs.getString("roomType");
                int price = rs.getInt("price");
                String place = rs.getString("place");
                int discount = rs.getInt("discount");
                String checkIn = rs.getString("checkIn");
                String checkOut = rs.getString("checkOut");
                
                ReservedListDTO dto = new ReservedListDTO(name, roomType, price, place, discount, checkIn, checkOut);
                list.add(dto);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return list;
        
    }
    
}//main
