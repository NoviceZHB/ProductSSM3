package com.zhb.dao;
/**
*@开发人员:占沪斌
*@创建时间:2018年9月7日上午11:40:11
*/

import java.util.List;
import java.util.Map;

import com.zhb.domain.Category;
import com.zhb.domain.Product;

public interface ProductMapper {
	
	public List<Product> queryAllPro();
	
	public int addProduct(Product product);
	
	public int deleteProduct(int id);

	public int updateProduct(Product product);
	
	public Product selectById(int id);
	
    public List<Category> queryAllCateById(Map<Object, Object> map);

}
