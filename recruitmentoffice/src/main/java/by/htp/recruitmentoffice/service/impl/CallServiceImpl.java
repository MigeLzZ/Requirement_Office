package by.htp.recruitmentoffice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.htp.recruitmentoffice.dao.CallDao;
import by.htp.recruitmentoffice.domain.Call;
import by.htp.recruitmentoffice.service.CallService;

@Service
public class CallServiceImpl implements CallService{

	@Autowired
	private CallDao callDao;
	
	public CallServiceImpl() {
	}
	
	public CallDao getCallDao() {
		return callDao;
	}

	public void setCallDao(CallDao callDao) {
		this.callDao = callDao;
	}

	@Override
	public List<Call> getCallsList() {
		return callDao.readAll();
	}

	@Override
	public Call read(int id) {
		return callDao.read(id);
	}

	@Override
	public void create(Call entity) {
		callDao.create(entity);		
	}

	@Override
	public void update(Call entity) {
		callDao.update(entity);		
	}

	@Override
	public void delete(Call entity) {
		callDao.delete(entity);		
	}

}
