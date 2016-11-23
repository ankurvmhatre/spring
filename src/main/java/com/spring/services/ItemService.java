package com.spring.services;

import java.util.List;

import com.spring.model.Item;

public interface ItemService {
	List<Item> getAllItems();
	List<Item> displayAllProducts();
	Item getItemByIsbn(int isbn);
	void deleteItem(int isbn);
    void addItem(Item item);
    void editItem(Item item);
}
