package com.goodtime_demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today will be your lucky day, you don hammer!";
	}

}
