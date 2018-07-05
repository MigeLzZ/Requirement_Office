package by.htp.recruitmentoffice.dao;

import by.htp.recruitmentoffice.domain.User;

public interface UserDao extends BaseDao<User> {

	User loginRead(String login, String password);
	
	User idRead(int id);
}
