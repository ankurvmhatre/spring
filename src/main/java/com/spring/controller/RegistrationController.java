package com.spring.controller;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.spring.model.Customer;
import com.spring.model.UserDetail;
import com.spring.services.CustomerServices;
@Controller
public class RegistrationController {
	@Autowired
	//dependency injection
	private CustomerServices customerServices;



	public CustomerServices getCustomerServices() {
		return customerServices;
	}
	public void setCustomerServices(CustomerServices customerServices) {
		this.customerServices = customerServices;
	}
	//To display registration form
		//when the user makes the request by the url  /customer/registration (get)
	@RequestMapping("/registration")
	public ModelAndView getRegistrationForm(){
		Customer customer=new Customer();
		UserDetail userdetail=new UserDetail();
		
		customer.setUserdetail(userdetail);
		
		return new ModelAndView("registrationCustomer","customer",customer);
		
	}
	//to insert the data 
	@RequestMapping(value="/customer/registration",method=RequestMethod.POST)
	public String registerCustomer(@Valid @ModelAttribute(value="customer")Customer customer,
			BindingResult result,Model model){
		if(result.hasErrors())
			return "registerCustomer";
		
		List<Customer> customerList=customerServices.getAllCustomers();
		for(Customer c:customerList){
			if(c.getUserdetail().getCustName().equals(customer.getUserdetail().getCustName()))
			{
				model.addAttribute("duplicateUname","Username already exists");
				return "registerCustomer";
			}
			if(c.getCustomerEmail().equals(customer.getCustomerEmail())){
				model.addAttribute("duplicateEmail","Email Id already exists");
				return "registerCustomer";
			}
		}

		customerServices.addCustomer(customer);
		model.addAttribute("registrationSuccess","Registered Successfully. Login using username and password");
		return "login";
	}


}
