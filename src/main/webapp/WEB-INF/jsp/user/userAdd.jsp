<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="/matchadd.js"></script>

<title>用户注册</title>
</head>
<body>
<form action="/userAdd" method="post">
	<select id="one" name="team">
		<c:forEach items="${teams }" var="team">
			 <option  value ="${team.teamId }">${team.teamName }</option>	
		</c:forEach>
	</select>
	名字：<input name="uname"></input>
	密码：<input name="upassword"></input>
	<button id="sub" type="submit">提交</button>
</form>
</body>
</html>