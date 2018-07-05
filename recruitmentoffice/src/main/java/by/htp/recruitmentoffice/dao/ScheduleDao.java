package by.htp.recruitmentoffice.dao;

import by.htp.recruitmentoffice.domain.Schedule;

public interface ScheduleDao extends BaseDao<Schedule>{

	void record(Schedule entity);
}
