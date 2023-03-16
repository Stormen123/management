package com.management.b1.service;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dao.ILocRegistDAOmebc;
import com.management.b1.dao.IMemberDAOmebc;
import com.management.b1.dao.IRegistrationDAOmebc;
import com.management.b1.dao.IScheduleDAOmebc;
import com.management.b1.dao.ISearchDAO;
import com.management.b1.dto.AmountDTO;
import com.management.b1.dto.LocRegistDTO;
import com.management.b1.dto.LockerDTO;
import com.management.b1.dto.MemberDTO;
import com.management.b1.dto.RegistrationDTO;
import com.management.b1.dto.ScheduleDTO;

@Service("registService")
public class RegistrationServiceImpl implements IRegistrationService{
	
	@Autowired
	ISearchDAO searchDAO;
	@Autowired
	IRegistrationDAOmebc registrationDAO;
	@Autowired
	IMemberDAOmebc memberDAO;
	@Autowired
	IScheduleDAOmebc scheduleDAO;
	@Autowired
	ILocRegistDAOmebc locRegistDAO;
	
	public ModelAndView memberInsert(MemberDTO memberDTO) throws Exception {
		
		ModelAndView mav = new ModelAndView();

		memberDAO.mberInsert(memberDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(memberDTO.getMber_code()));
		mav.setViewName("search/search_member");
		
		return mav;
	}
	
	public ModelAndView memberUpdate(MemberDTO memberDTO) throws Exception {
		
		ModelAndView mav = new ModelAndView();

		memberDAO.mberUpdate(memberDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(memberDTO.getMber_code()));
		mav.addObject("REGISTLIST", searchDAO.searchOne(memberDTO.getMber_code()));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(memberDTO.getMber_code()));
		mav.setViewName("search/search_member");
		
