package com.management.b1.dao;

import java.util.List;

import com.management.b1.dto.ContentDTO;

public interface IContentDAOmebc {
	
	//공통코드로 상세코드명, 코드내용 출력
	List<ContentDTO> contentList(String com_code);
	
	ContentDTO contentOne(ContentDTO contentDTO);
	
	void contentInsert(ContentDTO contentDTO) throws Exception;
	
	void contentUpdate(ContentDTO contentDTO) throws Exception;
	
	void contentDelete(ContentDTO contentDTO) throws Exception;
}
