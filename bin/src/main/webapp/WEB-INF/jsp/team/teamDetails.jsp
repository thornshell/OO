<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>球队详细页面</title>
</head>
<body>
	序列${team.teamId }</br>
	队名${team.teamName }</br>
	<c:forEach  var="entity" items="${team.matchsTeamA }">
		<c:out value="${entity }"></c:out>
	</c:forEach>
</body>
</html>