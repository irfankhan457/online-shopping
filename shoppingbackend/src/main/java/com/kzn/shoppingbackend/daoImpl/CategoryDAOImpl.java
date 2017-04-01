package com.kzn.shoppingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kzn.shoppingbackend.dao.CategoryDAO;
import com.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {


	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		Category c1 = new Category();
		c1.setId(1);
		c1.setName("Television");
		c1.setDescription("This is Television");
		c1.setImageURL("CAT_1.png");
		categories.add(c1);
		
		Category c2 = new Category();	
		c2.setId(2);
		c2.setName("Mobile");
		c2.setDescription("This is Mobile");
		c2.setImageURL("CAT_2.png");
		categories.add(c2);
		
		Category c3 = new Category();
		c3.setId(3);
		c3.setName("Laptop");
		c3.setDescription("This is Laptop");
		c3.setImageURL("CAT_3.png");
		categories.add(c3);
		
		Category c4 = new Category();
		c4.setId(4);
		c4.setName("Car");
		c4.setDescription("This is Car");
		c4.setImageURL("CAT_4.png");
		categories.add(c4);
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

}
