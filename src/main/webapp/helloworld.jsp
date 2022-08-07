<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5" errorPage="/404.jsp "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World!</title>
</head>
<body>
	<h1>Hello World</h1>
	
	<% int i = 12 / 0;%>

	<h3>
		Server Time is
		<%=new java.util.Date()%></h3>
</body>
</html>