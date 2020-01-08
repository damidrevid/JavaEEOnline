package com.goodtime_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringText {

	public static void main(String[] args) {
		// Load bean 
		ClassPathXmlApplicationContext dami = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean
		Coach theCoach = dami.getBean("ball", Coach.class);
		
		// Call Method on Bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//Close dami. Note that this is just a conventional thing and safe practice. It has nothing to do with the written code.
		
		dami.close();
	}

}
