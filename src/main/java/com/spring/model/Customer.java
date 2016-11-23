package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int customerId;
private String customerName;
private String customerEmail;
private String customerPhone;

@OneToOne
@JoinColumn(name="userdetailid")
private UserDetail userdetail;

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCustomerEmail() {
	return customerEmail;
}

public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}

public String getCustomerPhone() {
	return customerPhone;
}

public void setCustomerPhone(String customerPhone) {
	this.customerPhone = customerPhone;
}

public UserDetail getUserdetail() {
	return userdetail;
}

public void setUserdetail(UserDetail userdetail) {
	this.userdetail = userdetail;
}

 
}
