package com.management.b1.dao;

import com.management.b1.dto.LocRegistDTO;
import com.management.b1.dto.LockerDTO;

public interface ILocRegistDAOmebc {
	
	// 추가, 수정, 삭제시 검사하기
	LockerDTO locRegistOne(LocRegistDTO locRegistDTO);
	
	//사물함등록시 추가
	void locRegistInsert(LocRegistDTO locRegistDTO) throws Exception;
	
	//회원이 사물함 이동 원한다 할때 사용
	void locRegistUpdate(LocRegistDTO locRegistDTO) throws Exception;
	
	// ???
	void locRegistDelete(LocRegistDTO locRegistDTO) throws Exception;

}
