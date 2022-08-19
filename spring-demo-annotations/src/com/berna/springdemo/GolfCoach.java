package com.berna.springdemo;

public class GolfCoach implements Coach {
	
	FortuneService fortuneService;
	
	public GolfCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDilyWorkout() {
		return "Practice until you throw the ball 100m away.";
	}

	@Override
	public String getDilyFortune() {
		return fortuneService.getFortune();
	}
}
