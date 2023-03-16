package com.management.b1.service;

import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dao.ILoginDAO;
import com.management.b1.dto.CustomerDTO;

@Service("loginService")
public class LoginServiceImpl implements ILoginService{

	@Autowired
	ILoginDAO loginDAO;
	@Autowired
	ISendMailService sendMailService;
	
	@Override
	public ModelAndView loginCheck(CustomerDTO customerDTO, HttpSession session) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		CustomerDTO cstmrDTO = loginDAO.loginCheck(customerDTO.getCstmr_id());
		
		if( cstmrDTO != null ) {
			String id = customerDTO.getCstmr_id();
			String pw = customerDTO.getCstmr_password();
			String checkId = cstmrDTO.getCstmr_id();
			String checkPw = cstmrDTO.getCstmr_password();
			
			if(checkId.equals(id) && checkPw.equals(pw)) {
				session.setAttribute("CSTMR", cstmrDTO);
				mav.setViewName("home");
				return mav;
			}
		}
		
		mav.setViewName("login");
		mav.addObject("MSG", "아이디 또는 비밀번호를 잘못 입력하셨습니다.");
		
		return mav;
	}
	
	// ajax 사용하기
	@Override
	public String idFind(String cstmr_mail) {
		// TODO Auto-generated method stub
		
		JSONObject jsonObj = new JSONObject();
		
		boolean result = true;
		String id = loginDAO.idFind(cstmr_mail);
		
		if ( id == null) {
			
			result = false;
			
		}
		
		jsonObj.put("ID",id);
		jsonObj.put("RESULT", result);
		
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}
	
	/************************************
	아이디 보여주는 페이지 따로 만들면 서비스 추가해야함!!!
	************************************/
	
	
	@Override
	public String idMailCheck(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		
		JSONObject jsonObj = new JSONObject();
		String jsonOut;
		boolean result = true;
		
		CustomerDTO cstmrDTO = loginDAO.idMailCheck(customerDTO);
		
		if ( cstmrDTO == null ) {
			
			result = false;
			jsonObj.put("RESULT", result);
			jsonObj.put("MSG", "아이디 또는 이메일을 잘못 입력하셨습니다.");
			jsonOut = jsonObj.toString();
			
			return jsonOut;
			
		}
		
		jsonObj.put("RESULT", result);
		jsonObj.put("CSTDTO", cstmrDTO);
		jsonOut = jsonObj.toString();
		return jsonOut;
		
	}
	
	public ModelAndView pwChange(CustomerDTO customerDTO) {
		
		ModelAndView mav = new ModelAndView();
		
		loginDAO.pwChange(customerDTO);
		mav.setViewName("main");
		
		return mav;
		
	}
}
