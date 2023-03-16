package com.management.b1.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.management.b1.dao.IAdminDAOmebc;
import com.management.b1.dao.IAmountDAOmebc;
import com.management.b1.dao.ICommonDAOmebc;
import com.management.b1.dao.IContentDAOmebc;
import com.management.b1.dao.ICustomerDAOmebc;
import com.management.b1.dao.ILockerDAOmebc;
import com.management.b1.dao.IScheduleDAOmebc;
import com.management.b1.dto.AmountDTO;
import com.management.b1.dto.CommonDTO;
import com.management.b1.dto.ContentDTO;
import com.management.b1.dto.CustomerDTO;
import com.management.b1.dto.LockerDTO;
import com.management.b1.dto.ScheduleDTO;

@Service("adminService")
public class AdminServiceImpl implements IAdminService {
	
	@Autowired
	IAdminDAOmebc adminDAO;
	@Autowired
	IAmountDAOmebc amountDAO;
	@Autowired
	ICommonDAOmebc commonDAO;
	@Autowired
	IContentDAOmebc contentDAO;
	@Autowired
	ILockerDAOmebc lockerDAO;
	@Autowired
	IScheduleDAOmebc scheduleDAO;
	@Autowired
	ICustomerDAOmebc customerDAO;
	
	
	@Override
	public ModelAndView adminList() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ADMINLIST", adminDAO.adminList());
		mav.setViewName("admin/adminSetting");
		
