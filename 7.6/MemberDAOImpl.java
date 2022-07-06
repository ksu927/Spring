// 7.6.
package com.edu.member.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.edu.member.vo.MemberVO;

//----------------------------------------------------------------------
// public class MemberDAOImpl implements MemberDAO
//----------------------------------------------------------------------
@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
    //----------------------------------------------------------------------
	// 회원 가입 처리
	// sqlSession.insert(사용할 mapper의 id , 저장할 값) 
	//----------------------------------------------------------------------	
	@Override
	public int addMember(MemberVO memberVO) throws DataAccessException {
		
		System.out.println("MemberDAOImpl에서 받은 memberVO ==>" + memberVO);
		int result = sqlSession.insert("mapper.member.addMember", memberVO);
		return result;
		
		
	} // END - public int addMember(MemberVO memberVO)

	//---------------------------------------------------------------------------------------------------------
	// 회원 전체 목록 가져오기
	//---------------------------------------------------------------------------------------------------------
	@Override
	public List selectAllMemberList() throws DataAccessException {
		
		System.out.println("MemberDAOImpl selectAllMemberList().....");
		List<MemberVO> memberLists = null;
		
		memberLists = sqlSession.selectList("mapper.member.selectAllMemberList");
		
		
		return memberLists;
	}
	
} // end - public class MemberDAOImpl implements MemberDAO
