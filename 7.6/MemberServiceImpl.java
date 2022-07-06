package com.edu.member.service;

import java.util.List;

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
		
		System.out.println("MemberServiceImpl에서 받은 memberVO ==> " + memberVO);
		return memberDAO.addMember(memberVO);
		
	
	} // end - public int addMember(MemberVO memberVO)
	
	//---------------------------------------------------------------------------------------------------------
	// 회원 전체 목록 가져오기
	//---------------------------------------------------------------------------------------------------------
	@Override
	public List listMembers() throws DataAccessException {
		
		List memberLists = null;
		memberLists = memberDAO.selectAllMemberList();
		return memberLists;
		
	} // end - public List listMembers() throws DataAccessException
	
} // end - public class MemberServiceImpl implements MemberService
