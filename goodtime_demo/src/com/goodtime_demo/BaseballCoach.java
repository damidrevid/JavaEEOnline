package com.goodtime_demo;

	//Implement the Coach Interface
public class BaseballCoach implements Coach {
	
	//declare a private field for dependency injection (DI)
	private FortuneService fortuneService;
	
	// Create a constructor for DI
		public BaseballCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}

	
	//Override the getDailyWorkout method from the Interface
		
		@Override
		public String getDailyWorkout() {
			return "This is Dami trying to open a can of goodness";
		}

		
		@Override
		public String getDailyFortune() {			
			// Consume the FortuneService
			return ("Everything is going to be okay:" + fortuneService.getFortune());
		}

}
