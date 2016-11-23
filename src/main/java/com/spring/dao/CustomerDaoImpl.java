package com.spring.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.UserCredential;
import com.spring.model.Customer;
import com.spring.model.UserDetail;
@Repository

public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private SessionFactory sessionFactory;

		public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

		public void addCustomer(Customer customer) {
			Session session=sessionFactory.openSession();
			UserCredential usercredential=new UserCredential();
			usercredential.setCustName(customer.getUserdetail().getCustName());
			usercredential.setUserCredential("ROLE_USER");
			UserDetail users=customer.getUserdetail();
			users.setEnabled(true);
			session.save(customer);
			session.save(usercredential);
			session.flush();
	        session.close();
		}
		public List<Customer> getAllCustomers() {
			Session session=sessionFactory.openSession();
			List<Customer> customers=session.createQuery("from Customer").list();
			return customers;
		}
}
