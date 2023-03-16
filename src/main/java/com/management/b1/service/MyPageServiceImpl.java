package com.management.b1.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dao.IMyPageDAO;
import com.management.b1.dto.CustomerDTO;

@Service("myPageService")
public class MyPageServiceImpl implements IMypageService {

	@Autowired
	IMyPageDAO myPageDAO;
	
	@Transactional
	public ModelAndView cstmrUpdate(CustomerDTO customerDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public ModelAndView cstmrDelete(CustomerDTO customerDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public ModelAndView pwChange(HttpSession session) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		CustomerDTO cstmrDTO = (CustomerDTO)session.getAttribute("CSTMR");
		String id = cstmrDTO.getCstmr_id();
		
		myPageDAO.pwChange(id);
		mav.setViewName("myPage/myPage");
		
		return mav;
	}

	@Override
	public ModelAndView pwCheck(HttpSession session, String cstmr_password) {
		// TODO Auto-generated method stub
		return null;
	}

}
