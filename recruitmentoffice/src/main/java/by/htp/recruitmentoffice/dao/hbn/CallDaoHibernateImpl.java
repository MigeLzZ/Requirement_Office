package by.htp.recruitmentoffice.dao.hbn;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import by.htp.recruitmentoffice.dao.CallDao;
import by.htp.recruitmentoffice.domain.Call;

@Component
@Repository
@SuppressWarnings("unchecked")
public class CallDaoHibernateImpl implements CallDao{

	@Override
	public void create(Call entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();	
	}

	@Override
	public Call read(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.getCurrentSession();
		session.getTransaction();
		session.beginTransaction();
		Call call = (Call) session.get(Call.class, id);
		session.close();
		return call;
	}

	@Override
	public List<Call> readAll() {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.getTransaction();
		List<Call> calls = session.createCriteria(Call.class).list();
		session.close();
		return calls;
	}

	@Override
	public void update(Call entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.merge(entity);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Call entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();
	}

}
