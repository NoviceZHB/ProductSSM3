<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加商品页面</title>
<link rel="stylesheet" type="text/css" href="a/css/index3.css"></link>
<script type="text/javascript" src="a/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<form action="updateProduct.do" method="post">
		<table align="center">
			<tr>
				<td>商品名称:</td>
				<td><input type="text" name="name" value="${product.name }"></td>
			</tr>
			<tr>
				<td>商品价格:</td>
				<td><input type="text" name="price" value="${product.price }"></td>
			</tr>
			<tr>
				<td>入库时间:</td>
				<td><input type="text" name="createtime"
					value="${product.createtime }" onclick="WdatePicker()"></td>
			</tr>
			<tr>
				<td>商品描述:</td>
				<td><input type="text" name="detail" value="${product.detail }"></td>
			</tr>
			<tr>
				<td>商品分类:</td>
				<td>
					手机<input type="checkbox" name="cids" value="1" <c:if test="${fn:contains(product.cids,'1')}">checked="checked"</c:if>>
					电子产品<input type="checkbox" name="cids" value="2" <c:if test="${fn:contains(product.cids,'2')}">checked="checked"</c:if>>
					电脑<input type="checkbox" name="cids" value="3" <c:if test="${fn:contains(product.cids,'3')}">checked="checked"</c:if>>					
				</td>
			</tr>
			<tr>
				<td><input type="text" name="id" value="${product.id }"
					hidden="hidden"></td>
				<td><input type="submit" value="修改"><a
					href="products.do"><input type="button" value="返回"></a></td>
			</tr>
		</table>
	</form>
</body>
</html>