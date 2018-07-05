package by.htp.recruitmentoffice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.htp.recruitmentoffice.dao.DoctorDao;
import by.htp.recruitmentoffice.domain.Doctor;
import by.htp.recruitmentoffice.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorDao doctorDao;
	
	public DoctorServiceImpl() {
	}

	public DoctorDao getDoctorDao() {
		return doctorDao;
	}

	public void setDoctorDao(DoctorDao doctorDao) {
		this.doctorDao = doctorDao;
	}

	@Override
	public List<Doctor> getDoctorsList() {
		return doctorDao.readAll();
	}

	@Override
	public Doctor read(int id) {
		return doctorDao.read(id);
	}

	@Override
	public void create(Doctor entity) {
		doctorDao.create(entity);
		
	}

	@Override
	public void update(Doctor entity) {
		doctorDao.update(entity);
		
	}

	@Override
	public void delete(Doctor entity) {
		doctorDao.delete(entity);		
	}

	@Override
	public void deleteD(int id) {
		doctorDao.deleteD(id);
		
	}

}
