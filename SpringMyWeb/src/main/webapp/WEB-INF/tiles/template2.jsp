<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!-- 타일즈태그를 사용하기위한 선언 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 화면템플릿을 사용하기 위한 모형 -->
	<tiles:insertAttribute name="header" />
	
	<tiles:insertAttribute name="body" />


</body>
</html>