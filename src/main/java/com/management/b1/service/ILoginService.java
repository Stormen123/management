package com.management.b1.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.CustomerDTO;

public interface ILoginService {

	//로그인시 ID, PASSWORD 일치여부
	ModelAndView loginCheck(CustomerDTO customerDTO, HttpSession session);
	
	//아이디 이메일로 찾기
	String idFind(String cstmr_mail);
	
	//비밀번호 아이디,이메일로 찾기
	String idMailCheck(CustomerDTO customerDTO);
	
	//idMailCheck에서 아이디, 이메일 일치하면 비밀번호 변경하기
	ModelAndView pwChange(CustomerDTO customerDTO);
}
