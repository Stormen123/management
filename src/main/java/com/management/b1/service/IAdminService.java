package com.management.b1.service;

import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.AmountDTO;
import com.management.b1.dto.CommonDTO;
import com.management.b1.dto.ContentDTO;
import com.management.b1.dto.CustomerDTO;
import com.management.b1.dto.LockerDTO;
import com.management.b1.dto.ScheduleDTO;

public interface IAdminService {

	//관리자계정 전체조회(관리자계정관리)
	ModelAndView adminList();
	
	//아이디로 관리자 검색
	ModelAndView adminNameSearch(String cstmr_name);
	
	//관리자계정 추가
	ModelAndView adminInsert(CustomerDTO customerDTO) throws Exception;
	
	//관리자계정 수정
	ModelAndView adminUpdate(CustomerDTO customerDTO) throws Exception;
	
	//관리자계정 삭제
	ModelAndView adminDelete(String cstmr_code) throws Exception;
	
	//가격 전체조회(가격관리)
	ModelAndView amountList();
	
	//가격 추가
	ModelAndView amountInsert(AmountDTO amountDTO) throws Exception;
	
	//가격 수정
	ModelAndView amountUpdate(AmountDTO amountDTO) throws Exception;
	
	//가격  삭제
	ModelAndView amountDelete(String amt_code) throws Exception;
	
	//공통코드 리스트(기초코드관리)
	ModelAndView commonList();
	
	//공통코드 추가
	ModelAndView commonInsert(CommonDTO commonDTO) throws Exception;
	
	//공통코드 수정
	ModelAndView commonUpdate(CommonDTO commonDTO) throws Exception;
	
	//공통코드 삭제
	ModelAndView commonDelete(String con_code) throws Exception;
	
	//공통코드상세 리스트(기초코드관리)
	ModelAndView contentList(String com_code);
	
	//상세코드 추가
	
	ModelAndView contentInsert(ContentDTO contentDTO) throws Exception;
	
	//상세코드 수정
	ModelAndView contentUpdate(ContentDTO contentDTO) throws Exception;
	
	//상세코드 삭제
	ModelAndView contentDelete(ContentDTO contentDTO) throws Exception;
	
	//사물함 리스트
	ModelAndView lockerList();
	
	//사물함 추가
	ModelAndView lockerInsert(LockerDTO lockerDTO) throws Exception;
	
	//사물함 수정
	ModelAndView lockerUpdate(LockerDTO lockerDTO) throws Exception;
	
	//사물함 삭제
	ModelAndView lockerDelete(String loc_no) throws Exception;
	
	//시간표 리스트
	ModelAndView scheduleList();
	
	//시간표 추가
	ModelAndView scheduleInsert(ScheduleDTO scheduleDTO) throws Exception;
	
	//시간표 수정
	ModelAndView scheduleUpdate(ScheduleDTO scheduleDTO) throws Exception;
	
	//시간표 삭제
	ModelAndView scheduleDelete(String sch_code) throws Exception;
	
	
	
	
	
	// ========================== ajax Service =========================
	
	String scheduleOne(String sch_code);
	
	String amountOne(String amt_code);
	
	String commonOne(String com_code);
	
	String contentOne(ContentDTO contentDTO);
	
	// 사물함번호 중복체크
	String lockerOne(String loc_no);
		
}