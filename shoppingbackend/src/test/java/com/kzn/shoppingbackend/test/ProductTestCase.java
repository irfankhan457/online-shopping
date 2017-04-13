package com.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kzn.shoppingbackend.dao.ProductDAO;
import com.kzn.shoppingbackend.dto.Product;

public class ProductTestCase {
	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.kzn.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	/*
	@Test
	public void testCRUDProduct() {
		product = new Product();
		product.setActive(true);
		product.setBrand("oppo");
		product.setCategoryId(3);
		product.setName("Oppo Selfi ");
		product.setDescription("This is Oppo phone for selfi");
		product.setUnitPrice(5000);
		product.setCategoryId(2);
		product.setSupplierId(3);
		
		assertEquals("Something happened Wrong While Inseting data", true, productDAO.add(product));
		
		//Reading and Updating Category
		product = productDAO.get(2);
		product.setName("Samsung Galaxy on7");
		
		assertEquals("Something happened Wrong While updating data", true, productDAO.update(product));
		
		// soft deleting 
		assertEquals("Something happened Wrong While deleting data", true, productDAO.delete(product));
		
		//List
		assertEquals("Something happened Wrong While Listing data", 6, productDAO.list().size());
	}
*/
	
	@Test
	public void testListActiveProduct() {
		assertEquals("Somthing went Wrong when fetching List of Product", 5, productDAO.listofActiveProduct().size());
	}
	
	@Test
	public void testListOfActiveProByCategory() {
		assertEquals("Somthing went Wrong when fetching List of Product", 5, productDAO.listofActiveProductByCategory(2).size());
	}
	
	@Test
	public void testLatestActiveProduct() {
		assertEquals("Somthing went Wrong when fetching List of Product", 3, productDAO.getLatestActiveProduct(3).size());
	}
}
