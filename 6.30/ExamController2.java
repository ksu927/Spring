//6.30.
package com.edu.exam2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//--------------------------------------------------------------------------------------------------------
// public class ExamController2
//--------------------------------------------------------------------------------------------------------
@Controller
@RequestMapping("/exam02")
public class ExamController2 {
	//--------------------------------------------------------------------------------------------------------
	// return 타입이 String인 경우
	// servlet-context.xml에 <context:component-scan base-package="com.edu.exam2" /> 추가해 줘야지 경로 찾아서 결과 화면 보여줌
	// @ModelAttribute("msg")는 주소창에서 msg라는 파라미터의 값을 가져온다.
	// http://localhost:8081/exam02/doC?msg=hello  - > Console 창에 hello가 나옴
	// 이렇게 주소창에 파라미터가 적혀있는 경우에 자동적으로 msg의 값이 hello를 가져오게 된다.
	//     request.getParameter("msg")를 사용하지 않아도 된다.
	//--------------------------------------------------------------------------------------------------------
	@RequestMapping("/doC")
	public String doC(@ModelAttribute("msg") String msg) {
		System.out.println("doC가 실행되었습니다. msg : " + msg);
		
		// return에 문자열이 사용될 경우에는 문자열.jsp파일을 찾아서 실행하게 된다.
		// void타입과는 다르게 return 타입이 String인 경우에는 리턴하는 문자열이 View 이름이 된다.
		return "exam02/doC";
	}
} // end - public class ExamController2
