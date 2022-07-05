package com.edu.member.service;

import org.springframework.dao.DataAccessException;

import com.edu.member.vo.MemberVO;

//---------------------------------------------------------------------------------------------------------
// public interface MemberService
//---------------------------------------------------------------------------------------------------------
public interface MemberService {

	
	//---------------------------------------------------------------------------------------------------------
	// 회원 가입 처리
	//---------------------------------------------------------------------------------------------------------
	public int addMember(MemberVO memberVO) throws DataAccessException;
	
} // end - public interface MemberService
