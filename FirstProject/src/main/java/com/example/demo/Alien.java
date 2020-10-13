package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired; // for Autowired
import org.springframework.beans.factory.annotation.Qualifier; // for Qualifier
import org.springframework.context.annotation.Scope; // for component
import org.springframework.stereotype.Component; // for scope

@Component
//@Scope(value="prototype")
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	
	@Autowired // searches by type
	@Qualifier("lap1") //searches by name
	private Laptop lap;

	public Alien() {
		super();
		System.out.println("Hey!! Am inside constructor Alien class/Object created");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
	
	public void show() {
		System.out.println("Hey!! Am inside show method");
		lap.compile();
	}

}
