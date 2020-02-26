package com.springboot.service;

import java.util.List;

import com.springboot.model.User;

public interface UserService {

	public void addUser(User user);

	public List<User> getuserList();

	public void deleteUser(int id);
	

}
