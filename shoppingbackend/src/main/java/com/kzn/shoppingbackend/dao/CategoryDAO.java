package com.kzn.shoppingbackend.dao;

import java.util.List;

import com.kzn.shoppingbackend.dto.Category;

public interface CategoryDAO {
	/**
	 * single item of Category
	 * @param id
	 * @return true if successful
	 */
	Category get(int id);
	
	/**
	 * list of Items of Category
	 * @return true if successful
	 */
	List<Category> list();
	
	/**
	 * add the Item and return true
	 * @param category
	 * @return true if successful
	 */
	boolean add(Category category);
	/**
	 * update the data member of the Specific Category
	 * @param category
	 * @return true if successful
	 */
	boolean update(Category category);
	
	/**
	 * Delete the Specific Category
	 * @param category
	 * @return true if successful
	 */
	boolean delete(Category category);
}
