package com.likeyichu.springmvc.bean;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private String name="Physics";
	private double price=123;
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
}
