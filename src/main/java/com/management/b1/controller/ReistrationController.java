package com.management.b1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.LocRegistDTO;
import com.management.b1.dto.MemberDTO;
import com.management.b1.dto.RegistrationDTO;
import com.management.b1.dto.ScheduleDTO;
import com.management.b1.service.IRegistrationService;
import com.management.b1.service.ISearchService;

@Controller
public class ReistrationController {
	
	@Autowired
	ISearchService searchService;
	
	@Autowired
	IRegistrationService registService;
	
	@RequestMapping(value="memberRegist")
	public String memberRegist() {
		return "admin/admin_memberRegist";
	}
	
	@RequestMapping(value="memberInsert")
	public ModelAndView memberInsert(MemberDTO memberDTO) throws Exception {
		return registService.memberInsert(memberDTO);
	}
	
	@RequestMapping(value="memberUpdate")
	public ModelAndView memberUpdate(MemberDTO memberDTO) throws Exception {
		return registService.memberUpdate(memberDTO);
	}
	
	@RequestMapping(value="memberDelete")
	public ModelAndView memberDelete(String mber_code) throws Exception {
		return registService.memberDelete(mber_code);
	}
	
	@RequestMapping(value="memberOne")
	public ModelAndView memberOne(String mber_code) {
		return searchService.searchOne(mber_code);
	}
	
	@RequestMapping(value="registPage")
	public ModelAndView registPage(MemberDTO memberDTO) {
		return registService.registPage(memberDTO);
	}
	
	@RequestMapping(value="schSearch")
	public ModelAndView scheduleSearch(ScheduleDTO scheduleDTO, MemberDTO memberDTO) {
		return registService.scheduleSearch(scheduleDTO, memberDTO);
	}
	
	@RequestMapping(value="registInsert")
	public ModelAndView registInsert(RegistrationDTO registrationDTO, String mber_code) throws Exception {
		return registService.registInsert(registrationDTO, mber_code);
	}
	
	@RequestMapping(value="registUpdate")
	public ModelAndView registUpdate(RegistrationDTO registrationDTO, String mber_code) throws Exception {
		return registService.registUpdate(registrationDTO, mber_code);
	}
	
	@RequestMapping(value="registDelete")
	public ModelAndView registDelete(RegistrationDTO registrationDTO, String mber_code) throws Exception {
		return registService.registDelete(registrationDTO, mber_code);
	}
	
	@RequestMapping(value="locRegistInsert")
	public ModelAndView locRegistInsert(LocRegistDTO locRegistDTO) throws Exception {
		return registService.locRegistInsert(locRegistDTO);
	}
	
	@RequestMapping(value="locRegistUpdate")
	public ModelAndView locRegistUpdate(LocRegistDTO locRegistDTO) throws Exception {
		return registService.locRegistUpdate(locRegistDTO);
	}
	
	@RequestMapping(value="locRegistDelete")
	public ModelAndView locRegistDelete(LocRegistDTO locRegistDTO) throws Exception {
		return registService.locRegistDelete(locRegistDTO);
	}
	
	@RequestMapping(value="refund")
	public ModelAndView refund(RegistrationDTO registrationDTO) throws Exception {
		return registService.refund(registrationDTO);
	}
	
	
	
	
	// =================== ajax ==================
	
	@RequestMapping(value="scheduleClass", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String scheduleClass(String sch_time) {
		return registService.scheduleClass(sch_time);
	}
	
	@RequestMapping(value="amountSearch", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String amountSearch(ScheduleDTO scheduleDTO, String mber_grade, String amt_month) {
		return registService.amountSearch(scheduleDTO, mber_grade, amt_month);
	}
	
	@RequestMapping(value="registHeadCount", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String registHeadCount(String sch_code) {
		return registService.registHeadCount(sch_code);
	}
	
	@RequestMapping(value="registOne", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String registOne(RegistrationDTO registrationDTO) {
		return registService.registOne(registrationDTO);
	}
	
	@RequestMapping(value="locRegistOne", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String locRegistOne(LocRegistDTO locRegistDTO) {
		return registService.locRegistOne(locRegistDTO);
	}
}
