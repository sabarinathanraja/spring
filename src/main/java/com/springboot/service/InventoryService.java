package com.springboot.service;


import java.util.List;

import org.springframework.transaction.annotation.Transactional;


import com.springboot.model.Inventory;


public interface InventoryService {
	
	public void inventorysave(Inventory inventory);

	public List<Inventory> getinventoryList();

	public void updateBooks(int bookId);
	

	

}
