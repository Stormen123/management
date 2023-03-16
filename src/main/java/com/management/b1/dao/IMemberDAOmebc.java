package com.management.b1.dao;

import com.management.b1.dto.MemberDTO;

public interface IMemberDAOmebc {
	
	MemberDTO memberOne(String mber_code);
	
	void mberInsert(MemberDTO memberDTO) throws Exception;
	
	void mberUpdate(MemberDTO memberDTO) throws Exception;
	
	void mberDelete(String mber_code) throws Exception;
}
