package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext c = SpringApplication.run(FirstProjectApplication.class, args);
		
		System.out.println("HELLO - This is my first SPRINGBOOT");
		
	   Alien a = c.getBean(Alien.class);
	    
	    a.show();
		
	    

	    /*   Alien b = c.getBean(Alien.class);
	    
	    b.show(); */
	    
	    
	//	Alien a =  new Alien(); old way of creating object
	}

	public FirstProjectApplication() {
		super();
		System.out.println("Hey!! Am inside constructor Main");
		// TODO Auto-generated constructor stub
	}

}
