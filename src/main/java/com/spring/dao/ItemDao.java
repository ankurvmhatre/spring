package com.spring.dao;

import java.util.List;

import com.spring.model.Item;

public interface ItemDao {
	List<Item> getAllItems();
	List<Item> displayAllProducts();
	Item getItemByIsbn(int isbn);
	void deleteItem(int isbn);
    void addItem(Item item);
    void editItem(Item item);
}
