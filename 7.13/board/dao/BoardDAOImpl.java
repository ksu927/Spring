package com.edu.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

//------------------------------------------------------------------------------------------------------
// public class BoardDAOImpl implements BoardDAO
//------------------------------------------------------------------------------------------------------	
@Repository // Bean으로 등록하기 위해서 사용한다.
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.edu.board";
	
	//------------------------------------------------------------------------------------------------------
	// 게시글 목록
	//------------------------------------------------------------------------------------------------------	
	@Override
	public List boardList() throws Exception {

		System.out.println("BoardServiceDAOImpl boardList() 시작");
		return sqlSession.selectList(namespace + ".listAll");
	}

} // END - public class BoardDAOImpl implements BoardDAO
