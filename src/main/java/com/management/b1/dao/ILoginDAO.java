package com.management.b1.dao;

import com.management.b1.dto.CustomerDTO;

public interface ILoginDAO {
	
	//로그인시 아이디 ,비밀번호 일치여부
	CustomerDTO loginCheck(String cstmr_id); 
	
	//아이디 이메일로 찾기
	String idFind(String cstmr_mail);
	
	//비밀번호 찾기 시 입력된 ID와 MAIL이 일치하는지 확인
	CustomerDTO idMailCheck(CustomerDTO customerDTO);
	
	// 일치하면 비밀번호 변경
	void pwChange(CustomerDTO customerDTO);
}