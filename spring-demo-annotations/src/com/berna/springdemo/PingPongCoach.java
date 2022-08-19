package com.berna.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {
	FortuneService fortuneService;

	public PingPongCoach() {
		super();
		System.out.println(">> PingPongCoach: Default constr executed successfully ☺");
	}

	@Autowired
	public PingPongCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDilyWorkout() {
		return "Develop a third-ball attack.";
	}

	@Override
	public String getDilyFortune() {
		return fortuneService.getFortune();
	}

}
