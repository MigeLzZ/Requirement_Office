package by.htp.recruitmentoffice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.htp.recruitmentoffice.dao.UserDao;
import by.htp.recruitmentoffice.domain.User;
import by.htp.recruitmentoffice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	public UserServiceImpl() {
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getUsersList() {
		return userDao.readAll();
	}

	@Override
	public User read(int id) {
		return userDao.read(id);
	}

	@Override
	public void create(User entity) {
		userDao.create(entity);
	}

	@Override
	public void update(User entity) {
		userDao.update(entity);
	}

	@Override
	public void delete(User entity) {
		userDao.delete(entity);
	}

	@Override
	public User loginRead(String login, String password) {
		return userDao.loginRead(login, password);
	}

}
