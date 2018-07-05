package by.htp.recruitmentoffice.service;

import java.util.List;

import by.htp.recruitmentoffice.domain.Doctor;

public interface DoctorService {
	
	List<Doctor> getDoctorsList();
	
	Doctor read(int id);
	
	void create(Doctor entity);
	
	void update(Doctor entity);
	
	void delete(Doctor entity);
	
	void deleteD(int id);

}
