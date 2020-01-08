package com.goodtime_demo;

public class VolleyballCoach implements Coach {
	
	private FortuneService myFortuneService;
	private String emailAddress;
	private String team;
	
	
	// No-arg constructor. Because of the Constructor DI, we have to have a placeholder sort of constructor.
	
	public VolleyballCoach() {
		System.out.println("Hello, this is a test message");
	}
	
	// Setter
	public void setMyFortuneService(FortuneService myFortuneService) {
		this.myFortuneService = myFortuneService;
	}
	
	
	//Setter and getter for emailAddress
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Set the email address: ");
		this.emailAddress = emailAddress;
	}

	//Setter and getter for team
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Set the Team's name: ");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// 
		return "Run round the stadium 5 times daily at 5pm";
	}

	@Override
	public String getDailyFortune() {
		return "You are very lucky. Your star is shining up in heaven right now";
	}

}
