package com.yryj.serviceImpl;

import com.yryj.dao.UserDao;
import com.yryj.model.User;
import com.yryj.sercvice.UserManager;

public class UserML implements UserManager{
private UserDao userDao=null;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userDao.delete(id);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return userDao.find(id);
	}

}