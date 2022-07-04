package com.edu.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edu.member.vo.MemberVO;

//-----------------------------------------------------------------------------------------------------------
// public class MemberControllerImpl implements MemberController
//-----------------------------------------------------------------------------------------------------------
@Controller("memberController")
@RequestMapping("/member")  // URL에서 /member로 시작하는 것들을 처리하는 컨트롤러
public class MemberControllerImpl implements MemberController {

	@Autowired
	private MemberVO memberVO;
	
	//-----------------------------------------------------------------------------------------------------------
	// 회원 가입 폼
	// servlet-context에 <context:component-scan base-package="com.edu.member" /> 추가하기
	//-----------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/memberForm.do", method=RequestMethod.GET)
	private ModelAndView memeberForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/member/memberForm");
		return mav;
	}
	
} // end - public class MemberControllerImpl implements MemberController
