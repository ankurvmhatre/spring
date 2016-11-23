package com.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ItemDao;
import com.spring.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;

		public ItemDao getItemDao() {
		return itemDao;
	}

	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	  @Transactional
		public List<Item> getAllItems() {
			return itemDao.getAllItems();
		}
	  public List<Item> displayAllProducts() {
			return itemDao.displayAllProducts();
		}
	  
	  public Item getItemByIsbn(int isbn) {
			return itemDao.getItemByIsbn(isbn);
		}
	  public void deleteItem(int isbn) {
			 itemDao.deleteItem(isbn);
			
		}
      public void addItem(Item item) {
            itemDao.addItem(item);
}
      public void editItem(Item item) {
    		itemDao.editItem(item);
    		
    	}

	}



