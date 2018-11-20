<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>永和大王门店系统</h1>
	<table border="1">
		<tr>
			<td>序号</td>
			<td>门店</td>
			<td>电话</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${doorList }" var="d" varStatus="status">
			<tr>
				<td>${status.index+1 }</td>
				<td>${d.name }</td>
				<td>${d.tel }</td>
				<td>
					<a href="/door/toAdd" >新增</a>
					<a href="/door/toUpdate?id=${d.id}">修改</a>
					<a href="/door/delete?id=${d.id}">删除</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>