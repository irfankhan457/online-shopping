package com.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kzn.shoppingbackend.config.HibernateConfig;
import com.kzn.shoppingbackend.dao.CategoryDAO;
import com.kzn.shoppingbackend.daoImpl.CategoryDAOImpl;
import com.kzn.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.kzn.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	/*
	 * @Test public void testAddCategory() {
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Laptop");
	 * category.setDescription("This is some description for laptop!");
	 * category.setImageURL("CAT_105.png");
	 * 
	 * assertEquals("Successfully added a category inside the table!",true,
	 * categoryDAO.add(category));
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void getCategory() { category = categoryDAO.get(2);
	 * 
	 * assertEquals("Successfully added a category inside the table!","Laptop",
	 * category.getName()); }
	 */

	/*
	 * @Test public void updateCategory() { category = categoryDAO.get(2);
	 * category.setName("Lenovo");
	 * 
	 * assertEquals("Successfully added a category inside the table!",true,
	 * categoryDAO.update(category)); }
	 */

	/*
	 * @Test public void deleteCategory() { category = categoryDAO.get(3);
	 * assertEquals
	 * ("Successfully added a category inside the table!",true,categoryDAO
	 * .delete(category)); }
	 */
	/*
	 * @Test public void listCategory() {
	 * assertEquals("Successfully added a category inside the table!"
	 * ,8,categoryDAO.list().size()); }
	 */

	@Test
	public void testCrudOfCategory() {
		/************************ Adding Category *********************/
		category = new Category();

		category.setName("Car");
		category.setDescription("This is some description for Car!");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully added a category inside the table!", true,categoryDAO.add(category));

		category = new Category();

		category.setName("TeleVision");
		category.setDescription("This is some description for TV!");
		category.setImageURL("CAT_4.png");

		assertEquals("Successfully added a category inside the table!", true,categoryDAO.add(category));
		/************************ Adding Category *********************/

		/************************ Update Category *********************/
		category = categoryDAO.get(2);
		category.setName("Lenovo");

		assertEquals("Successfully added a category inside the table!", true,categoryDAO.update(category));
		/************************ Update Category *********************/

		/************************ Delete Category *********************/
		category = categoryDAO.get(2);
		assertEquals("Successfully added a category inside the table!", true,categoryDAO.delete(category));
		/************************ Delete Category *********************/
		
		/************List of Category **************/
		assertEquals("Successfully added a category inside the table!",1,categoryDAO.list().size());
	}
	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * 
	 * 
	 * assertEquals("Successfully fetched a single category from the table!",
	 * "Television",category.getName());
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * 
	 * category.setName("TV");
	 * 
	 * assertEquals("Successfully updated a single category in the table!",true,
	 * categoryDAO.update(category));
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void testDeleteCategory() {
	 * 
	 * category = categoryDAO.get(3);
	 * assertEquals("Successfully deleted a single category in the table!"
	 * ,true,categoryDAO.delete(category));
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched the list of categories from the table!"
	 * ,3,categoryDAO.list().size());
	 * 
	 * 
	 * }
	 */

	/*
	 * @Test public void testCRUDCategory() {
	 * 
	 * // add operation category = new Category();
	 * 
	 * category.setName("Laptop");
	 * category.setDescription("This is some description for laptop!");
	 * category.setImageURL("CAT_1.png");
	 * 
	 * assertEquals("Successfully added a category inside the table!",true,
	 * categoryDAO.add(category));
	 * 
	 * 
	 * category = new Category();
	 * 
	 * category.setName("Television");
	 * category.setDescription("This is some description for television!");
	 * category.setImageURL("CAT_2.png");
	 * 
	 * assertEquals("Successfully added a category inside the table!",true,
	 * categoryDAO.add(category));
	 * 
	 * 
	 * // fetching and updating the category category = categoryDAO.get(2);
	 * 
	 * category.setName("TV");
	 * 
	 * assertEquals("Successfully updated a single category in the table!",true,
	 * categoryDAO.update(category));
	 * 
	 * 
	 * // delete the category
	 * assertEquals("Successfully deleted a single category in the table!"
	 * ,true,categoryDAO.delete(category));
	 * 
	 * 
	 * //fetching the list
	 * assertEquals("Successfully fetched the list of categories from the table!"
	 * ,1,categoryDAO.list().size());
	 * 
	 * 
	 * }
	 */

}
