package com.zhb.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhb.dao.ProductMapper;
import com.zhb.domain.Category;
import com.zhb.domain.Product;

/**
*@开发人员:占沪斌
*@创建时间:2018年9月7日上午11:42:35
*/
@Service
public class ProductService {
	@Autowired
	private ProductMapper mapper;
	public List<Product> queryAllPro() {
		List<Product> products = mapper.queryAllPro();
		for (Product product : products) {
			String [] ids = product.getCids().split(",");
			Map<Object, Object> map = new HashMap<>();
			map.put("ids", ids);
			List<Category> categories = mapper.queryAllCateById(map);
			product.setCategories(categories);
		}
		return products;
	}
	
	public int addProduct(Product product) {
		return mapper.addProduct(product);		
	}
	
	public int deleteProduct(int id) {
		return mapper.deleteProduct(id);
	}
	
	public int updateProduct(Product product) {
		return mapper.updateProduct(product);
	}
	
	public Product selectById(int id) {
		return mapper.selectById(id);
	}
}
