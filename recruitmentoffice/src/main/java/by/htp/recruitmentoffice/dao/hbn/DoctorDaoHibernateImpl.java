package by.htp.recruitmentoffice.dao.hbn;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import by.htp.recruitmentoffice.dao.DoctorDao;
import by.htp.recruitmentoffice.domain.Doctor;

@Component
@Repository
@SuppressWarnings("unchecked")
public class DoctorDaoHibernateImpl implements DoctorDao{

	@Override
	public void create(Doctor entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
		session.save(entity);
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
		session.getTransaction();
		session.beginTransaction();
		session.update(entity);
		//session.replicate(entity, ReplicationMode.OVERWRITE);
		session.getTransaction().commit();
		session.close();
		//session.persist(entity);
//		session.getTransaction().commit();
//		session.clear();
//		session.flush();
//		session.clear();
//		session.getTransaction().begin();
//		session.merge(entity);
//		session.saveOrUpdate(entity);
//		session.getTransaction().commit();
//		session.close();	
	}

	@Override
	public void deleteD(int id) {
		Doctor doctor = new Doctor();
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
//		session.persist(entity);
		session.delete(id);
		session.getTransaction().commit();
//		session.getTransaction().begin();
//		session.delete(entity);
//
//		session.getTransaction().commit();
		session.close();
		//session.getTransaction();
		
//		Doctor doctor = (Doctor) session.createCriteria(Doctor.class).add(Restrictions.eq("id", id)).uniqueResult();
//		session.delete(doctor);
//		session.close();
//		sTransaction transaction = session.beginTransaction();
		
//		String hql = "delete from doctors where id= ?";
//		Query query = session.createQuery(hql);
//		System.out.println(doctor.getId());
//		query.setString(doctor.getId(), "id");
//		System.out.println(query.executeUpdate());
//		transaction.commit();
		//session.createQuery(hql).setLong("id", id).executeUpdate();
		
		//session.close();
	}

	@Override
	public void delete(Doctor entity) {
		Session session = SessionFactoryManager
				.getSessionFactory()
				.openSession();
		session.beginTransaction();
//		session.persist(entity);
//		session.getTransaction().commit();
//		session.getTransaction().begin();
		session.delete(entity);
//
		session.getTransaction().commit();
		session.close();
		
	}

}
