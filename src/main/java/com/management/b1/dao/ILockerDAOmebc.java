package com.management.b1.dao;

import java.util.List;

import com.management.b1.dto.LockerDTO;

public interface ILockerDAOmebc {
	
	//사물함관리 전체사물함 보여주기 -- 페이징처리 필요할수도...
	List<LockerDTO> lockerList();
	
	// 사물함번호로 사물함 조회
	LockerDTO lockerOne(String loc_no);
	
	//사물함 추가
	void lockerInsert(LockerDTO lockerDTO) throws Exception;
	
	//사물함 수정 -- 거의사용 안할듯?
	void lockerUpdate(LockerDTO lockerDTO) throws Exception;
	
	//사물함 삭제
	void lockerDelete(String loc_no) throws Exception;

}
