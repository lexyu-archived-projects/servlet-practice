<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL Bean 輸出</title>
</head>
<body>

	<%
		Person person = new Person();
		 person.setName("Lex");
	     person.setPhones(new String[]{"222-222-222","111-111-111","333-333-333"});
	
	     List<String> cities = new ArrayList<String>();
	     cities.add("台北");
	     cities.add("宜蘭");
	     cities.add("桃園");
	     person.setCities(cities);
	     
	     Map<String,Object>map = new HashMap<>();
	     map.put("key1","value1");
	     map.put("key2","value2");
	     map.put("key3","value3");
	     person.setMap(map);	
	     
	     pageContext.setAttribute("p", person);
	%>

		Person 物件 ：${ p } <br/>
		Person - name：${p.name} <br/>
		Person - phones 其中之一陣列值：${p.phones[0]} <br/>
		Person - cities集合中的元素值：${p.cities} <br/>
		Person - List集合中个别元素值：${p.cities[2]} <br/>
		Person - Map集合: ${p.map} <br/>
		Person - Map集合其中一個 key 的值: ${p.map.key3} <br/>
		
		<%-- .age 只要有 getAge() 方法 即可輸出，不用 field --%>
		Person - age ：${p.age} <br>
		
	</body>
</html>