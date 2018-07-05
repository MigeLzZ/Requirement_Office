package by.htp.recruitmentoffice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.htp.recruitmentoffice.dao.PrivatePortfolioDao;
import by.htp.recruitmentoffice.domain.PrivatePortfolio;
import by.htp.recruitmentoffice.service.PrivatePortfolioService;

@Service
public class PrivatePortfolioServiceImpl implements PrivatePortfolioService{

	@Autowired
	private PrivatePortfolioDao privatePortfolioDao;
	
	public PrivatePortfolioServiceImpl() {
	}
	
	public PrivatePortfolioDao getPrivatePortfolioDao() {
		return privatePortfolioDao;
	}

	public void setPrivatePortfolioDao(PrivatePortfolioDao privatePortfolioDao) {
		this.privatePortfolioDao = privatePortfolioDao;
	}

	@Override
	public List<PrivatePortfolio> getPrivatePortfoliosList() {
		return privatePortfolioDao.readAll();
	}

	@Override
	public PrivatePortfolio read(int id) {
		return privatePortfolioDao.read(id);
	}

	@Override
	public void create(PrivatePortfolio entity) {
		privatePortfolioDao.create(entity);		
	}

	@Override
	public void update(PrivatePortfolio entity) {
		privatePortfolioDao.update(entity);		
	}

	@Override
	public void delete(PrivatePortfolio entity) {
		privatePortfolioDao.delete(entity);		
	}

}
