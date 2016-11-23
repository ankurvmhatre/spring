package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customerorder")
public class CustomerOrder {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int customerOrderId;
	@OneToOne
	@JoinColumn(name="cartid")
private Cart cart;
	
	@OneToOne
	@JoinColumn(name="userid")
private UserDetail userDetail;
	
	
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	
	public int getCustomerOrderId() {
		return customerOrderId;
	}
	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	

}
