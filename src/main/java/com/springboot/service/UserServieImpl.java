package com.springboot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserRepository;
import com.springboot.model.Inventory;
import com.springboot.model.User;

@Service
@Transactional
public class UserServieImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	public void addUser(User user)
	{
		userRepo.save(user);
	}
	public List<User> getuserList(){
		
		List<User> list=(List<User>) userRepo.findAll();
	   list.forEach(System.out::println);
		return list;
	}
	
	public void deleteUser(int id)
	{
		userRepo.deleteById(id);
	}
	
	
}
