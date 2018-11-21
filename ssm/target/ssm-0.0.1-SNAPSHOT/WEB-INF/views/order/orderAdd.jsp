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
<form action="/order/insert" method="post">
<h1>永和大王订单系统（新增界面）</h1>
<table border="1">
	<tr>
		<td>门店名称：</td>
		<td>
			<select name="door.id"> <!-- door.id是order的属性 在form表单提交时，可以传出去,-->
			                        <!--它的values值就等同于下拉框中的option的value值 -->
				<option value="">--请选择--</option>
				<c:forEach items="${doorList}" var="d">
				<option value="${d.id}">${d.name }</option> <!-- jsp中从后台获取的参数，一定要加EL表达式 -->
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td>订单号</td>
		<td><input type="text" name="orderNo"/></td>
		<td>订单类型</td>
		<td><input type="text" name="orderType"/></td>
	</tr>
	<tr>
		<td>人数</td>
		<td><input type="text" name="personNum"/></td>
		<td>收银员</td>
		<td><input type="text" name="cashier"/></td>
	</tr>
	<tr>
		<td>下单时间</td>
		<td><input type="text" name="createTime"/></td>
		<td>结账时间</td>
		<td><input type="text" name="endTime"/></td>
	</tr>
	<tr>
		<td>支付方式</td>
		<td><input type="text" name="paymentType"/></td>
		<td>支付金额</td>
		<td><input type="text" name="price"/></td>
	</tr>
</table>
<div style="padding:10px">
	<input type="submit" value="提交"/>
	<input type="button" name="back" value="返回" onclick="history.go(-1)">
</div>
</form>

</body>
</html>