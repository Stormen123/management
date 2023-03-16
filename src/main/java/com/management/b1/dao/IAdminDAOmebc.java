package com.management.b1.dao;

import java.util.List;

import com.management.b1.dto.CustomerDTO;

public interface IAdminDAOmebc {
	
	// 이름으로 관리자 검색
	List<CustomerDTO> adminNameSearch(String cstmr_code);
	
	//관리자 리스트 조회
	List<CustomerDTO> adminList();
	
	// 관리자추가
	void adminInsert(CustomerDTO customerDTO) throws Exception;
	
}
