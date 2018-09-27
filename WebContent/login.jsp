<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div><%=request.getAttribute("loginInfo")==null?"":request.getAttribute("loginInfo")%></div>
	<form class="form-horizontal" action="/WEB_TEST/login" method="post">
		<label>验证码</label>
		<input type="text" name="checkCode" placeholder="请输入验证码">
		<img src="/WEB_TEST/checkImg" />
		<input type="submit" width="100" value="登录" name="submit">
	</form>

</body>
</html>