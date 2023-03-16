package com.management.b1.dao;

import java.util.List;

import com.management.b1.dto.ScheduleDTO;

public interface IScheduleDAOmebc {
	
	//시간표페이지 모든시간표 출력
	List<ScheduleDTO> scheduleList();
	
	ScheduleDTO scheduleOne(String sch_code);
	
	//시간표 추가
	void scheduleInsert(ScheduleDTO scheduleDTO) throws Exception;
	
	//시간표 수정
	void scheduleUpdate(ScheduleDTO scheduleDTO) throws Exception;
	
	//시간표 삭제
	void scheduleDelete(String sch_code) throws Exception;

}
