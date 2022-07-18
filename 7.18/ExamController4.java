package com.edu.exam4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//------------------------------------------------------------------------------------------------------
// public class ExamController4
//------------------------------------------------------------------------------------------------------
@Controller
@RequestMapping("/exam04")
public class ExamController4 {

	//------------------------------------------------------------------------------------------------------
	// 날짜
	//------------------------------------------------------------------------------------------------------
	@RequestMapping(value="/datepicker1", method=RequestMethod.GET)
	public String datepicker1() throws Exception {
		return "/exam04/datepicker1";
	}
}// END- public class ExamController4
