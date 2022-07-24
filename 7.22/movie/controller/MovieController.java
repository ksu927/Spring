package com.edu.movie.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//-----------------------------------------------------------------------------------------------------------
// 영화 예매 (7.22)
// MovieController에 @Controller 어노테이션이 설정되어 있더라도 스프링에서 해당 패키지를 스캔하지 않으면, 스프링 빈으로 등록되지 않음
// 그래서 servlet-context.xml에 Bean을 등록해야 한다.
//-----------------------------------------------------------------------------------------------------------
@Controller
@RequestMapping("/movie")
public class MovieController {

	private static final Logger logger = LoggerFactory.getLogger(MovieController.class);
	
	//-----------------------------------------------------------------------------------------------------------
	// 영화관 좌석 화면
	// @ModelAttribute("movieID")는 주소창에서 msg라는 파라미터 값을 가져온다.
	// http://localhost:8088/movie/seatReservation?movieID=1
	//-----------------------------------------------------------------------------------------------------------
	@RequestMapping(value = "/seatReservation", method = RequestMethod.GET)
	public String seatReservation(@ModelAttribute("movieID") String mID, Model model) throws Exception {
		
		logger.info("MovieController seatReservation() GET ==> " + mID);
		
		int reserveOK = 0;
		int reserveNO = 0;
		int movieID = 0;
		
		if(mID != null) {
			movieID = Integer.parseInt(mID);
		}
		if(movieID < 0) {
			logger.info("MovieController seatReservation() GET) ==> 유효하지 않는 값입니다.");
		} else {
			
		}
		
		return "/movie/seatReservation";
		
	} // end - public String seatReservation(@ModelAttribute("movieID") String mID, Model model)
	
} // end - public class MovieController
