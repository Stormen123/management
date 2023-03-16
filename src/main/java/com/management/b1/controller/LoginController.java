package com.management.b1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.CustomerDTO;
import com.management.b1.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	ILoginService loginService;
	
	
	@RequestMapping(value="loginCheck")
	public ModelAndView loginCheck(CustomerDTO customerDTO, HttpSession session) {
		return loginService.loginCheck(customerDTO, session);
	}
	
	@RequestMapping(value="logOut")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "home";
	}
	
	@RequestMapping(value="idfindPage")
	public String idfindPage() {
		return "login/idfind";
	}
	
	@RequestMapping(value="pwChangePage")
	public String pwChangePage() {
		return "login/pwChange";
	}
	
	@RequestMapping(value="pwChange")
	public ModelAndView pwChange(CustomerDTO customerDTO) {
		return loginService.pwChange(customerDTO);
	}
	
	// =================== AJAX =====================
	

	@RequestMapping(value="idFind", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String idFind(String cstmr_mail) {
		return loginService.idFind(cstmr_mail);
	}
	
	@RequestMapping(value="idMailCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String schCheck(CustomerDTO customerDTO) {
		return loginService.idMailCheck(customerDTO);
	}
}
