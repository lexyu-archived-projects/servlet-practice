<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>99乘法表</title>
</head>
<body>
	<h1 align="center"> 99 乘法表</h1>
	<table align="center">
		<% for(int i = 1; i <= 9; i++){ %>
		<tr>
			<%for(int j = 1; j <= 9; j++){ %>
			<td><%=i + "*" + j + " = " + (i*j) %></td>
		</tr>
		<% } %>
	<% } %>
	</table>
</body>
</html>