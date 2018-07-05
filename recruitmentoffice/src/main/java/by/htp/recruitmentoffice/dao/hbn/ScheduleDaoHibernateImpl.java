package by.htp.recruitmentoffice.dao.hbn;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import by.htp.recruitmentoffice.dao.ScheduleDao;
import by.htp.recruitmentoffice.domain.Schedule;

@Component
@Repository
@SuppressWarnings("unchecked")
public class ScheduleDaoHibernateImpl implements ScheduleDao{

	@Override
	public void create(Schedule entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public Schedule read(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.getCurrentSession();
		session.getTransaction();
		session.beginTransaction();
		Schedule schedule = (Schedule) session.get(Schedule.class, id);
		session.close();
		return schedule;
	}

	@Override
	public List<Schedule> readAll() {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.getTransaction();
		List<Schedule> schedules = session.createCriteria(Schedule.class).list();
		session.close();
		return schedules;
	}

	@Override
	public void update(Schedule entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.merge(entity);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public void delete(Schedule entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public void record(Schedule entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		session.close();
	}

}
