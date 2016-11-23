package com.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.model.Item;

@Repository
public class ItemDaoImpl implements ItemDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
		public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		public List<Item> getAllItems() {
			Session session=sessionFactory.openSession();
			List<Item> items=session.createQuery("from Item").list();
			session.close();// close the session.
			
			return items;

		}
		public List<Item> displayAllProducts() {
			Session session=sessionFactory.openSession();
			List<Item> items=session.createQuery("from Item").list();
			session.close();// close the session.
			
			return items;

		}

		
		public Item getItemByIsbn(int i) {
			
		  Session session=sessionFactory.openSession();
		  
		  Item item=(Item)session.get(Item.class, i);  
		  session.close();
 		  return item;
		}
		public void deleteItem(int isbn) {
			Session session=sessionFactory.openSession();
			
			Item item=(Item)session.get(Item.class, isbn);
			
			session.delete(item);
			session.flush();
			session.close();
			
		}
		public void addItem(Item item) {
			Session session=sessionFactory.openSession();
			session.save(item);
			session.close();	
	}
		public void editItem(Item item) {
			Session session=sessionFactory.openSession();
			session.update(item);
			
			session.close();
	}

	}