		return mav;
	}
	
	 
	@Override
	public ModelAndView adminNameSearch(String cstmr_name) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("ADMINLIST", adminDAO.adminNameSearch(cstmr_name));
		mav.setViewName("admin/adminSetting");
		
		return mav;
	}
	
	//AJAX ID 중복 체크후 관리자 추가
	@Transactional
	public ModelAndView adminInsert(CustomerDTO customerDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		adminDAO.adminInsert(customerDTO);
		mav.setViewName("admin/admin_admin");
		
		return mav;
	}

	@Transactional
	public ModelAndView adminUpdate(CustomerDTO customerDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		customerDAO.cstmrUpdate(customerDTO);
		mav.setViewName("admin/admin_admin");
		
		return mav;
	}

	@Transactional
	public ModelAndView adminDelete(String cstmr_code) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		customerDAO.cstmrDelete(cstmr_code);
		mav.setViewName("admin/admin_admin");
		
		return mav;
	}

	@Override
	public ModelAndView amountList() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("AMOUNTLIST", amountDAO.amountList());
		mav.setViewName("admin/admin_amount");
		
		return mav;
	}

	@Transactional
	public ModelAndView amountInsert(AmountDTO amountDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		amountDAO.amountInsert(amountDTO);
		mav.setViewName("admin/admin_amount");
		
		return mav;
	}

	@Transactional
	public ModelAndView amountUpdate(AmountDTO amountDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		amountDAO.amountUpdate(amountDTO);
		mav.setViewName("admin/admin_amount");
		
		return mav;
	}

	@Transactional
	public ModelAndView amountDelete(String amt_code) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		amountDAO.amountDelete(amt_code);
		mav.setViewName("admin/admin_amount");
		
		return mav;
	}

	@Override
	public ModelAndView commonList() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("COMMONLIST", commonDAO.commonList());
		mav.setViewName("admin/admin_common");
		
		return mav;
	}

	@Transactional
	public ModelAndView commonInsert(CommonDTO commonDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		commonDAO.commonInsert(commonDTO);
		mav.setViewName("admin/admin_common");
		
		return mav;
	}

	@Transactional
	public ModelAndView commonUpdate(CommonDTO commonDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		commonDAO.commonUpdate(commonDTO);
		mav.setViewName("admin/admin_common");
		
		return mav;
	}

	@Transactional
	public ModelAndView commonDelete(String com_code) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		commonDAO.commonDelete(com_code);
		mav.setViewName("admin/admin_common");
		
		return mav;
	}

	@Override
	public ModelAndView contentList(String com_code) {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		if ( com_code == null) {
			String code = "1";
			mav.addObject("CONTENTLIST", contentDAO.contentList(code));
			mav.addObject("COMMONLIST", commonDAO.commonList());
			mav.setViewName("admin/admin_content");
			
			return mav;
			
		}
		mav.addObject("CONTENTLIST", contentDAO.contentList(com_code));
		mav.addObject("COMMONLIST", commonDAO.commonList());
		mav.setViewName("admin/admin_content");
		
		return mav;
	}

	@Transactional
	public ModelAndView contentInsert(ContentDTO contentDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		contentDAO.contentInsert(contentDTO);
		mav.setViewName("admin/admin_content");
		
		return mav;
	}

	@Transactional
	public ModelAndView contentUpdate(ContentDTO contentDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		contentDAO.contentUpdate(contentDTO);
		mav.setViewName("admin/admin_content");
		
		return mav;
	}

	@Transactional
	public ModelAndView contentDelete(ContentDTO contentDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		contentDAO.contentDelete(contentDTO);
		mav.setViewName("admin/admin_content");
		
		return mav;
	}

	@Override
	public ModelAndView lockerList() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("LOCKERLIST", lockerDAO.lockerList());
		mav.setViewName("admin/admin_locker");
		
		return mav;
	}

	@Transactional
	public ModelAndView lockerInsert(LockerDTO lockerDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		lockerDAO.lockerInsert(lockerDTO);
		mav.setViewName("main");
		
		return mav;
	}

	@Transactional
	public ModelAndView lockerUpdate(LockerDTO lockerDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		lockerDAO.lockerUpdate(lockerDTO);
		mav.setViewName("admin/admin_locker");
		
		return mav;
	}

	@Transactional
	public ModelAndView lockerDelete(String loc_no) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		lockerDAO.lockerDelete(loc_no);
		mav.setViewName("admin/admin_locker");
		
		return mav;
	}

	@Override
	public ModelAndView scheduleList() {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("SCHEDULELIST", scheduleDAO.scheduleList());
		mav.setViewName("admin/admin_schedule");
		
		return mav;
	}

	@Transactional
	public ModelAndView scheduleInsert(ScheduleDTO scheduleDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		scheduleDAO.scheduleInsert(scheduleDTO);
		mav.setViewName("admin/admin_schedule");
		
		return mav;
	}

	@Transactional
	public ModelAndView scheduleUpdate(ScheduleDTO scheduleDTO) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		scheduleDAO.scheduleInsert(scheduleDTO);
		mav.setViewName("admin/admin_schedule");
		
		return mav;
	}

	@Transactional
	public ModelAndView scheduleDelete(String sch_code) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView();
		
		scheduleDAO.scheduleDelete(sch_code);
		mav.setViewName("admin/admin_schedule");
		
		return mav;
	}
	
	
	// ============ ajax ============
	
	//시간표테이블 pk체크
	public String scheduleOne(String sch_code) {
		
		JSONObject jsonObj = new JSONObject();
		ScheduleDTO schDTO = scheduleDAO.scheduleOne(sch_code);
		boolean result = true;
		
		if(schDTO != null) {
			result = false;
		}
		
		jsonObj.put("RESULT", result);
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}
	
	//가격테이블 pk체크
	public String amountOne(String amt_code) {
		
		JSONObject jsonObj = new JSONObject();
		AmountDTO amountDTO = amountDAO.amountOne(amt_code);
		boolean result = true;
		
		if(amountDTO != null) {
			result = false;
		}
		
		jsonObj.put("RESULT", result);
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}
	
	//공통코드pk체크 밑 코드내용에 데이터가 있는지 확인
	public String commonOne(String com_code) {
		
		JSONObject jsonObj = new JSONObject();
		CommonDTO commonDTO = commonDAO.commonOne(com_code);
		boolean result = true;
		
		if(commonDTO != null) {
			result = false;
		}
		
		jsonObj.put("RESULT", result);
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}
	
	//코드내용 pk체크
	public String contentOne(ContentDTO contentDTO) {
		
		JSONObject jsonObj = new JSONObject();
		ContentDTO contDTO = contentDAO.contentOne(contentDTO);
		boolean result = true;
		
		if(contDTO != null) {
			result = false;
		}
		
		jsonObj.put("RESULT", result);
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}
	
	//사물함 pk체크
	public String lockerOne(String loc_no) {
		
		JSONObject jsonObj = new JSONObject();
		LockerDTO lockerDTO = lockerDAO.lockerOne(loc_no);
		boolean result = true;
		
		if(lockerDTO != null) {
			result = false;
		}
		
		jsonObj.put("RESULT", result);
		String jsonOut = jsonObj.toString();
		
		return jsonOut;
	}
	
}
