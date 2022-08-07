<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include</title>
</head>
<body>

header 訊息<br>
body 訊息<br>

 
<%-- <%@include file="/include/footer.jsp" %> --%>

<jsp:include page="/include/footer.jsp">
	<jsp:param value="root" name="username"/>
	<jsp:param value="pass" name="password"/>
</jsp:include>




</body>
</html>