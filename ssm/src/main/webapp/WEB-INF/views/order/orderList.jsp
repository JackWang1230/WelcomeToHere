<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<h1>永和大王订单系统</h1>
		<tr>
			<td>序号</td>
			<td>门店</td>
			<td>电话</td>
			<td>订单号</td>
			<td>订单类型</td>
			<td>用餐人数</td>
			<td>下单时间</td>
			<td>结束时间</td>
			<td>支付类型</td>
			<td>金额</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${orderList }" var="o" varStatus="status">
			<tr>
				<td>${status.index+1 }</td>
				<td>${o.door.name }</td>
				<td>${o.door.tel }</td>
				<td>${o.orderNo }</td>
				<td>${o.orderType }</td>
				<td>${o.personNum }</td>
				<td><fmt:formatDate value="${o.createTime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><fmt:formatDate value="${o.endTime }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td>${o.paymentType }</td>
				<td>${o.price }</td>
				<td><a href="/order/toAdd">新增</a> <a
					href="/order/toUpdate?id=${o.id }">修改</a> <a
					href="/order/delete?id=${o.id }">删除</a></td>
			</tr>
		</c:forEach>


	</table>

</body>
</html>