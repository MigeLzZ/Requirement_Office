package by.htp.recruitmentoffice.service;

import java.util.List;

import by.htp.recruitmentoffice.domain.User;

public interface UserService {

	List<User> getUsersList();
	
	User read(int id);
	
	User loginRead(String login, String password);
	
	void create(User entity);
	
	void update(User entity);
	
	void delete(User entity);
}
