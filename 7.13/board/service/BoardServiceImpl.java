package com.edu.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.edu.board.dao.BoardDAO;

//------------------------------------------------------------------------------------------------------
// public class BoardServiceImpl implements BoardService
//------------------------------------------------------------------------------------------------------
@Service   // Bean으로 인식 시키기 위해서 사용한다.
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;
	
	//------------------------------------------------------------------------------------------------------
	// 게시글 목록
	//------------------------------------------------------------------------------------------------------
	@Override
	public List boardList() throws Exception {

		System.out.println("BoardServiceImpl boardList() 시작");
		return boardDAO.boardList();
	}

} // end - public class BoardServiceImpl implements BoardService
