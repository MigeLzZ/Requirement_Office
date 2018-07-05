package by.htp.recruitmentoffice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.htp.recruitmentoffice.dao.ScheduleDao;
import by.htp.recruitmentoffice.domain.Schedule;
import by.htp.recruitmentoffice.service.ScheduleService;

@Service
public class ScheduleServiceImpl implements ScheduleService{

	@Autowired
	private ScheduleDao scheduleDao;
	
	public ScheduleServiceImpl() {
	}
	
	public ScheduleDao getScheduleDao() {
		return scheduleDao;
	}

	public void setScheduleDao(ScheduleDao scheduleDao) {
		this.scheduleDao = scheduleDao;
	}

	@Override
	public List<Schedule> getSchedulesList() {
		return scheduleDao.readAll();
	}

	@Override
	public Schedule read(int id) {
		return scheduleDao.read(id);
	}

	@Override
	public void create(Schedule entity) {
		scheduleDao.create(entity);		
	}

	@Override
	public void update(Schedule entity) {
		scheduleDao.update(entity);		
	}

	@Override
	public void delete(Schedule entity) {
		scheduleDao.delete(entity);		
	}

	@Override
	public void record(Schedule entity) {
		scheduleDao.record(entity);		
	}

}
