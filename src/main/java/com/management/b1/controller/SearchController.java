package com.management.b1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.service.ISearchService;

@Controller
public class SearchController {

	@Autowired
	ISearchService searchService;
	
	@RequestMapping(value="memberSearch")
	public ModelAndView memberSearch(String search) {
		return searchService.memberSearch(search);
	}
	
	@RequestMapping(value="searchOne")
	public ModelAndView memberOne(String mber_code) {
		return searchService.searchOne(mber_code);
	}
	
	@RequestMapping(value="memberCountList")
	public ModelAndView memberCountList(String search_date) {
		return searchService.memberSearch(search_date);
	}
	
	@RequestMapping(value="memberAndGrade")
	public ModelAndView memberAndGrade(String sch_code, String search_date) {
		return searchService.memberAndGrade(sch_code, search_date);
	}
	
	@RequestMapping(value="registMemberList")
	public ModelAndView registMemberList(String search_date) {
		return searchService.registMemberList(search_date);
	}
	
	@RequestMapping(value="locRegistSearch")
	public ModelAndView locRegistSearch(String mber_code) {
		return searchService.locRegistSearch(mber_code);
	}
	
	@RequestMapping(value="locList")
	public ModelAndView locList() {
		return searchService.locList();
	}
	
	@RequestMapping(value="lockerSearch_N")
	public ModelAndView lockerSearch_N() {
		return searchService.lockerSearch_N();
	}
	
	@RequestMapping(value="lockerSearch_Y")
	public ModelAndView lockerSearch_Y() {
		return searchService.lockerSearch_Y();
	}
	
	@RequestMapping(value="lockerSearch_maturity")
	public ModelAndView lockerSearch_maturity(String date_str, String date_end) {
		return searchService.lockerSearch_maturity(date_str, date_end);
	}
	
	@RequestMapping(value="refundSearch")
	public ModelAndView refundSearch(String date_str, String date_end) {
		return searchService.refundSearch(date_str, date_end);
	}
	
}
