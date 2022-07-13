package com.edu.board.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.board.service.BoardService;

//------------------------------------------------------------------------------------------------------
// public class BoardController
//------------------------------------------------------------------------------------------------------
@Controller // Bean의 대상으로 인식시키기 위해서 servlet-context.xml에 등록한다.
@RequestMapping(value="/board/*")
public class BoardController {
	
	@Inject
	private BoardService boardService;

	//------------------------------------------------------------------------------------------------------
	// 게시글 목록
	//------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/boardList", method = RequestMethod.GET)
	public void boardList(Locale locale, Model model) throws Exception {
		
		System.out.println("BoardController boardList() 시작");
		
		List boardList = boardService.boardList();
		System.out.println("BoardController boardList() data ==> " + boardList);
		model.addAttribute("boardList", boardList);
	}
	
	//------------------------------------------------------------------------------------------------------
	// 게시글 쓰기 화면
	//------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/boardRegisterForm.do", method = RequestMethod.GET)
	public String boardRegisterForm(Locale locale, Model model) throws Exception {
		
		return "/board/boardRegisterForm";
	}
	
} // end - public class BoardController
