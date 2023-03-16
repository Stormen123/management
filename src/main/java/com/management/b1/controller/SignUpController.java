package com.management.b1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.CustomerDTO;
import com.management.b1.service.ISendMailService;
import com.management.b1.service.ISignUpService;

@Controller
public class SignUpController {

	@Autowired
	ISignUpService signUpService;
	@Autowired
	ISendMailService sendmailService;
	
	@RequestMapping(value="cstmrInsert")
	public ModelAndView cstmrInsert(CustomerDTO customerDTO) throws Exception {
		return signUpService.cstmrInsert(customerDTO);
	}
	
	
	
	// ===================== AJAX ====================
	
	@RequestMapping(value="idCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String idCheck(String cstmr_id) {
		return signUpService.idCheck(cstmr_id);
	}
	
	@RequestMapping(value="emailCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String emailCheck(String cstmr_mail) {
		return signUpService.emailCheck(cstmr_mail);
	}
	
	@RequestMapping(value = "emailCrtfc", produces = "application/text;charset=UTF-8")
	@ResponseBody
	public String emailGet(@ModelAttribute("cust_email")String cust_email) 
	{
		String email = sendmailService.sendMail(cust_email);
		return email;
	}
}
