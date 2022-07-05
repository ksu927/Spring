package com.edu.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.edu.member.dao.MemberDAO;
import com.edu.member.vo.MemberVO;

//---------------------------------------------------------------------------------------------------------
// public class MemberServiceImpl implements MemberService
//---------------------------------------------------------------------------------------------------------
@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
    //---------------------------------------------------------------------------------------------------------
	// 회원 가입 처리
	//---------------------------------------------------------------------------------------------------------
	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		return memberDAO.insertMember(memberVO);
	}

	
	
} // end - public class MemberServiceImpl implements MemberService
