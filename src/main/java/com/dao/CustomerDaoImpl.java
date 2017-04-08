package com.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Cart;
import com.model.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	SessionFactory sessionFactory;
	public void addCustomer(Customer cus) {
		Session session=sessionFactory.openSession();
		cus.setEnabled(true);
		cus.setRole("ROLE_USER");
		cus.setCart( new Cart());
		session.save(cus);
		session.flush();
		session.close();
		
	}
	public List<Customer> getByName(String email) {
		
		Session session=sessionFactory.openSession();
		List<Customer> c=(List<Customer>) session.createQuery("FROM Customer where email=:email").setParameter("email", email).list();
		session.flush();
		session.close();
		return c;   	
	}

}
