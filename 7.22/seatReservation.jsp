<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt"  %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%	request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>영화 좌석 예매</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>	
</head>
<body>
<!-- 상단 메뉴 -->
<jsp:include page="../common/topMenu.jsp" flush="false"/>

<div class="container">
	<div class="row" align="center">
		<h2>좌석 예약</h2>
	</div>	
	<div class="row" align="center">
		<label class="control-label col-sm-2">남은 좌석수</label>
		<div id="seatCount1" class="col-sm-1" style="font-size:1.2em; width:80px; background-color:2F70A9; color:FFFFFF; height:28px; border:1px solid; float:left;">${reserveNO}123</div>
		<label class="control-label col-sm-2">예약 좌석수</label>
		<div id="seatCount2" class="col-sm-1" style="font-size:1.2em; width:80px; background-color:D77875; color:FFFFFF; height:28px; border:1px solid; float:left;">${reserveOK}123</div>
	</div>
</div>

<!-- 하단 메뉴 -->
<jsp:include page="../common/footer.jsp" flush="false"/>

</body>
</html>

