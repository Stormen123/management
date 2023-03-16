package com.management.b1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.management.b1.dto.AmountDTO;
import com.management.b1.dto.GradeCountDTO;
import com.management.b1.dto.LocRegistDTO;
import com.management.b1.dto.LockerDTO;
import com.management.b1.dto.LockerSearchDTO;
import com.management.b1.dto.MemberCountDTO;
import com.management.b1.dto.MemberDTO;
import com.management.b1.dto.MemberListDTO;
import com.management.b1.dto.RefundDTO;
import com.management.b1.dto.ScheduleDTO;
import com.management.b1.dto.SearchDTO;

@Repository
public interface ISearchDAO {
	
	/* ------- 회원 정보 조회 DAO ------- */
		
	// 회원코드 or 회원이름 or 회원전화번호로 검색시 사용.. 동명이인, 동일전화번호 있을가능성을 염두해서 List로 리턴
	List<MemberDTO> memberSearch(String search); // 추가로 사물함 조회때도 사용가능
	
	// memberSearch에서 선택된 회원등록정보(시간표) 출력
	List<SearchDTO> searchOne(String mber_code);
	
	// 조회일자(조회당일 날짜)가 포함되는 등록회원 인원조회 -- 강좌별 회원 집계 현황
	List<MemberCountDTO> memberCountList(String search_date);
	
	// 강좌별 회원 집계현황에서 레코드 더블클릭하면 등급별 인원 출력
	List<GradeCountDTO> gradeCountList(@Param("sch_code")String sch_code, @Param("search_date")String search_date);
	
	// 강좌별 회원 집계현황에서 레코드 더블클릭하면 그 시간표에 있는 회원정보 출력
	List<MemberDTO> schMemberList(@Param("sch_code")String sch_code, @Param("search_date")String search_date);
	
	// 조회일자(조회당일 날짜)가 포함되는 등록 회원 정보조회 -- 강좌별 현 회원 명부
	List<MemberListDTO> registMemberList(String search_date);

	
	
	/* ------- 사물함 정보 조회 DAO ------- */
	
	// 회원정보조회 후 사물함조회 누르면 회원코드를 이용하여 사물함 등록 정보 출력
	LocRegistDTO locRegistSearch(String mber_code);
	
	// 전체사물함 조회시 사용(오늘날짜가 이용날짜에 포함된 사물함 조회)
	List<LockerSearchDTO> locList();
	
	// 빈사물함 조회시 사용여부 N인거 출력
	List<LockerDTO> lockerSearch_N();
	
	// 이용중인사물함 조회시 오늘날짜가 이용기간에 포함된 사물함 조회
	List<LockerSearchDTO> lockerSearch_Y();
	
	// 조회일자(조회시작날짜 ~ 조회종료날짜)를 받은 후 그 일자에 만기되는 사물함 조회
	List<LocRegistDTO> lockerSearch_maturity(@Param("date_str")String date_str, @Param("date_end")String date_end);
	
	
	
	/* ------- 시간표 조회 DAO(개설여부 Y인거만) ------- */
	
	// 시간 선택시 그 시간에 있는 강좌 조회(ajax용)
	List<String> scheduleClass(String sch_time);
	
	// 시간, 강좌로 시간표 검색(ajax용)
	List<ScheduleDTO> scheduleSearch(ScheduleDTO scheduleDTO);
	
	
	
	/* ------- 가격 정보 조회 DAO -------*/
	
	// 등록페이지에서 등급,종목,요일,등록개월 받아서 가격 띄우기(ajax)
	String amontSearch(AmountDTO amountDTO);
	
	
	
	/* ------- 환불현황 조회 DAO ------- */
	
	// 환불 일자 (조회시작날짜 ~ 조회종료날짜) 받은 후 그 일자에 환불한 회원 조회, 환불여부 Y 조회 후 환불날짜 조회
	List<RefundDTO> refundSearch(@Param("date_str")String date_str, @Param("date_end")String date_end); 
}
