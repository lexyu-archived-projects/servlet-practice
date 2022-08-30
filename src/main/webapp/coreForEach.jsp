<%@page import="java.util.ArrayList"%>
<%@page import="model.Student2"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>

	<%-- set
	在 Scope 內保存 Data
	--%>	
	保存之前 ${requestScope.number}<br>
	<c:set scope="request" var="number" value="10" />
	保存之後 ${requestScope.number}<br>

	<%-- test 表示 判斷的條件 (EL 輸出)  --%>
	<c:if test="${12 == 12}">
		<h1> 條件成立 </h1>
	</c:if>
	
	<hr>
	
	<%-- 類似 switch case default  
		choose 開始選擇判斷
		when   表示每一種判斷情況
		1. 注意不可使用 html 標籤
		2. when的父標籤是 choose
	--%>
	
	<% request.setAttribute("height", 18); %>
	<c:choose>
		<c:when test="${requestScope.height > 190 }"> 
			<h2>巨人</h2>
		</c:when>
		<c:when test="${requestScope.height > 180 }"> 
			<h2>高</h2>
		</c:when>	
		<c:when test="${requestScope.height > 170 }"> 
			<h2>平均</h2>
		</c:when>
		<c:otherwise>
			<c:choose>
                <c:when test="${requestScope.height > 160}">
                    <h3>高於160</h3>
                </c:when>
                <c:when test="${requestScope.height > 150}">
                    <h3>高於150</h3>
                </c:when>
                <c:when test="${requestScope.height > 140}">
                    <h3>高於140</h3>
                </c:when>
                <c:otherwise>
                    小於140
                </c:otherwise>
            </c:choose>
		</c:otherwise>		
	</c:choose>
	
	<hr>
	
	<%-- forEach
	1. 遍歷 
	begin 開始index
	end   結束index
	var   迴圈變數
	 --%>
	 <table border="1">
		<c:forEach begin="1" end="10" var="i">
			<thead>
				<tr>
					<th>名字</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${i}號</td>
				</tr>
			</tbody>
		</c:forEach>
		<tfoot>
				<tr>
					<td>合計欄位</td>
				</tr>
			</tfoot>
	</table>
	<hr>
	
	<%-- 遍歷 Object 陣列 
		for(Object item : array)
		var 當前遍歷到的資料
	--%>
	<% request.setAttribute("array", new String[]{"1234567","9876543","159753456"});%>
	
	<c:forEach items="${requestScope.array}" var="item">
		${item} <br>
	</c:forEach>
	
	<hr>
	<%-- Map --%>
	<% 
		Map<String, Object> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");	  
// 		for (Map.Entry<String, Integer> entry : map.entrySet())
		request.setAttribute("map", map);
	%>
		
	<c:forEach items="${requestScope.map}" var="entry">
		<h1>${entry}</h1><br>
		<h3>${entry.key}</h3><br>
		<h5>${entry.value}</h5><br>
		<h4>${entry.key} = ${entry.value}</h4><br>	
	</c:forEach>
	<%
        List<Student2> studentList = new ArrayList<Student2>();
        for (int i = 1; i <= 10; i++) {
            studentList.add(new Student2(i, "username"+i ,"pass"+i, 18+i, "phone"+i));
        }
        request.setAttribute("stus", studentList);
    %>
    <table>
    	 <tr>
            <th>No</th>
            <th>Name</th>
            <th>password</th>
            <th>age</th>
            <th>tel</th>
            <th>operation</th>
        </tr>
    <c:forEach begin="2" end="7" step="2" varStatus="status" items="${requestScope.stus}" var="stu">
    	<tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.password}</td>
            <td>${stu.age}</td>
            <td>${stu.phone}</td>
       	    <td>${status}</td>    
            <th><button>刪除</button><button>修改</button></th>
        </tr>
    </c:forEach>
    </table>
         <button>儲存</button>
    
	
	
	
</body>
</html>