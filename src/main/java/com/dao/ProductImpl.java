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
		List <Product> list=session.createQuery("FROM Product").list();
		session.flush();
		session.close();
		return list;
		
		
	}
	public List<Product> getListProduct(int id) {
		Session session=sessionFactory.openSession();
		List<Product> pl=session.createQuery("FROM Product where id=:id").setParameter("id", id).list();
		session.flush();
		session.close();
		return pl;
	}	
	public Product getById(int id) 
	{	
     	Session session=sessionFactory.openSession();
     	Product p=(Product)session.get(Product.class, id);
     	session.flush();
     	session.close();
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
	public void editProduct(Product p)
	{
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(p);
		session.flush();
		session.close();
		
	}

	
	
}
