package by.htp.recruitmentoffice.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import by.htp.recruitmentoffice.dao.UserDao;
import by.htp.recruitmentoffice.domain.Schedule;
import by.htp.recruitmentoffice.domain.User;

@Component
@Repository
@SuppressWarnings("unchecked")
public class UserDaoHibernateImpl implements UserDao{

	@Override
	public void create(User entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User read(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.getCurrentSession();
		session.getTransaction();
		session.beginTransaction();
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}

	@Override
	public List<User> readAll() {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.getTransaction();
		List<User> users = session.createCriteria(User.class).list();
		session.close();
		return users;
	}

	@Override
	public void update(User entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.merge(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(User entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User loginRead(String login, String password) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.eq("login", login)).add(Restrictions.eq("password", password));
		List<User> users = criteria.list();
		
		session.close();
		if (!users.isEmpty()) {
			return users.get(0);
		} else {
			return null;
		}
	}

	@Override
	public User idRead(int id) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria criteria = session.createCriteria(User.class);
		//Criteria cr = session.createCriteria(UserSchedule.class);
		//criteria.add(Restrictions.eq("id", cr.s));
		//cr.add(Restrictions.eq("users_id", id));
		//List<UserSchedule> uS = cr.list();
		Criteria crit = session.createCriteria(Schedule.class);
		//crit.add(Restrictions.eq("", value));
		
//		List<User> users = criteria.list();
//		users.get()
//		User user = new User();
//		Schedule schedule = new Schedule();
//		UserSchedule userSchedule = new UserSchedule();
//		if (user.getId()==userSchedule.getUsers_id()) {
//			//schedule.getUser_schedule_id().equals(userSchedule.getId());
//			Integer sch = schedule.getUser_schedule_id();
//			sch = userSchedule.getId();
//		}
//		return null;
//		CrteriaBuilder cb = 
//		CriteriaQuery<User> criteria = 
//		
//		if (!users.isEmpty()) {
//			return users.get(0);
//		} else {
			return null;
		}
}
