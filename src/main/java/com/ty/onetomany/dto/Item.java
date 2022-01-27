package com.ty.onetomany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Item {

	@Id
	private int id;
	private String name;
	private double price;

	
//	private AmazonOrder am;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

//	public AmazonOrder getAm() {
//		return am;
//	}
//
//	public void setAm(AmazonOrder am) {
//		this.am = am;
//	}


}
