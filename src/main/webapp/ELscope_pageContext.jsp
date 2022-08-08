<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 範圍</title>
</head>
<body>
   
    <%=request.getScheme()%> <br>
    <%=request.getServerName()%> <br>
    <%=request.getServerPort()%> <br>
    <%=request.getContextPath()%> <br>
    <%=request.getMethod()%> <br>
    <%=request.getRemoteHost()%> <br>
    <%=session.getId()%> <br>
    
  	<hr>   
  	 <%
        pageContext.setAttribute("req", request);
   	 %>
    1.協議： ${ req.scheme }<br>
    2.Server IP：${ pageContext.request.serverName }<br>
    3.Server Port：${ pageContext.request.serverPort }<br>
    4.取得 專案路徑：${ pageContext.request.contextPath }<br>
    5.取得 request 方法：${ pageContext.request.method }<br>
    6.取得 客戶端 IP：${ pageContext.request.remoteHost }<br>
    7.取得 session ID：${ pageContext.session.id }<br>
</body>
</html>