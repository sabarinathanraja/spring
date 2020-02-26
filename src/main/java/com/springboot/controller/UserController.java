package com.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import com.springboot.model.User;
import com.springboot.service.UserService;


@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping("/user")
	public ModelAndView register(Model m)
	{
		m.addAttribute("userform",new User());
		return new ModelAndView("register");
			}
	@PostMapping("/userregister")
	public ModelAndView register(@ModelAttribute("userform")User user,Model m)
	{
		//m.addAttribute("user",new User());
		userService.addUser(user);
		return new ModelAndView("success");
			}
	@GetMapping("/viewUsers")
	public ModelAndView userList(Map<String,Object> map,Model model){
		//model.addAttribute("userlist",new User());		
		List<User> h=userService.getuserList();
		model.addAttribute("userlist",h);
		return new ModelAndView("userlist");
	}
	
	@GetMapping(value = "delete/{id}")
	public String delete(@PathVariable("id") int id) {
	userService.deleteUser(id);
		return "redirect:/userlist";
	}

}
