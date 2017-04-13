package com.kzn.shoppingbackend.daoImpl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kzn.shoppingbackend.dao.ProductDAO;
import com.kzn.shoppingbackend.dto.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Product get(int productId) {
		try {
			return sessionFactory
					.getCurrentSession()
						.get(Product.class, Integer.valueOf(productId));
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		return null;
	}

	@Override
	public List<Product> list() {
		
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM Product", Product.class)
						.getResultList();
	}

	@Override
	public boolean add(Product product) {
		try {
			sessionFactory
				.getCurrentSession()
					.persist(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Product product) {
		try {
			sessionFactory
				.getCurrentSession()
					.update(product);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Product product) {
		try {
			product.setActive(false);
			//soft delete
			return this.update(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> listofActiveProduct() {
		String activeProductList = "FROM Product WHERE active =:active ";
		
		Query query = sessionFactory.getCurrentSession().createQuery(activeProductList);
		query.setParameter("active", true);
		
		return query.getResultList();
	}

	@Override
	public List<Product> listofActiveProductByCategory(int categoryId) {
		String activeProductList = "FROM Product WHERE active =:active AND categoryId = :CategoryId";

		Query query = sessionFactory.getCurrentSession().createQuery(
				activeProductList, Product.class);
		query.setParameter("active", true);
		query.setParameter("CategoryId", categoryId);

		return query.getResultList();
	}

	@Override
	public List<Product> getLatestActiveProduct(int count) {
		Query query = sessionFactory.getCurrentSession().createQuery(
				"FROM Product WHERE active =:active ORDER BY id", Product.class);
		query.setParameter("active", true).setFirstResult(0).setMaxResults(count);
		return query.getResultList();
	}

}
