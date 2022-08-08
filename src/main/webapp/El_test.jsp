<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	    <%
	       // 1. 值為 null，則為true 空
	        request.setAttribute("isEmpty", null);
	       // 2、值為空字串，則為true 空
	        request.setAttribute("emptyStr", "");
	       // 3、值是 Object陣列，長度為 0，則為 true 空
	        request.setAttribute("emptyArr", new Object[]{});
	       // 4、list集合，element 數 為0，true 空
	        List<String> list = new ArrayList<>();
	       // list.add("abc");
	        request.setAttribute("emptyList", list);
	       // 5、map集合，element 數 為0，true 空
	        Map<String,Object> map = new HashMap<String, Object>();
	       // map.put("key1", "value1");
	        request.setAttribute("emptyMap", map);
	    %>
	    ${ empty isEmpty } <br/>
	    ${ empty emptyStr } <br/>
	    ${ empty emptyArr } <br/>
	    ${ empty emptyList } <br/>
	    ${ empty emptyMap } <br/>
	
	   	<hr> 
	   	<%-- 三位元運算 --%>
    	${ 12 != 12 ? "正確":"錯誤" }<br/>
    	
	<%
        Map<String,Object> map2 = new HashMap<String, Object>();
        map.put("a.a.a", "aaaValue");
        map.put("b+b+b", "bbbValue");
        map.put("c-c-c", "cccValue");

        request.setAttribute("map", map);
    %>

        ${ map['a.a.a'] } <br>
        ${ map["b+b+b"] } <br>
        ${ map['c-c-c'] } <br>
</body>
</html>