package com.edu.member.service;

import java.util.List;

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
	
	//---------------------------------------------------------------------------------------------------------
	// 회원 전체 목록 가져오기
	//---------------------------------------------------------------------------------------------------------
    public List listMembers() throws DataAccessException;


} // end - public interface MemberService
