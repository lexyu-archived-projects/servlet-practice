<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<%
		request.setAttribute("key", "Object");
	%>
	
	Expression Script value：<%=request.getAttribute("key1") == null ? "" : request.getAttribute("key") %><br>
	EL value：${key1}

</body>
</html>