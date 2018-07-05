package by.htp.recruitmentoffice.service;

import java.util.List;

import by.htp.recruitmentoffice.domain.Call;

public interface CallService {

	List<Call> getCallsList();
	
	Call read(int id);
	
	void create(Call entity);
	
	void update(Call entity);
	
	void delete(Call entity);
}
