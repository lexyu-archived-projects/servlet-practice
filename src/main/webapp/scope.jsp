<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Scope範圍</title>
</head>
<body>
	<h1>Scope.jsp 範例</h1>
	
	<%
		pageContext.setAttribute("Key", "pageContext");
		request.setAttribute("Key", "request");
		session.setAttribute("Key", "session");
		application.setAttribute("Key", "application");
	%>
	
		pageContext範圍 值： <%=pageContext.getAttribute("Key")%> <br>
		request範圍 值： <%=request.getAttribute("Key")%> <br>
		session範圍 值： <%=session.getAttribute("Key")%> <br>
		application範圍 值： <%=application.getAttribute("Key")%> <br>
		
<%-- 	<% --%>
<!-- // 		request.getRequestDispatcher("/scope2.jsp").forward(request, response); -->
<%-- 	%> --%>
	
	<jsp:forward page="/scope2.jsp"></jsp:forward>

</body>
</html>