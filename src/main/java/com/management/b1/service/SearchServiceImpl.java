package com.management.b1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dao.IMemberDAOmebc;
import com.management.b1.dao.ISearchDAO;
import com.management.b1.dto.MemberDTO;

@Service("searchService")
public class SearchServiceImpl implements ISearchService{
	
	@Autowired
	ISearchDAO searchDAO;
	@Autowired
	IMemberDAOmebc memberDAO;
	
	@Override
	public ModelAndView memberSearch(String search) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		List<MemberDTO> memberList = searchDAO.memberSearch(search);
		
		if (memberList.isEmpty()) {
			mav.addObject("RESULT", "zero");
			mav.addObject("MSG", "검색결과가 없습니다.");
			mav.setViewName("search");
			
			return mav;
		}
		else if(memberList.size() == 1) {
			MemberDTO memberDTO = memberList.get(0);
			
			mav.addObject("MEMBER", memberDAO.memberOne(memberDTO.getMber_code()));
			mav.addObject("REGISTLIST", searchDAO.searchOne(memberDTO.getMber_code()));
			mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(memberDTO.getMber_code()));
			mav.setViewName("searchOK");
			
			return mav;
		}
		else {
			mav.addObject("MEMBERLIST", memberList);
			mav.addObject("RESULT", "many");
			mav.setViewName("search");
			
			return mav;
		}
	}

	@Override
	public ModelAndView searchOne(String mber_code) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("MEMBER", memberDAO.memberOne(mber_code));
		mav.addObject("REGISTLIST", searchDAO.searchOne(mber_code));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(mber_code));
		mav.setViewName("search");
		
		return mav;
	}

	@Override
	public ModelAndView memberCountList(String search_date) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("COUNTLIST", searchDAO.memberCountList(search_date));
		mav.setViewName("search/search_countList");
		
		return mav;
	}

	@Override
	public ModelAndView memberAndGrade(String sch_code, String search_date) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("GRADECOUNT", searchDAO.gradeCountList(sch_code, search_date));
		mav.addObject("MEMBERLIST", searchDAO.schMemberList(sch_code, search_date));
		mav.setViewName("search/search_memberList");
		
		return mav;
	}

	@Override
	public ModelAndView registMemberList(String search_date) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("MEMBERLIST", searchDAO.registMemberList(search_date));
		mav.setViewName("search/search_regMberList");
		
		return mav;
	}

	@Override
	public ModelAndView locRegistSearch(String mber_code) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("LOCREGLIST", searchDAO.locRegistSearch(mber_code));
		mav.addObject("MEMBER", memberDAO.memberOne(mber_code));
		mav.setViewName("search/search_mberLoc");
		
		return mav;
	}

	@Override
	public ModelAndView locList() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("LOCLIST", searchDAO.locList());
		mav.setViewName("search/search_loc");
		
		return mav;
	}
	

	@Override
	public ModelAndView lockerSearch_N() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("LOCLIST", searchDAO.lockerSearch_N());
		mav.setViewName("search/search_loc");
		
		return mav;
	}

	@Override
	public ModelAndView lockerSearch_Y() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("LOCLIST", searchDAO.lockerSearch_Y());
		mav.setViewName("search/search_loc");
		
		return mav;
	}

	@Override
	public ModelAndView lockerSearch_maturity(String date_str, String date_end) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("LOCLIST", searchDAO.lockerSearch_maturity(date_str, date_end));
		mav.setViewName("search/search_loc");
		
		return mav;
	}

	@Override
	public ModelAndView refundSearch(String date_str, String date_end) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("REFUND", searchDAO.refundSearch(date_str, date_end));
		mav.setViewName("search/search_refund");
		
		return mav;
	}

}
