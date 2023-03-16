package com.management.b1.dto;

public class MemberCountDTO {

	private String sch_item;
	private String sch_class;
	private String sch_time;
	private String sch_week;
	private String sch_day;
	private int count;
	
	public String getSch_item() {
		return sch_item;
	}
	public void setSch_item(String sch_item) {
		this.sch_item = sch_item;
	}
	public String getSch_class() {
		return sch_class;
	}
	public void setSch_class(String sch_class) {
		this.sch_class = sch_class;
	}
	public String getSch_time() {
		return sch_time;
	}
	public void setSch_time(String sch_time) {
		this.sch_time = sch_time;
	}
	public String getSch_week() {
		return sch_week;
	}
	public void setSch_week(String sch_week) {
		this.sch_week = sch_week;
	}
	public String getSch_day() {
		return sch_day;
	}
	public void setSch_day(String sch_day) {
		this.sch_day = sch_day;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
