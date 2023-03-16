package com.management.b1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dto.AmountDTO;
import com.management.b1.dto.CommonDTO;
import com.management.b1.dto.ContentDTO;
import com.management.b1.dto.CustomerDTO;
import com.management.b1.dto.LockerDTO;
import com.management.b1.dto.ScheduleDTO;
import com.management.b1.service.IAdminService;

@Controller
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	@RequestMapping(value="adminSetting")
	public ModelAndView adminList() {
		return adminService.adminList();
	}
	
	@RequestMapping(value="adminNameSearch")
	public ModelAndView adminNameSearch(String cstmr_name) {
		return adminService.adminNameSearch(cstmr_name);
	}
	
	@RequestMapping(value="adminInsert")
	public ModelAndView adminInsert(CustomerDTO customerDTO) throws Exception {
		return adminService.adminInsert(customerDTO);
	}
	
	@RequestMapping(value="adminUpdate")
	public ModelAndView adminUpdate(CustomerDTO customerDTO) throws Exception {
		return adminService.adminUpdate(customerDTO);
	}
	
	@RequestMapping(value="adminDelete")
	public ModelAndView adminDelete(String cstmr_code) throws Exception {
		return adminService.adminDelete(cstmr_code);
	}
	
	@RequestMapping(value="amountList")
	public ModelAndView amountList() {
		return adminService.amountList();
	}
	
	@RequestMapping(value="amountInsert")
	public ModelAndView amountInsert(AmountDTO amountDTO) throws Exception {
		return adminService.amountInsert(amountDTO);
	}
	
	@RequestMapping(value="amountUpdate")
	public ModelAndView amountUpdate(AmountDTO amountDTO) throws Exception {
		return adminService.amountUpdate(amountDTO);
	}
	
	@RequestMapping(value="amountDelete")
	public ModelAndView amountDelete(String amt_code) throws Exception {
		return adminService.amountDelete(amt_code);
	}
	
	@RequestMapping(value="commonList")
	public ModelAndView commonList() {
		return adminService.commonList();
	}
	
	@RequestMapping(value="commonInsert")
	public ModelAndView commonInsert(CommonDTO commonDTO) throws Exception {
		return adminService.commonInsert(commonDTO);
	}
	
	@RequestMapping(value="commonUpdate")
	public ModelAndView commonUpdate(CommonDTO commonDTO) throws Exception {
		return adminService.commonUpdate(commonDTO);
	}
	
	@RequestMapping(value="commonDelete")
	public ModelAndView commonDelete(String com_code) throws Exception {
		return adminService.commonDelete(com_code);
	}
	
	@RequestMapping(value="contentList")
	public ModelAndView contentList(String com_code) {
		return adminService.contentList(com_code);
	}
	
	@RequestMapping(value="contentInsert")
	public ModelAndView contentInsert(ContentDTO contentDTO) throws Exception {
		return adminService.contentInsert(contentDTO);
	}
	
	@RequestMapping(value="contentUpdate")
	public ModelAndView contentUpdate(ContentDTO contentDTO) throws Exception {
		return adminService.contentUpdate(contentDTO);
	}
	
	@RequestMapping(value="contentDelete")
	public ModelAndView contentDelte(ContentDTO contentDTO) throws Exception {
		return adminService.contentDelete(contentDTO);
	}
	
	@RequestMapping(value="lockerList")
	public ModelAndView lockerList() {
		return adminService.lockerList();
	}
	
	@RequestMapping(value="lockerInsert")
	public ModelAndView lockerInsert(LockerDTO lockerDTO) throws Exception {
		return adminService.lockerInsert(lockerDTO);
	}
	
	@RequestMapping(value="lockerUpdate")
	public ModelAndView lockerUpdate(LockerDTO lockerDTO) throws Exception {
		return adminService.lockerUpdate(lockerDTO);
	}
	
	@RequestMapping(value="lockerDelete")
	public ModelAndView lockerDelete(String loc_no) throws Exception {
		return adminService.lockerDelete(loc_no);
	}
	
	@RequestMapping(value="scheduleList")
	public ModelAndView scheduleList() {
		return adminService.scheduleList();
	}
	
	@RequestMapping(value="scheduleInsert")
	public ModelAndView scheduleInsert(ScheduleDTO scheduleDTO) throws Exception {
		return adminService.scheduleInsert(scheduleDTO);
	}
	
	@RequestMapping(value="scheduleUpdate")
	public ModelAndView scheduleUpdate(ScheduleDTO scheduleDTO) throws Exception {
		return adminService.scheduleUpdate(scheduleDTO);
	}
	
	@RequestMapping(value="scheduleDelete")
	public ModelAndView scheduleDelete(String sch_code) throws Exception {
		return adminService.scheduleDelete(sch_code);
	}
	
	
	// ======================= AJAX =======================
	
	@RequestMapping(value="schCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String schCheck(String sch_code) {
		return adminService.scheduleOne(sch_code);
	}
	
	@RequestMapping(value="amtCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String amtCheck(String amt_code) {
		return adminService.amountOne(amt_code);
	}
	
	@RequestMapping(value="comCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String comCheck(String com_code) {
		return adminService.commonOne(com_code);
	}
	
	@RequestMapping(value="contCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String contCheck(ContentDTO contentDTO) {
		return adminService.contentOne(contentDTO);
	}
	
	@RequestMapping(value="locCheck", produces = "application/text;charset=UTF-8") 
	@ResponseBody
	public String locCheck(String loc_no) {
		return adminService.lockerOne(loc_no);
	}
	
}
