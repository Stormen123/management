package com.management.b1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.management.b1.service.ISearchService;

@Controller
public class MainController {

	@Autowired
	ISearchService searchService;
	
	@RequestMapping(value="/")
	public String main() {
		return "home";
	}
	
	@RequestMapping(value="home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(value="search")
	public String search() {
		return "search";
	}
}
