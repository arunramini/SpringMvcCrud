package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.UserDao;
import com.test.model.User;
@Service("userService")
public class UserServiceimpl implements UserService{

    @Autowired
	public UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Transactional
	public void addEmployee(User user) {
		// TODO Auto-generated method stub
		System.out.println("EmployeeServiceImpl********* addEmployee");
		userDao.addEmployee(user);
	}

	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

}
