package com.spring.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Item;
import com.spring.model.Cart;
import com.spring.model.CartItem;
//import com.spring.model.Category;
//import com.spring.model.Book;
//import com.spring.model.Cart;
//import com.spring.model.CartItem;
import com.spring.model.UserDetail;
import com.spring.services.ItemService;
import com.spring.services.CartItemService;
import com.spring.services.UserService;



@Controller
public class CartItemController {
@Autowired
private CartItemService cartItemService;
@Autowired
private UserService userService;
@Autowired
private ItemService itemServices;


public UserService getUserService() {
	return userService;
}
public void setUserService(UserService userService) {
	this.userService = userService;
}


public CartItemService getCartItemService() {
	return cartItemService;
}


public void setCartItemService(CartItemService cartItemService) {
	this.cartItemService = cartItemService;
}


public ItemService getItemServices() {
	return itemServices;
}


public void setItemServices(ItemService itemServices) {
	this.itemServices = itemServices;
}

@RequestMapping("/add/{isbn}")
public void addCartItem(@PathVariable(value="isbn") int isbn){
	
	UserDetail user=(UserDetail)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	String username=user.getCustName();
	
	user=userService.getUserDetailByCustName(username);
	
	Cart cart=user.getCart();
	
	List<CartItem> cartItems=cart.getCartItem();
	Item item=itemServices.getItemByIsbn(isbn);
	for(int i=0;i<cartItems.size();i++){
		CartItem cartItem=cartItems.get(i);
		if(item.getIsbn()==cartItem.getItem().getIsbn()){
			cartItem.setQuantity(cartItem.getQuantity() + 1);
			cartItem.setPrice(cartItem.getQuantity() * cartItem.getItem().getPrice());
		cartItemService.addCartItem(cartItem);
		return ;
		
		}	
		
		
	}
	
	CartItem cartItem=new CartItem();
	cartItem.setQuantity(1);
	cartItem.setItem(item);
	cartItem.setPrice(item.getPrice() * 1);
	cartItem.setCart(cart);
	cartItemService.addCartItem(cartItem);
	
}

@RequestMapping("/removecartitem/{cartItemId}")

public void removeCartItem(@PathVariable(value="cartItemId") int cartItemId){
	cartItemService.removeCartItem(cartItemId);
}

/*@RequestMapping("/cart/removeAllItems/{cartId}")
@ResponseStatus(value=HttpStatus.NO_CONTENT)
public void removeAllCartItems(@PathVariable(value="cartId") int cartId){
	Cart cart=cartService.getCartByCartId(cartId);
	cartItemService.removeAllCartItem(cart);
}
*/


}


