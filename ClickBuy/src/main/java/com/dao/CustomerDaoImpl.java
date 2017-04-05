package com.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.model.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	SessionFactory sessionFactory;
	public void addCustomer(Customer cus) {
		Session session=sessionFactory.openSession();
		cus.setEnabled(true);
		cus.setRole("ROLE_USER");
		session.save(cus);
		session.flush();
		session.close();
		
	}

}
