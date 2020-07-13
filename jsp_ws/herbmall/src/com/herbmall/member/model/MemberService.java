package com.herbmall.member.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.herbmall.board.model.BoardVO;

//db작업 이외의 비즈니스 logic 처리하는 클래스
//jsp => DAO
//jsp => Service => DAO
public class MemberService {
	//아이디 중복확인 관련 상수
	public static final int EXIT_ID=1; // 이미 해당 아이디가 존재하는 경우
	public static final int NON_EXIT_ID=2; // 아이디가 존재하지 않는 경우
	
	//로그인 처리 관련 상수
	public static final int LOGIN_OK=1;//로그인 성공
	public static final int PWD_DISAGREE=2;//패스워드가 틀림
	public static final int ID_NONE=3;//아이디가 존재하지 않음
	
	private MemberDAO memberDao;
	
	public MemberService() {
		memberDao= new MemberDAO();
	}
	
	public int insertMember(MemberVO vo) throws SQLException {
		int cnt = memberDao.insertMember(vo);
		return cnt;
		
	}
	
	public int duplicateId(String userid) throws SQLException {
		return memberDao.duplicateId(userid);
	}
	
	public int loginCheck(String userid, String pwd) throws SQLException {
		return memberDao.loginCheck(userid, pwd);
	}
	public MemberVO selectMember(String userid) throws SQLException {
		return memberDao.selectMember(userid);
	}
	
	public int updateInfo(MemberVO vo) throws SQLException {
		return memberDao.updateInfo(vo);
	}
	
	public int deleteMem(String userid) throws SQLException {
		return memberDao.deleteMem(userid);
	}
	
	
}
