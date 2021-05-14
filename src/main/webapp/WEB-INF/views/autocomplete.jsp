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
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


<!--  <link rel="stylesheet" href="${contextPath}/webjars/jquery-ui/1.12.1/jquery-ui.css">
<script type="text/javascript" src="${contextPath}/webjars/jquery/3.6.0/jquery.js"></script>
<script type="text/javascript" src="${contextPath}/webjars/jquery-ui/1.12.1/jquery-ui.js"></script>
-->
<script type="text/javascript">
$(function() {
    $( "#tags" ).autocomplete({
      //source: 'autocomplete_action.jsp',
      source   :'<c:url value="/jqueryui/autocomplete_action" />',
      minLength:2,
      delay    :500,
      select:function(event, ui) {
    	  alert(ui.item.value + '가 선택됨');
      }
    });
});
</script>
</head>
<body>
<div class="ui-widget">
  <label for="tags">Tags: </label>
  <input id="tags" autofocus="autofocus">
</div>
</body>
</html>