package com.management.b1.dao;

import java.util.List;

import com.management.b1.dto.RegistrationDTO;

public interface IRegistrationDAOmebc {
	
	RegistrationDTO registOne(RegistrationDTO registrationDTO);
	
	List<String> timeList();
	
	int registHeadCount(String sch_code);
	
	void registInsert(RegistrationDTO registrationDTO) throws Exception;
	
	void refund(RegistrationDTO registrationDTO) throws Exception;
	
	void registUpdate(RegistrationDTO registrationDTO) throws Exception;
	
	void registDelete(RegistrationDTO registrationDTO) throws Exception;
	
}
