package com.management.b1.dao;

import java.util.List;

import com.management.b1.dto.AmountDTO;

public interface IAmountDAOmebc {
	
	//가격페이지에 전체가격할떄 사용
	List<AmountDTO> amountList();
	
	// 추가, 수정, 삭제시 코드확인
	AmountDTO amountOne(String amt_code);
	
	//가격 추가
	void amountInsert(AmountDTO amountDTO) throws Exception;
	
	//가격 수정
	void amountUpdate(AmountDTO amountDTO) throws Exception;
	
	//가격 삭제
	void amountDelete(String amt_code) throws Exception;

}
