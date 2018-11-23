package com.zhb.c;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.zhb.domain.Product;
import com.zhb.service.ProductService;

/**
 * @开发人员:占沪斌
 * @创建时间:2018年9月7日上午11:45:50
 */
@Controller
public class ProductC {
	@Autowired
	private ProductService service;

	@RequestMapping("/products.do")
	public ModelAndView queryAllPro() {
		List<Product> products = service.queryAllPro();
		System.out.println("所有产品信息:");
		System.out.println(products);
		ModelAndView mv = new ModelAndView();
		mv.addObject("products", products);
		mv.setViewName("/products_list");
		return mv;
	}
	
	@RequestMapping("/addProduct.do")
	public ModelAndView addProduct(Product product) {
		int result = service.addProduct(product);
		ModelAndView mv = new ModelAndView();
		if (result > 0) {
			System.out.println("-----添加成功-----");
			mv.setViewName("redirect:products.do");
		}else {
			mv.setViewName("/error");
		}
		return mv;
	}
	
	@RequestMapping("/deleteProduct.do")
	public ModelAndView deleteProduct(int id) {
		int result = service.deleteProduct(id);
		ModelAndView mv = new ModelAndView();
		if (result > 0) {
			System.out.println("-----删除成功-----");
			mv.setViewName("redirect:products.do");
		}else {
			mv.setViewName("/error");
		}
		return mv;
	}
	
	@RequestMapping("/selectById.do")
	public ModelAndView selectById(int id) {
		 Product product = service.selectById(id);
		ModelAndView mv = new ModelAndView();
		mv.addObject("product",product);
		mv.setViewName("/updateProduct");
		return mv;
	}
	
	@RequestMapping("/updateProduct.do")
	public ModelAndView updateProduct(Product product) {
		int result = service.updateProduct(product);
		ModelAndView mv = new ModelAndView();
		if (result > 0) {
			System.out.println("-----修改成功-----");
			mv.setViewName("redirect:products.do");
		}else {
			mv.setViewName("/error");
		}
		return mv;
	}
	
	
}
