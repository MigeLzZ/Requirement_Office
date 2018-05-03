package by.htp.recruitmentoffice.dao.hbn;

import java.util.List;

import org.hibernate.Session;

import by.htp.recruitmentoffice.dao.DoctorDao;
import by.htp.recruitmentoffice.domain.Doctor;

public class DoctorDaoHibernateImpl implements DoctorDao{

	@Override
	public void create(Doctor entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.saveOrUpdate(entity);
		session.getTransaction().commit();
		session.close();		
	}

	@Override
	public Doctor read(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.getCurrentSession();
		session.getTransaction();
		session.beginTransaction();
		Doctor doctor = (Doctor) session.get(Doctor.class, id);
		session.close();
		return doctor;
	}

	@Override
	public List<Doctor> readAll() {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.getTransaction();
		List<Doctor> doctors = session.createCriteria(Doctor.class).list();
		session.close();
		return doctors;
	}

	@Override
	public void update(Doctor entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.update(entity);
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public void delete(int id) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.delete(new Doctor(id, null, null, null, null));
		session.getTransaction().commit();
		session.close();
	}

}
