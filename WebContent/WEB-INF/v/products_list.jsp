<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询所有商品</title>
<link rel="stylesheet" type="text/css" href="a/css/index3.css"></link>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<th>商品名称</th>
			<th>商品价格</th>
			<th>入库时间</th>
			<th>商品描述</th>
			<th>商品分类</th>
			<th>操作 <a href="addProduct.jsp">添加</a></th>
		</tr>
		<c:forEach items="${products }" var="product">
			<tr>
				<td>${product.name }</td>
				<td>${product.price }</td>
				<td>${product.createtime }</td>
				<td>${product.detail }</td>
				<td><c:forEach  items="${product.categories }" var="category">
						${category.name }&nbsp&nbsp
					</c:forEach>
				</td>
				<td><a href="deleteProduct.do?id=${product.id }">删除</a> <a
					href="selectById.do?id=${product.id }">修改</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>