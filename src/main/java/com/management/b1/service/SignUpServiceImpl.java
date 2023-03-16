package com.management.b1.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dao.ICustomerDAOmebc;
import com.management.b1.dao.ISignUpDAO;
import com.management.b1.dto.CustomerDTO;

@Service("signUpService")
public class SignUpServiceImpl implements ISignUpService{
	
	@Autowired
	ICustomerDAOmebc customerDAO;
	@Autowired
	ISignUpDAO signUpDAO;
	
	@Transactional
	public ModelAndView cstmrInsert(CustomerDTO customerDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		customerDAO.cstmrInsert(customerDTO);
		mav.setViewName("login");
		
		return mav;
	}
	
	
	// ===================== AJAX ======================
	
	@Override
	public String idCheck(String cstmr_id) {
		// TODO Auto-generated method stub
		
		CustomerDTO cstmrDTO = signUpDAO.idCheck(cstmr_id);
		boolean result = true;
		
		if (cstmrDTO != null ) {
			
			result = false;
			
		}
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("RESULT", result);
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}

	@Override
	public String emailCheck(String cstmr_email) {
		// TODO Auto-generated method stub
		
		CustomerDTO cstmrDTO = signUpDAO.emailCheck(cstmr_email);
		boolean result = true;
		
		if (cstmrDTO != null) {
			
			result = false;
		}
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("RESULT", result);
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}

}
