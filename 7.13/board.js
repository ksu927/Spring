/**
 *   게시글 관련 함수
 */
 
 //------------------------------------------------------------------------------------------------------------------------------
 // 게시글 등록
 //------------------------------------------------------------------------------------------------------------------------------
 function fn_boardRegister() {
    // 화면에서 입력한 값을 변수에 저장한다.
    var subject = $("#subject").val();
    var name = $("#name").val();
    var content = $("#content").val();
    
    // 제목, 이름 , 내용이 없으면 입력하도록 한다.
    if(subject == "" || subject.equals("")) {
    	alert("제목은 필수 입력 항목입니다.");
    	$("#subject").focus();
    	return false;
    }
    
    if(name == "" || name.equals("")) {
    	alert("이름은 필수 입력 항목입니다.");
    	$("#name").focus();
    	return false;
    }
    
    if(content == "" || content.equals("")) {
    	alert("제목은 필수 입력 항목입니다.");
    	$("#content").focus();
    	return false;
    }
 
 }// END - function fn_boardRegister()