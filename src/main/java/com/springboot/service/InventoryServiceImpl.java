package com.springboot.service;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.InventoryRepository;
import com.springboot.model.Inventory;

@Service
@Transactional
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryRepository inventoryRepo;
	public void inventorysave(Inventory inventory)
	{
		inventoryRepo.save(inventory);
	}
	public List<Inventory> getinventoryList()
	{
	List<Inventory> invenlist=(List<Inventory>) inventoryRepo.findAll();
			return invenlist;
		
		}
	public void updateBooks(int bookId)
	{
		Integer q;
		Inventory insave=new Inventory();
		Optional<Inventory> inven=inventoryRepo.findById(bookId);
		if(inven.isPresent())
		{
			
		  q=inven.get().getQuantity();
		  insave.setQuantity(inven.get().getQuantity()-1);
		  insave.setBookId(bookId);
		  insave.setAuthor(inven.get().getAuthor());
		  insave.setBookName(inven.get().getBookName());
		  insave.setDescription(inven.get().getDescription());
		  insave.setPrice(inven.get().getPrice());
		  inventoryRepo.save(insave);
			  
		}
		
		
		
		
	}

}
