<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加商品页面</title>
<link rel="stylesheet" type="text/css" href="a/css/index3.css"></link>
<script type="text/javascript" src="a/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<form action="addProduct.do" method="post">
		<table align="center">
			<tr>
				<td>商品名称:</td>
				<td><input type="text" name="name"></td>
				<td></td>
			</tr>
			<tr>
				<td>商品价格:</td>
				<td><input type="text" name="price"></td>
				<td></td>
			</tr>
			<tr>
				<td>入库时间:</td>
				<td><input type="text" name="createtime"
					onclick="WdatePicker()"></td>
				<td></td>
			</tr>
			<tr>
				<td>商品描述:</td>
				<td><input type="text" name="detail"></td>
				<td></td>
			</tr>
			<tr>
				<td>商品分类:</td>
				<td>手机:<input type="checkbox" name="cids" value="1">
					电子产品:<input type="checkbox" name="cids" value="2"> 电脑:<input
					type="checkbox" name="cids" value="3">
				</td>
				<td><input type="submit" value="增加"><a
					href="products.do"><input type="button" value="返回"></a></td>
			</tr>
		</table>
	</form>
</body>
</html>