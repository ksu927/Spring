package com.edu.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.edu.member.service.MemberService;
import com.edu.member.vo.MemberVO;

//-----------------------------------------------------------------------------------------------------------
//public class MemberControllerImpl implements MemberController
//-----------------------------------------------------------------------------------------------------------
@Controller("memberController")
@RequestMapping("/member") // url에서 /member로 시작하는 것들을 처리하는 컨트롤러
public class MemberControllerImpl implements MemberController {

	@Autowired
	private MemberVO memberVO;
	
	@Autowired
	private MemberService memberService;
	// == MemeberService memberService = new MemberService();
	
	//-----------------------------------------------------------------------------------------------------------
	// 회원 가입 폼
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/memberForm.do", method=RequestMethod.GET)
	public ModelAndView memberForm(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/member/memberForm");
		return mav;
	}

	//-----------------------------------------------------------------------------------------------------------
	// 회원 가입 처리
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/addMember.do", method=RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute("memberVO")MemberVO memberVO, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		System.out.println("MemberController에서 받은 memberVO ==>" + memberVO);
		
		int result = 0;
		// 사용자가 입력한 정보를 서비스에게 넘겨주어 처리하게 한다.
		result = memberService.addMember(memberVO);
		
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		
		return mav;
		
	} // END - public ModelAndView addMember

	
	//-----------------------------------------------------------------------------------------------------------
	// 회원 전체 목록 조회(7.6)
	//-----------------------------------------------------------------------------------------------------------
	@Override
	@RequestMapping(value="/listMembers.do", method=RequestMethod.GET)
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
			
		// 회원 전체 목록 자료를 가져온다.
		List memberLists = memberService.listMembers();
		System.out.println("회원 전체 목록 ==> " + memberLists);
		
		// 회원 전체 목록 화면을 보여준다.
		ModelAndView mav = new ModelAndView("/member/listMembers");
		// mav.setViewName("/member/listMembers");
		mav.addObject("memberLists", memberLists);
		
		return mav;
	}
	
} // End - public class MemberControllerImpl implements MemberController
