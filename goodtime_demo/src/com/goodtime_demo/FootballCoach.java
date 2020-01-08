package com.goodtime_demo;

public class FootballCoach implements Coach {
	
	private FortuneService myFortune;
	
	

	public FootballCoach(FortuneService myFortune) {
		super();
		this.myFortune = myFortune;
	}

	@Override
	public String getDailyWorkout() {
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return myFortune.getFortune();
	}

}
