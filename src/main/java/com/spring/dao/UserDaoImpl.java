package com.spring.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.UserCredential;
import com.spring.model.UserDetail;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void insert(UserDetail userDetail) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		
		session.save(userDetail);
//		
//		session.flush();
		tx.commit();
		session.close();
	}

	public void insertcredent(UserCredential userCredential) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.getTransaction();
		tx.begin();
		
		session.save(userCredential);
//		
//		session.flush();
		tx.commit();
		session.close();
	}

	public UserDetail getUserDetailByCustName(String username) {
			
			Session session = sessionFactory.openSession();
	        Query query = session.createQuery("from UserDetail where CustName = ?");
	        query.setString(0, username);
	        UserDetail users=(UserDetail)query.uniqueResult();
	        return users;
		}

}
