<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Object</title>
</head>
<body>
	
	取得 request 參數 username 的值：${param.username} <br/>
	取得 request 參數 password 的值：${param.password} <br/>
	<hr>
	取得 request 參數 username 的值：${paramValues.username}<br/>
	取得 request 參數 hobby 的值：${paramValues.hobby[0]}<br/>
	取得 request 參數 hobby 的值：${paramValues.hobby[1]}<br/>
	<hr>
	取得 request header 的 值：${header['User-Agent'] }<br/>
	取得 request header 的 值：${header.Connection }<br/>
	取得 request header 的 值：${headerValues['User-Agent'][0] }<br/>
	<hr>
	取得 Cookie 名稱：${cookie.JSESSIONID.name}<br/>
	取得 Cookie 值：${cookie.JSESSIONID.value}<br/>
	<hr>
	取得 &lt;initParam&lt; username 的值：${initParam.username}<br/>
	取得 &lt;initParam&lt; url 的值：${initParam.url}<br/>
	
</body>
</html>