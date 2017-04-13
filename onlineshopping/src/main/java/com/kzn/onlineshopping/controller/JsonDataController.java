package com.kzn.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kzn.shoppingbackend.dao.ProductDAO;
import com.kzn.shoppingbackend.dto.Product;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {
	
	@Autowired
	private ProductDAO productDAO;		
	
	@RequestMapping("/all/product")
	@ResponseBody
	public List<Product> getAllProduct() {
		return productDAO.listofActiveProduct();
	}
	
	@RequestMapping("/category/{id}/product")
	@ResponseBody
	public List<Product> getProductByCategory(@PathVariable int id) {
		return productDAO.listofActiveProductByCategory(id);
	}
}
