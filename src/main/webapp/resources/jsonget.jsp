<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"  /> 
<!DOCTYPE html>
<html>
<head>
<link rel="icon" type="image/png" sizes="16x16" href="/xciweb01/img/favicon16.png" > 
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="/xciajax/webjars/jquery/3.6.0/jquery.js"></script>

<script type="text/javascript">
$(function() {
    $("#checkJson").click(function() {
	$.ajax({
        type:"get",
        datatype:"json",
        url:"${contextPath}/rest/kyung2",
        success:function (data){
        	//console.log(data);
        	//var jsonInfo = JSON.parse(data);
        	var memberInfo ="회원 정보<br>";
        memberInfo += "=======<br>";
        for(var i in data.members){
	   memberInfo += "성별: " + data.members[i].gender+"<br>";
	   memberInfo += "이름: " + data.members[i].name+"<br>";
	   memberInfo += "별명: " + data.members[i].nickname+"<br><br><br>";
	   memberInfo += "나이: " + data.members[i].age+"<br>";
        }
        $("#output").html(memberInfo);
       },
      error:function(data,textStatus){
         alert("에러가 발생했습니다.");
      },
      complete:function(data,textStatus){
      }
   }); 
   });
});
</script>
</head>
<body>
<a id="checkJson" style="cursor:pointer">회원 정보 수신하기</a><br><br>
<div id="output"></div>
</body>
</html>