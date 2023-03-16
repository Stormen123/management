package com.management.b1.service;

import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.LocRegistDTO;
import com.management.b1.dto.MemberDTO;
import com.management.b1.dto.RegistrationDTO;
import com.management.b1.dto.ScheduleDTO;

public interface IRegistrationService {
	
	// 회원등록
	ModelAndView memberInsert(MemberDTO memberDTO) throws Exception;
	
	//회원수정
	ModelAndView memberUpdate(MemberDTO memberDTO) throws Exception;
	
	//회원삭제
	ModelAndView memberDelete(String mber_code) throws Exception;
	
	// 회원정보 넘겨주기
	ModelAndView registPage(MemberDTO memberDTO);
	
	// 시간명, 강좌명으로 시간표 검색
	ModelAndView scheduleSearch(ScheduleDTO scheduleDTO, MemberDTO memberDTO);
		
	// 수업등록
	ModelAndView registInsert(RegistrationDTO registrationDTO, String mber_code) throws Exception;
	
	//수업수정
	ModelAndView registUpdate(RegistrationDTO registrationDTO, String mber_code) throws Exception;
	
	//수업삭제
	ModelAndView registDelete(RegistrationDTO registrationDTO, String mber_code) throws Exception;
	
	//사물함 등록
	ModelAndView locRegistInsert(LocRegistDTO locRegistDTO) throws Exception;
	
	//사물함 수정
	ModelAndView locRegistUpdate(LocRegistDTO locRegistDTO) throws Exception; 
	
	//사물함 삭제
	ModelAndView locRegistDelete(LocRegistDTO locRegistDTO) throws Exception;
	
	//환불
	ModelAndView refund(RegistrationDTO registrationDTO) throws Exception;
	
	
	
	// ========================== AJAX =======================
	
	// 회원 수업 등록시 시간표 조회(AJAX사용)
	String scheduleClass(String sch_time);
	
	//등록페이지에서 등급명, 종목명, 요일명, 등록개월 받아서 가격 띄우기
	String amountSearch(ScheduleDTO scheduleDTO, String mber_grade, String amt_month);
		
	// 수업등록시 정원초과 여부 확인
	String registHeadCount(String sch_code);
	
	// 수업등록시 회원코드,등록날짜,시간표코드 중복체크
	String registOne(RegistrationDTO registrationDTO);
	
	// 사물함 등록시 중복체크
	String locRegistOne(LocRegistDTO locRegistDTO);
	
}
