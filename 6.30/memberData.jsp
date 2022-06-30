<!-- 6.30. -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberData</title>
</head>
<body>
   <h1>회원 정보</h1>
   <hr/>
   <h2>MemberVO 아 이 디 : ${member.userid}</h2>
   <h2>MemberVO 비밀번호 : ${member.userpw}</h2>
   
   <hr/>
   
   <h2>Map</h2>
   <h2>Map 아 이 디 : ${map.userid}</h2>
   <h2>Map 비밀번호 : ${map.userpw}</h2>
</body>
</html>