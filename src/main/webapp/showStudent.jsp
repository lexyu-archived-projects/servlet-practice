<%@page import="java.util.ArrayList"%>
<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice2</title>
<style type="text/css">
	table{
		border: 1px red solid;
		width: 600px;
		border-collapse: collapse;
	}
	td, th{
		border: 1px red solid;
	}
</style>
</head>
<body>
	  <%
	  	List<Student> studentList = (List<Student>) request.getAttribute("stuList");
	  %>
	  <table>
	  	<td>編號</td>
		<td>姓名</td>
		<td>年齡</td>
		<td>電話</td>
		<td>操作</td>
	  <% for(Student s : studentList){ %>
	  	<tr>
	  		<td><%=s.getId()%></td>
		  	<td><%=s.getName()%></td>
		  	<td><%=s.getAge()%></td>
		  	<td><%=s.getPhone()%></td>
			<td> <button>修改</button> </td>	  	
	  	</tr>
	  <% } %>
	  </table>
</body>
</html>