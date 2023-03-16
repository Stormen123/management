package com.management.b1.dao;

import com.management.b1.dto.CustomerDTO;

public interface ISignUpDAO {
	
	//회원가입시 아이디 중복체크
	CustomerDTO idCheck(String cstmr_id);
	
	//회원가입, 회원정보변경 이메일 중복체크
	CustomerDTO emailCheck(String cstmr_email);
	
}
