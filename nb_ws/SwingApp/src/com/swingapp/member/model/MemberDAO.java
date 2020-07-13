/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingapp.member.model;

import diet.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author TEA
 */
public class MemberDAO {
    //로그인 처리시 필요한 상수
    public static final int LOGIN_OK=1; //로그인 성공
    public static final int PWD_DISAGREE=2; //비밀번호 불일치
    public static final int USERID_NONE=3; //아이디가 존재하지 않음    
    
    //아이디 중복확인시 필요한 상수
    public static final int USABLE=1; //해당 아이디 사용 가능    
    public static final int UNUSABLE=2; //해당 아이디 이미 존재하여 사용 불가    
    
    public int loginCheck(String userid, String pwd) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        int result=0;
        try{
            //1,2
            con=DBUtil.getConnection();
            
            //3
            String sql="select pwd from member" +
                " where userid=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, userid);
            
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
                    +", 매개변수 userid="+userid+", pwd="+pwd);
            
            return result;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }   
    public int insertMember(MemberDTO dto) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        try{
            con=DBUtil.getConnection();
            
           String sql="insert into member(no, userid, name, pwd,  email,"
                    + " hp, zipcode, address1, address2)" +
                " values(member_seq.nextval, ?,?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, dto.getUserid());
            ps.setString(2, dto.getName());
            ps.setString(3, dto.getPwd());
            ps.setString(4, dto.getEmail());
            ps.setString(5, dto.getHp());
            ps.setString(6, dto.getZipcode());
            ps.setString(7, dto.getAddress1());
            ps.setString(8, dto.getAddress2());
            
            //4
            int cnt= ps.executeUpdate();
            System.out.println("회원가입 결과, cnt="+cnt+", 매개변수 dto="
                + dto);
            
            return cnt;
        }finally{
            DBUtil.dbClose(ps, con);
        }
    }//
    
      public int duplicateId(String userid) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        int result=0;
        try{
            //1,2 
            con=DBUtil.getConnection();
            
            //3
            String sql="select count(*) from member" +
                " where userid=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, userid);
            
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
                +", 매개변수 userid="+userid);
            
            return result;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
    
    public MemberDTO selectMember(String userid) throws SQLException{
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        
        MemberDTO dto=new MemberDTO();
        
        try{
            con=DBUtil.getConnection();
            
            String sql="select * from member where userid=?";
            ps=con.prepareStatement(sql);
            
            ps.setString(1, userid);
            
            rs=ps.executeQuery();
            if(rs.next()){
                int no=rs.getInt("no");
                String name=rs.getString("name");
                String pwd=rs.getString("pwd");
                String email=rs.getString("email");
                String hp=rs.getString("hp");
                String zipcode=rs.getString("zipcode");
                String address1=rs.getString("address1");
                String address2=rs.getString("address2");
                Timestamp regdate=rs.getTimestamp("regdate");
                
                dto.setAddress1(address1);
                dto.setAddress2(address2);
                dto.setEmail(email);
                dto.setHp(hp);
                dto.setName(name);
                dto.setNo(no);
                dto.setPwd(pwd);
                dto.setRegDate(regdate);
                dto.setUserid(userid);
                dto.setZipcode(zipcode);
            }
            System.out.println("회원정보 조회 결과, dto="+dto
                    +", 매개변수 userid="+userid);
            
            return dto;
        }finally{
            DBUtil.dbClose(rs, ps, con);
        }
    }
    
}