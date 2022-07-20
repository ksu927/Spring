package com.edu.basic;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

//----------------------------------------------------------------------------------------------
// AJAX를 이용하여 파일 올리기 (7.20)
//----------------------------------------------------------------------------------------------
@Controller
public class AjaxUploadController {

	//업로드 할 경로(디렉토리)는 servlet-context.xml에 설정해 놓았음.
	@Resource(name = "uploadPath")
	String uploadPath;
	
	//----------------------------------------------------------------------------------------------
	// 파일 올리기(ajax) 화면 불러오기
	//----------------------------------------------------------------------------------------------
	@RequestMapping(value="/upload/uploadAjax", method = RequestMethod.GET)
	public String uploadAjax() {
		return "/upload/uploadAjax";
	}
	
	//----------------------------------------------------------------------------------------------
	// 파일을 드래그해서 업로드했을 경우 진행되는 메서드(ajax)
	//----------------------------------------------------------------------------------------------
	@ResponseBody
	@RequestMapping(value="/upload/uploadAjax", method = RequestMethod.POST, 
														produces = "text/plain;charset=UTF-8")
	///// public ResponseEntity<String> uploadAjax(MultipartFile file) throws Exception {
	public void uploadAjax(MultipartFile file) throws Exception {
		
		// 파일 정보를 출력한다.
		System.out.println("getOriginalFilename : " + file.getOriginalFilename());
		System.out.println("getSize : " + file.getSize());
		System.out.println("getContentType: " + file.getContentType());
	}
	
	
}// END - public class AjaxUploadController
