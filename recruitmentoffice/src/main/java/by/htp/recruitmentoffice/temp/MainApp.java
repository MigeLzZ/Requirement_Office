package by.htp.recruitmentoffice.temp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.htp.recruitmentoffice.dao.DoctorDao;
import by.htp.recruitmentoffice.domain.Doctor;

public class MainApp {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-beans.xml");
		DoctorDao dao = (DoctorDao) appContext.getBean("doctorDao");

		System.out.println(dao.read(1));
		
		List<Doctor> doctors = dao.readAll();
		
		for(Doctor doctor : doctors) {
			System.out.println(doctor);
		}
		
//		Doctor doc1 = new Doctor(0, "Пёттр", "Сковородов", "Главный", null);
//		dao.create(new Doctor(0, "sdf", "asdf", "sdfd", null));
//		dao.create(doc1);
//		
//		doc1.setName("pukich");
//		dao.update(doc1);
		
//		dao.delete(3);
	}

}