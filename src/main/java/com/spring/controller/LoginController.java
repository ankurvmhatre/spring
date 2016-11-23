package com.spring.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dao.ItemDao;
import com.spring.model.Item;

@Controller
public class LoginController {

@Autowired
ItemDao proDao;
@RequestMapping(value="/Login",method=RequestMethod.GET)
public String showUserDetails()
{
return "login";
}

@RequestMapping(value="/AdminHeader",method=RequestMethod.GET)
public String showAdminHeader()
{
return "AdminHeader";
}
@SuppressWarnings("unchecked")
@RequestMapping(value = "/loginsuccess")
public String access_level_session(HttpSession session,Model model) {
String userid = SecurityContextHolder.getContext().getAuthentication().getName();
session.setAttribute("LoggedIn", "true");
System.out.println("In access_level_session");
Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) SecurityContextHolder.getContext() .getAuthentication().getAuthorities();
String page="";
String role="ROLE_USER";
for (GrantedAuthority authority : authorities) 
{
 
    if (authority.getAuthority().equalsIgnoreCase(role)) 
    {
     
	      List<Item> data=proDao.getAllItems();
	   
	      
	      ArrayList<Item> items=new ArrayList<Item>();
	      session.setAttribute("UserLoggedIn",true);
	      session.setAttribute("mycart",items);
	      session.setAttribute("user", userid);
	      
	
     
     model.addAttribute("dataList",data);
     
     page="/header";
    
    }
    else 
    {
     page="/AdminHeader";
     
     session.setAttribute("Administrator", "true");
     session.setAttribute("user", userid);
 
   }
}
return page;
}
@RequestMapping(value="/perform_logout",method=RequestMethod.GET)
public String showLogout()
{
return "login";
}

}