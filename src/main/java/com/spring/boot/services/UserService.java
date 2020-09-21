package com.spring.boot.services;


import java.util.List;
import com.spring.boot.entities.User;

public interface UserService {

	public void addUser(User user);
	List<User> findAll();
	public void updateById(User user);
	public User getById(Long id);
	void deleteById(long id);
	

}
