package com.management.b1.dao;

import java.util.List;

import com.management.b1.dto.CommonDTO;

public interface ICommonDAOmebc {
	
	//공통코드 리스트조회
	List<CommonDTO> commonList();
	
	//추가, 수정, 삭제 시 중복코드검사
	CommonDTO commonOne(String com_code);
	
	void commonInsert(CommonDTO commonDTO) throws Exception;
	
	void commonUpdate(CommonDTO commonDTO) throws Exception;
	
	void commonDelete(String com_code) throws Exception;

}
