package com.management.b1.service;

import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.CustomerDTO;

public interface ISignUpService {

	//회원가입시 회원정보추가
	ModelAndView cstmrInsert(CustomerDTO customerDTO) throws Exception;
	
	//회원가입시 아이디 중복여부 확인(AJAX)
	String idCheck(String cstmr_id);
	
	//회원가입시 이메일 중복여부 확인(AJAX)
	String emailCheck(String cstmr_email);
}
