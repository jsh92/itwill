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
import java.sql.Timestamp;

/**
 *
 * @author jseun
 */
public class MemberDAO {
        //로그인 처리시 필요한 상수
    public static final int LOGIN_OK=1; //로그인 성공
    public static final int PWD_DISAGREE=2; //비밀번호 불일치
    public static final int USERID_NONE=3; //아이디가 존재하지 않음   
    
    //아이디 중복확인시 필요한 상수
    public static final int USABLE=1; //해당 아이디 사용 가능
    public static final int UNUSABLE=2; //해당 아이디 이미존재하여 사용 불가능
    
    public int loginCheck(String id, String pwd) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        int result=0;
        try{
            con=DBUtil.getConnection();
            //3
            String sql="select pwd from member" +
                " where id=?";
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            
            //4
            rs=ps.executeQuery();
            if(rs.next()){
                String dbPwd=rs.getString(1);
                
                if(dbPwd.equals(pwd)){
                    result=LOGIN_OK;
                }else{
                    result=PWD_DISAGREE;
                }
            }else{
                result=USERID_NONE;
            }
            
            System.out.println("로그인 체크 결과, result="+result
                    +", 매개변수 userid="+id+", pwd="+pwd);
            return result;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }   
     public int insertMember(MemberDTO dto) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="insert into member(id, name, pwd,  email,phone, description)" +
                " values(?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getId());
            ps.setString(2, dto.getName());
            ps.setString(3, dto.getPwd());
            ps.setString(4, dto.getEmail());
            ps.setString(5, dto.getPhone());
            ps.setString(6, dto.getDescription());
            
            //4
            int cnt= ps.executeUpdate();
            System.out.println("회원가입 결과, cnt="+cnt+", 매개변수 dto="
                + dto);
            
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }
    
    public int duplicateId(String id) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        int result=0;
        try{
            //1,2 
            con=DBUtil.getConnection();
            
            //3
            String sql="select count(*) from member" +
                " where id=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, id);
            
            //4
            rs=ps.executeQuery();
            if(rs.next()){
                int count=rs.getInt(1);
                
                if(count>0){ //이미 존재
                    result=UNUSABLE; //해당 아이디 사용불가
                }else{
                    result=USABLE; //해당 아이디 사용가능
                }
            }//if
            System.out.println("아이디 중복확인 결과, result="+ result
                +", 매개변수 userid="+id);
            
            return result;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
    public MemberDTO selectMember(String id) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        MemberDTO dto=new MemberDTO();
        
        try{
            con=DBUtil.getConnection();
            
            String sql="select * from member where id=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, id);
            
            rs=ps.executeQuery();
            if(rs.next()){
                String name=rs.getString("name");
                String pwd=rs.getString("pwd");
                String email=rs.getString("email");
                String phone=rs.getString("phone");
                String description=rs.getString("description");
                Timestamp regdate=rs.getTimestamp("regdate");
                
                dto.setId(id);
                dto.setName(name);
                dto.setPwd(pwd);
                dto.setEmail(email);
                dto.setPhone(phone);
                dto.setDescription(description);
                dto.setRegDate(regdate);
            }
            System.out.println("회원정보 조회 결과, dto="+dto
                    +", 매개변수 userid="+id);
            
            return dto;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }

   
}
