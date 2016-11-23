package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.model.Cart;
import com.spring.model.Customer;
import com.spring.model.UserDetail;
import com.spring.services.CartItemService;
import com.spring.services.CartServiceImpl;
import com.spring.services.CustomerServices;
import com.spring.services.UserService;

@Controller
public class CartController {
@Autowired
private CustomerServices customerServices;
@Autowired
private CartServiceImpl cartService;
@Autowired
private UserService userService;



public CartServiceImpl getCartService() {
	return cartService;
}

public void setCartService(CartServiceImpl cartService) {
	this.cartService = cartService;
}

public CustomerServices getCustomerServices() {
		return customerServices;
	}

	public void setCustomerServices(CustomerServices customerServices) {
		this.customerServices = customerServices;
	}

	@RequestMapping("/getCartId/{cartId}")
	public String getCartIdCartId(Model model){
		UserDetail user=(UserDetail)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username=user.getCustName();
	      user=userService.getUserDetailByCustName(username);
		model.addAttribute("cartId",user.getCart().getCartId());
		return "Cart";
	}
	/*@RequestMapping("/getCart/{cartId}")
	public @ResponseBody Cart getCartItem(
			@PathVariable(value="cartId") int cartId){
		return cartService.getCartByCartId(cartId);
	}
	*/

}


