package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Product;
@Repository
public class ProductImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	public void addProduct(Product product)
	{
	Session session=sessionFactory.openSession();
	session.save(product);
	session.flush();
	session.close();	
	}
	
	public List<Product> getAllProducts() {
		Session session=sessionFactory.openSession();
		return session.createQuery("FROM Product").list();
		
	}
	
	public Product getById(int id) 
	{	
     	Session session=sessionFactory.openSession();
     	Product p=(Product)session.get(Product.class, id);
     	return p;
     	
	}

	public void deleteById(int id) {
		Product p=new Product();
		Session session=sessionFactory.openSession();
		p.setId(id);
		session.delete(p);
		session.flush();
		session.close();	
		
	}
	public void editProduct(int id,Product p)
	{	p.setId(id);
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(p);
		session.flush();
		session.close();
		
	}

	
	
}
