package by.htp.recruitmentoffice.dao.hbn;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import by.htp.recruitmentoffice.dao.PrivatePortfolioDao;
import by.htp.recruitmentoffice.domain.PrivatePortfolio;

@Component
@Repository
@SuppressWarnings("unchecked")
public class PrivatePortfolioDaoHibernateImpl implements PrivatePortfolioDao {

	@Override
	public void create(PrivatePortfolio entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public PrivatePortfolio read(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.getCurrentSession();
		session.getTransaction();
		session.beginTransaction();
		PrivatePortfolio pf = (PrivatePortfolio) session.get(PrivatePortfolio.class, id);
		session.close();
		return pf;
	}

	@Override
	public List<PrivatePortfolio> readAll() {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.getTransaction();
		List<PrivatePortfolio> pf = session.createCriteria(PrivatePortfolio.class).list();
		session.close();
		return pf;
	}

	@Override
	public void update(PrivatePortfolio entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.merge(entity);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public void delete(PrivatePortfolio entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.delete(entity);
		session.getTransaction().commit();
		session.close();		
	}

}
