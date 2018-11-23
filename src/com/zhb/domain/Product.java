package com.zhb.domain;


import java.util.List;

/**
*@开发人员:占沪斌
*@创建时间:2018年9月7日上午11:36:44
*/

public class Product {
	private Integer id;
	private String name;
	private double price;
	private String createtime;
	private String detail;
	private String  cids;
	private List<Category> categories;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Integer id, String name, double price, String createtime, String detail, String  cids,
			List<Category> categories) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.createtime = createtime;
		this.detail = detail;
		this.cids = cids;
		this.categories = categories;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getCids() {
		return cids;
	}
	public void setCids(String cids) {
		this.cids = cids;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", createtime=" + createtime + ", detail="
				+ detail + ", cids=" + cids + ", categories=" + categories + "]\n";
	}
	
	
}
