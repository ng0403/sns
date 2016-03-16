package com.bit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
 
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	 
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
	@RequestMapping("/myprofile")
	public String myprofile() {
		return "myprofile";
	}
	@RequestMapping("logout")
	public String logout() {
		return "redirect:/home";
	}
		
}
