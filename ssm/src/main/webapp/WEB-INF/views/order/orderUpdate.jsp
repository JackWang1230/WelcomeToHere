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
	<form action="/order/update" method="post">
		<input type="hidden" name="id" value="${order.id }">
		<h1>永和大王订单系统（修改界面）</h1>
		<table border="1">
			<tr>
				<td>门店名称：</td>
				<td>
				<select name="door.id">
						<!-- door.id是order的属性 在form表单提交时，可以传出去 -->
						<option value="">--请选择--</option>
						<c:forEach items="${doorList}" var="d">
							<option value="${d.id}"
								<c:if test="${d.id==order.door.id}">selected</c:if>>${d.name}</option>
						</c:forEach>
						
				</select>
				</td>
			</tr>
			<tr>
				<td>订单号</td>
				<td><input type="text" name="orderNo" value="${order.orderNo }" /></td>
				<td>订单类型</td>
				<td><input type="text" name="orderType" value="${order.orderType }" /></td>
			</tr>
			<tr>
				<td>人数</td>
				<td><input type="text" name="personNum" value="${order.personNum }" /></td>
				<td>收银员</td>
				<td><input type="text" name="cashier" value="${ order.cashier}" /></td>
			</tr>
			<tr>
				<td>下单时间</td>
				<td><input type="text" name="createTime"
					value="<fmt:formatDate value="${order.createTime }" pattern="yyyy-MM-dd HH:mm:ss"/>" /></td>
				<td>结账时间</td>
				<td><input type="text" name="endTime" 
				    value="<fmt:formatDate value="${order.endTime}" pattern="yyyy-MM-dd HH:mm:ss" />"/></td>
			</tr>
			<tr>
				<td>支付方式</td>
				<td><input type="text" name="paymentType"
					value="${order.paymentType }" /></td>
				<td>支付金额</td>
				<td><input type="text" name="price" value="${order.price }" /></td>
			</tr>
		</table>
		<div style="padding: 10px">
			<input type="submit" value="提交" /> <input type="button" name="back"
				value="返回" onclick="history.go(-1)">
		</div>
	</form>

</body>
</html>