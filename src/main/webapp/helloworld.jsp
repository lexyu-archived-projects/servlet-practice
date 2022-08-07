<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@ page import="java.util.*"%>
<%@ page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World!</title>
</head>
<body>
	<h1>Hello World</h1>

	<%-- 	<% int i = 12 / 0;%> --%>

	<%!
	private Integer id;
	private String name;
	private static Map<String, Object> map;
	%>

	<%!
	static {
		map = new HashMap<String, Object>();
		map.put("key1", "value1");
		}
	%>
	
	<%!
		public int abc(){
			return 100;
		}
	%>
	
	<%!
	public static class L {
		private Integer id = 10;
		private String LLL = "3";
	}
	%>
	
	<!-- expression -->
	<%=12 %> <br>
	<%=12.12 %> <br>
	<%="字符串" %> <br>
	<%= map %> <br>
	
	<%= request.getParameter("username")%>

	<!-- Code Script -->
	<table border="1">
	<% 
		for(int i = 0; i < 5; i++){
// 			System.out.println(i);
	%>
		<tr>
			<td>第 <%=i%> 行</td>
		</tr>
	<% 
		} 
	%>
	</table>
	

	<h3>
		Server Time is
		<%=new java.util.Date()%>
	</h3>
</body>
</html>