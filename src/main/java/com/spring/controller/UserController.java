package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.UserDao;
import com.spring.model.UserCredential;
import com.spring.model.UserDetail;

@Controller

public class UserController {

	
	@Autowired
	UserDao logDao;
	
	
	@RequestMapping(value="/SignUp",method=RequestMethod.GET)
	public ModelAndView showUserDetails()
	{	
		ModelAndView m = new ModelAndView("SignUp", "userDetail", new UserDetail());
		return m;	
	}
	
	@RequestMapping(value="/SignUp",method=RequestMethod.POST)
	public String login(UserDetail userDetail)
	{
		UserCredential userCredential=new UserCredential();
		userCredential.setUserId(userCredential.getUserId());
		userCredential.setPass(userDetail.getPass());
		userCredential.setCustName(userDetail.getCustName());
		userCredential.setEnabled(true);
		userCredential.setRole("ROLE_USER");
		
		logDao.insert(userDetail);
		logDao.insertcredent(userCredential);
		
		return "SignUp";
	}
}
