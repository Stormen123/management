package com.management.b1.dao;

import com.management.b1.dto.CustomerDTO;

public interface ICustomerDAOmebc {
	
	CustomerDTO cstmrOne(String cstmr_code);
	
	// 회원가입시 회원추가
	void cstmrInsert(CustomerDTO customerDTO) throws Exception;
	
	// 마이페이지 정보수정시 
	void cstmrUpdate(CustomerDTO customerDTO) throws Exception;
	
	// 회원탈퇴
	void cstmrDelete(String cstmr_code) throws Exception;
		
}