		return mav;
	}
	
	public ModelAndView memberDelete(String mber_code) throws Exception {
		
		ModelAndView mav = new ModelAndView();

		memberDAO.mberDelete(mber_code);
		
		mav.setViewName("search/search_member");
		
		return mav;
	}
	
	@Override
	public ModelAndView registPage(MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("SCHLIST", scheduleDAO.scheduleList());
		mav.addObject("TIME", registrationDAO.timeList());
		mav.addObject("GRADE", memberDTO.getMber_grade());
		mav.addObject("CODE", memberDTO.getMber_code());
		mav.setViewName("regist/regist");
		
		return mav;
	}
	
	// 모달창으로 전송된 데이터 열어보기!!
	@Override
	public ModelAndView scheduleSearch(ScheduleDTO scheduleDTO, MemberDTO memberDTO) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("SCHMODAL", searchDAO.scheduleSearch(scheduleDTO));
		mav.addObject("GRADE", memberDTO.getMber_grade());
		mav.addObject("CODE", memberDTO.getMber_code());
		mav.setViewName("main");
		
		return mav;
	}
	
	@Transactional
	public ModelAndView registInsert(RegistrationDTO registrationDTO, String mber_code) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		

		registrationDAO.registInsert(registrationDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(mber_code));
		mav.addObject("REGISTLIST", searchDAO.searchOne(mber_code));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(mber_code));
		mav.setViewName("member/member_one");
		
		return mav;
	}
	
	public ModelAndView registUpdate(RegistrationDTO registrationDTO, String mber_code) throws Exception {
		
		ModelAndView mav = new ModelAndView();

		registrationDAO.registUpdate(registrationDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(mber_code));
		mav.addObject("REGISTLIST", searchDAO.searchOne(mber_code));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(mber_code));
		mav.setViewName("member/member_one");
		
		return mav;
	}
	
	public ModelAndView registDelete(RegistrationDTO registrationDTO, String mber_code) throws Exception {
		
		ModelAndView mav = new ModelAndView();

		registrationDAO.registDelete(registrationDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(mber_code));
		mav.addObject("REGISTLIST", searchDAO.searchOne(mber_code));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(mber_code));
		mav.setViewName("member/member_one");
		
		return mav;
	}

	@Override
	public ModelAndView locRegistInsert(LocRegistDTO locRegistDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		locRegistDAO.locRegistInsert(locRegistDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(locRegistDTO.getMber_code()));
		mav.addObject("REGISTLIST", searchDAO.searchOne(locRegistDTO.getMber_code()));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(locRegistDTO.getMber_code()));
		mav.setViewName("member/member_one");
		
		return mav;
	}

	@Override
	public ModelAndView locRegistUpdate(LocRegistDTO locRegistDTO) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView();
		
		locRegistDAO.locRegistUpdate(locRegistDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(locRegistDTO.getMber_code()));
		mav.addObject("REGISTLIST", searchDAO.searchOne(locRegistDTO.getMber_code()));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(locRegistDTO.getMber_code()));
		mav.setViewName("member/member_one");
		
		return mav;
	}

	@Override
	public ModelAndView locRegistDelete(LocRegistDTO locRegistDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		locRegistDAO.locRegistDelete(locRegistDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(locRegistDTO.getMber_code()));
		mav.addObject("REGISTLIST", searchDAO.searchOne(locRegistDTO.getMber_code()));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(locRegistDTO.getMber_code()));
		mav.setViewName("member/member_one");
		
		return mav;
	}

	@Override
	public ModelAndView refund(RegistrationDTO registrationDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		registrationDAO.refund(registrationDTO);
		
		mav.addObject("MEMBER", memberDAO.memberOne(registrationDTO.getMber_code()));
		mav.addObject("REGISTLIST", searchDAO.searchOne(registrationDTO.getMber_code()));
		mav.addObject("LOCREGISTLIST", searchDAO.locRegistSearch(registrationDTO.getMber_code()));
		mav.setViewName("member/member_one");
		
		return mav;
	}
	
	
	
	// ======================== AJAX =======================
	
	
	//등록시 시간표 조회  AJAX
		@Override
		public String scheduleClass(String sch_time) {
			// TODO Auto-generated method stub
			
			List<String> checkList = searchDAO.scheduleClass(sch_time);
			JSONArray jsonAry = new JSONArray();
			
			for ( int i = 0; i < checkList.size(); i++) {
				
				JSONObject jsonObj = new JSONObject();
				jsonObj.put("class_name", checkList.get(i));
				jsonAry.put(jsonObj);
				
			}
			
			String jsonOut = jsonAry.toString();
			
			return jsonOut;
		}
		
		// 시간표,등급,개월수 입력후 가격 ajax로 뽑기
		@Override
		public String amountSearch(ScheduleDTO scheduleDTO, String mber_grade, String amt_month) {
			// TODO Auto-generated method stub
			
			JSONObject jsonObj = new JSONObject();
			
			AmountDTO amountDTO = new AmountDTO();
			
			amountDTO.setAmt_grade(mber_grade);
			amountDTO.setAmt_item(scheduleDTO.getSch_item());
			amountDTO.setAmt_day(scheduleDTO.getSch_day());
			amountDTO.setAmt_month(amt_month);
			
			String amount = searchDAO.amontSearch(amountDTO);
			
			jsonObj.put("AMOUNT", amount);
			String jsonOut = jsonObj.toString();
			
			return jsonOut;
		}
		
		@Override
		public String registHeadCount(String sch_code) {
			// TODO Auto-generated method stub
			
			JSONObject jsonObj = new JSONObject();
			
			int count = registrationDAO.registHeadCount(sch_code);
			boolean result = true;
			
			if ( count == 0 ) {
				result = false;
			}
			
			jsonObj.put("RESULT", result);
			String jsonOut = jsonObj.toString();
			
			return jsonOut;
		}
		
		// 정원초과 아니면 검사  (2중 ajax)
		@Override
		public String registOne(RegistrationDTO registrationDTO) {
			// TODO Auto-generated method stub
			
			JSONObject jsonObj = new JSONObject();
			
			RegistrationDTO registDTO = registrationDAO.registOne(registrationDTO);
			boolean result = true;
			
			if ( registDTO != null ) {
				result = false;
			}
			
			jsonObj.put("RESULT", result);
			String jsonOut = jsonObj.toString();
			
			return jsonOut;
		}

		@Override
		public String locRegistOne(LocRegistDTO locRegistDTO) {
			// TODO Auto-generated method stub
			
			JSONObject jsonObj = new JSONObject();
			
			LockerDTO locDTO = locRegistDAO.locRegistOne(locRegistDTO);
			boolean result = true;
			
			if ( locDTO != null) {
				result = false;
			}
			
			jsonObj.put("RESULT", result);
			String jsonOut = jsonObj.toString();
			
			return jsonOut;
		}
		
		
}
