package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Cart;

@Repository
public class CartImpl implements CartDao{

	@Autowired
	SessionFactory sessionFactory;
	public void addtocart(Cart c) {
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(c);
		session.flush();
		session.close();
	}
	public void removeFromCart(Cart c) {
		Session session=sessionFactory.openSession();
		session.saveOrUpdate(c);
		session.flush();
		session.close();
		
	}
	public Cart getCartDetails(int id) {
			Session session=sessionFactory.openSession();
			Cart c=(Cart) session.get(Cart.class, id);
			session.close();
			return c;
	}

}
