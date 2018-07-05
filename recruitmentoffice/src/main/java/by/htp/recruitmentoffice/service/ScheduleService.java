package by.htp.recruitmentoffice.service;

import java.util.List;

import by.htp.recruitmentoffice.domain.Schedule;

public interface ScheduleService {

	List<Schedule> getSchedulesList();
	
	Schedule read(int id);
	
	void create(Schedule entity);
	
	void update(Schedule entity);
	
	void delete(Schedule entity);
	
	void record(Schedule entity);
}
