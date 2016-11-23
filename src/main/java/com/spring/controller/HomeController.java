package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String Home(){
		return "home";
	}

	@RequestMapping("/Aboutus")
	public String Aboutus(){
		return "Aboutus";
	}

	
	/*@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false) String logout, 
			Model model){
			if(error!=null)
		model.addAttribute("error","Invalid username and password");
		
		if(logout!=null)
			model.addAttribute("logout","You have logged out successfully");
		return"login";
	}
*/
	
}
