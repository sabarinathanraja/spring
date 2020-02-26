package com.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.model.Inventory;

import com.springboot.service.InventoryService;

@RestController
public class InventoryContoller {
	
	@Autowired
	private InventoryService inventoryserv;
	
	@GetMapping("/inventoryview")
	public ModelAndView register(Model model)
	{
		model.addAttribute("inventory",new Inventory());
		return new ModelAndView("inventory");
			}
	@PostMapping("/inventorysave")
	public ModelAndView register(@ModelAttribute("inventory") Inventory inventory,Model model)
	{
		//m.addAttribute("user",new User());
		//userService.addUser(user);
		inventoryserv.inventorysave(inventory);
		return new ModelAndView("success");
			}
	
	@RequestMapping("/inventorylist")
	public ModelAndView inventoryList(Map<String,Object> map,Model model)
	{
		map.put("inventorylist", new Inventory());
		List<Inventory> inven=inventoryserv.getinventoryList();
		model.addAttribute("inventorylist",inven);
		return new ModelAndView("inventorylist");
	}
	

@RequestMapping(value = "/update", method = RequestMethod.GET)
public ModelAndView updateBook(@RequestParam("getId") int bookId, Model model)
{
	System.out.println(bookId);
	inventoryserv.updateBooks(bookId);
	return new ModelAndView("inventorylist");
	
}


}
