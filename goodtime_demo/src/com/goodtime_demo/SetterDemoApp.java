package com.goodtime_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load DI
		ClassPathXmlApplicationContext jide = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean
		VolleyballCoach theCoach = jide.getBean("volley", VolleyballCoach.class);
		VolleyballCoach ourCoach = jide.getBean("volley", VolleyballCoach.class);
		
		//Call Method
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//Get literal values
		System.out.println(theCoach.getTeam());
		System.out.println(theCoach.getEmailAddress());
		
		//Test bean scope
		Boolean result = theCoach == ourCoach;
		
		System.out.println("Comparing the object reference of the bean: " + result);
		System.out.println(theCoach);
		System.out.println(ourCoach);
		
		//Close jide
		jide.close();

	}

}
