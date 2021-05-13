<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"  %>
<%  System.out.println(request.getParameter("term") + "이 요청됨");  %>
[
	{
		"id":"mysql",
		"value":"mysql은 가벼운 dbms입니다.",
		"label":"mysql은 oracle coperation"
	},
	{
		"id":"oracle",
		"value":"oracle은 기업용 dbms입니다.",
		"label":"oracle은 oracle coperation"
	},
	{
		"id":"sqlite",
		"value":"sqlite은 모바일용 dbms입니다.",
		"label":"sqlite은 대부분 모바일 제품에서 사용해요"
	}
]
