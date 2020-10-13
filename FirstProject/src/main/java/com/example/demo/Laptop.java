package com.example.demo;

import org.springframework.context.annotation.Scope; // for scope
import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	private int lid;
	private String brand;
	
	public void compile() {
		System.out.println("Hey!! Am compiling");
	}

}
