/**
 * 	게시글 관련 함수
 */

//-----------------------------------------------------------------------------------------------------------
// 게시글 등록
//-----------------------------------------------------------------------------------------------------------
function fn_boardRegister() {
	// 화면에서 입력한 값을 변수에 저장한다.
	var	subject	= $("#subject").val();
	var	name	= $("#name").val();
	var	content	= $("#content").val();
	
	// alert(subject + ":" + name + ":" + content);

	// 제목 항목의 값이 없으면 입력하도록 한다.
	if($("#subject").val() == "") {
		alert("제목은 필수 입력 항목입니다.");
		$("#subject").focus();
		return false;
	}
	
	// 이름 항목에 값이 없으면 입력하도록 한다.
	if($("#name").val() == "") {
		alert("이름은 필수 입력 항목입니다.");
		$("#name").focus();
		return false;
	}
	
	//  내용 항목에 값이 없으면 입력하도록 한다.
	if($("#content").val() == "") {
		alert("내용은 필수 입력 항목입니다.");
		$("#content").focus();
		return false;
	}

	$.ajax({
		type:	"POST",
		url:	"/board/boardRegister",
		data:	{subject:subject, name:name, content:content},
		success:	function(data) {
			if(data == "Y") {
				// 게시글 등록이 완료되면 게시글 목록화면으로 이동한다.
				alert("게시글을 등록하였습니다.");
				location.href = "/board/boardList";
			}
		},
		error:		function(data) {
			alert("게시글을 등록하는데 실패하였습니다.");
		}
	});
	

} // End - function fn_boardRegister()
 
 
 
 
 
 
 
 
 
 
 
 