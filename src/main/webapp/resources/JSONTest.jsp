<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
<title>JSONTest</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>  
<script>
  $(function() {
      $("#checkJson").click(function() {
      	var member = { 
      			"no":"10",
      			"id":"samson", 
  			    "label":"피터샘슨",
  			    "value":"실수란"
  			 };
		  	$.ajax({
		        type:"post",
		        url:"${contextPath}/jqueryui/putjson",
		        contentType: "application/json",
		        data :JSON.stringify(member),
		     success:function (data,textStatus){
		     },
		     error:function(data,textStatus){
		        alert("에러가 발생했습니다.");
		     },
		     complete:function(data,textStatus){
		     }
		  });  //end ajax	
		
		   });
		});
</script>
</head>
<body>
  <input type="button" id="checkJson" value="회원 정보 보내기"/><br><br>
  <div id="output"></div>
</body>
</html>