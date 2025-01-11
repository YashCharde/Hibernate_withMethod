package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sr_no;
	private String product_name;
	private float price;
	private String category;
	
	
	public Product() {
		
	}


	public Product(int sr_no, String product_name, float price, String category) {
		super();
		this.sr_no = sr_no;
		this.product_name = product_name;
		this.price = price;
		this.category = category;
	}


	public int getSr_no() {
		return sr_no;
	}


	public void setSr_no(int sr_no) {
		this.sr_no = sr_no;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [sr_no=" + sr_no + ", product_name=" + product_name + ", price=" + price + ", category="
				+ category + "]";
	}

}
