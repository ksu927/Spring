package com.edu.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.edu.board.dto.BoardDTO;

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
	public List<BoardDTO> boardList() throws Exception {

		System.out.println("BoardServiceDAOImpl boardList() 시작");
		return sqlSession.selectList(namespace + ".listAll");
	}

	//------------------------------------------------------------------------------------------------------
	// 제일 큰 게시글 번호 가져오기 (7.14)
	//------------------------------------------------------------------------------------------------------
	@Override
	public Integer getMaxSeq() {
		System.out.println("BoardDAOImpl getMaxSeq()");
		return sqlSession.selectOne(namespace + ".maxSeq");
	}

	//------------------------------------------------------------------------------------------------------
	// 게시글 등록 처리 (7.14)
	//------------------------------------------------------------------------------------------------------
	@Override
	public int boardRegister(BoardDTO boardDTO) {
		System.out.println("BoardDAOImpl boardRegister()");
		return sqlSession.insert(namespace + ".register", boardDTO);
	}

	//------------------------------------------------------------------------------------------------------
	// 게시글 번호에 해당하는 게시글의 조회수 증가시키기 (7.14)
	//------------------------------------------------------------------------------------------------------
	@Override
	public void updateReadCount(int seq) {
		sqlSession.update(namespace + ".updateReadCount", seq);
		
	}

} // END - public class BoardDAOImpl implements BoardDAO
