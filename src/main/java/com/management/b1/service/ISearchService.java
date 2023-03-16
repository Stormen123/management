package com.management.b1.service;

import org.springframework.web.servlet.ModelAndView;

public interface ISearchService {
	
	// 회원코드, 회원이름, 회원전호번호로 회원검색
	
	/* 분기처리해야함 !!!!!
	 memberSearch가 복수인 경우 선택모달창으로,
	 단수인경우 바로 회원정보 노출 페이지로 이동  */
	ModelAndView memberSearch(String search);
	
	//memberSearch에서 복수선택 혹은 단수일경우 여기로 와서 회원정보, 등록정보 보내기
	ModelAndView searchOne(String mber_code);
	
	//각 시간표에서 조회일자가 포함되는 등록회원 인원수 조회하기 -- 강좌별 회원 집계 현황
	ModelAndView memberCountList(String search_date);
	
	// 강좌별 회원 집계현황에서 등록되어있는 회원 정보 및 등급별 인원을 보기위해 레코드 더블클릭하면 사용
	// gradeCountList, schMemberList 2개 DAO 호출해서 같이 보내주기
	ModelAndView memberAndGrade(String sch_code, String search_date);
	
	//조회일자가 포함되는 모든 등록 회원 정보조회 -- 강좌별 현 회원 명부
	ModelAndView registMemberList(String search_date);
	
	//회원조회 후 사물함조회 누르면 회원코드로 그 회원의 사물함 등록정보 출력
	ModelAndView locRegistSearch(String mber_code);
	
	//전체 사물함 조회
	ModelAndView locList();
	
	//빈사물함 조회
	ModelAndView lockerSearch_N();
	
	//사용중인 사물함 조회
	ModelAndView lockerSearch_Y();
	
	//만기사물함 조회
	ModelAndView lockerSearch_maturity(String date_str, String date_end);
	
	//환불현황 조회
	ModelAndView refundSearch(String date_str, String date_end);
}
