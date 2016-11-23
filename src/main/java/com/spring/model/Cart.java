package com.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)

private int cartId;
	
private double totalPrice;

@OneToMany(mappedBy="cart",cascade=CascadeType.ALL)

private List<CartItem> cartItem;

public int getCartId() {
	return cartId;
}
public void setCartId(int cartId) {
	this.cartId = cartId;
}

public double getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
public List<CartItem> getCartItem() {
	return cartItem;
}
public void setCartItem(List<CartItem> cartItem) {
	this.cartItem = cartItem;
}
@OneToOne
@JoinColumn(name="userId")
private UserDetail userDetail;

public UserDetail getUserDetail() {
	return userDetail;
}
public void setUserDetail(UserDetail userDetail) {
	this.userDetail = userDetail;
}


}