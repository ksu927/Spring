package com.edu.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//-------------------------------------------------------------------------------------------------
// public class ExamController1
//-------------------------------------------------------------------------------------------------
@Controller
@RequestMapping("/exam01")
public class ExamController1 {

	//-------------------------------------------------------------------------------------------------
	// localhost:8099/exam01/doA
	// void 타입의 경우 리턴 값이 없는 대신에 @RequestMapping에서 지정한 URL에 해당하는 VIEW 이름을 전달한다.
	// 최종적으로 VIEW의 이름은 /exam01/doA
	//-------------------------------------------------------------------------------------------------
	@RequestMapping("/doA")
	public void doA() {
		System.out.println("doA가 실행되었습니다.....");
	}
	
	public void doB() {
		
	}
	
} // End - public class ExamController1


















