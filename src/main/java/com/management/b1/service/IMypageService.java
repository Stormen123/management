package com.management.b1.service;

import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.CustomerDTO;

public interface IMypageService {
	
	//회원정보 변경
	ModelAndView cstmrUpdate(CustomerDTO customerDTO) throws Exception;
	
	//회원탈퇴
	ModelAndView cstmrDelete(CustomerDTO customerDTO) throws Exception;
	
	//비밀번호변경
	ModelAndView pwChange(HttpSession session);
		
	//마이페이지 이동시, 회원탈퇴시 비밀번호 한번 더 입력하고 비밀번호 맞는지 확인
	ModelAndView pwCheck(HttpSession session, String cstmr_password);
	
}
