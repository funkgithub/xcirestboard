<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="loginAction">
<table>
	<caption>로그인</caption>
<tr>
	<th>아이디</th>
	<td><input type="text" name="usr_id" autofocus="autofocus" required="required" value="next"/></td>
</tr>
<tr>
	<th>비밀번호</th>
	<td><input type="password" name="usr_pw" required="required" value="1111" /></td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="확인" />
		<input type="button" value="회원가입" 
		onclick="location.href='regist'" />
	</td>
</tr>
</table>
</sec>
</body>
</html>