package com.edu.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.edu.member.vo.MemberVO;

//--------------------------------------------------------------------
// public interface MemberDAO
//--------------------------------------------------------------------
public interface MemberDAO {

	//--------------------------------------------------------------------
	// 회원 가입 처리
	//--------------------------------------------------------------------
	public int addMember(MemberVO memberVO) throws DataAccessException;

	//---------------------------------------------------------------------------------------------------------
	// 회원 전체 목록 가져오기
	//---------------------------------------------------------------------------------------------------------
	public List selectAllMemberList() throws DataAccessException;
	
	
} // end - public interface MemberDAO
