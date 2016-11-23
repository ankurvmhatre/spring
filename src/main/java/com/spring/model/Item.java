package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="item")
public class Item {
	@Id
	@Column(name="isbn")
	@GeneratedValue(strategy=GenerationType.AUTO)

	private int isbn;
	private String sportname;
	private String brand;
	private double price;
	private String itemname;
	@ManyToOne
	@JoinColumn(name="category")// Foreign key column in ItemApp table
	private Category category;
	
	public String getSportname() {
		return sportname;
	}

	public void setSportname(String sportname) {
		this.sportname = sportname;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	@Transient
	private MultipartFile itemImage;
	
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return category;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public MultipartFile getItemImage() {
		return itemImage;
	}
	public void setItemImage(MultipartFile itemImage) {
		this.itemImage = itemImage;
	}


}
