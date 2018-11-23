package com.zhb.domain;

import lombok.Getter;
import lombok.Setter;

/**
*@开发人员:占沪斌
*@创建时间:2018年9月11日上午9:44:38
*/
@Setter@Getter
public class Category {
	private int id;
	private String name;
	public Category() {
		// TODO Auto-generated constructor stub
	}
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}
