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
	<form action="/door/insert" method="post">
		<h1>永和大王门店系统(新增)</h1>
		<table border="1">
			<tr>
				<td>门店名称</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>电话号码</td>
				<td><input type="text" name="tel"></td>
			</tr>
		</table>

		<div style="paddind: 10px">
			<input type="submit" value="提交">
		</div>
	</form>
</body>
</html>