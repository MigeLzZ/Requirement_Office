package by.htp.recruitmentoffice.service;

import java.util.List;

import by.htp.recruitmentoffice.domain.PrivatePortfolio;

public interface PrivatePortfolioService {

	List<PrivatePortfolio> getPrivatePortfoliosList();
	
	PrivatePortfolio read(int id);
	
	void create(PrivatePortfolio entity);
	
	void update(PrivatePortfolio entity);
	
	void delete(PrivatePortfolio entity);
}
