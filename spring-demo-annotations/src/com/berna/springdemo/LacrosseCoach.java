package com.berna.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LacrosseCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// TODO --> Constructor Injection
//	@Autowired
//	public LacrosseCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}

	// TODO --> Setter Injection
	// define a default constr
	public LacrosseCoach() {
		System.out.println(">> LacrosseCoach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> LacrosseCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> LacrosseCoach: inside of doMyCleanupStuff()");
	}
	

	// define a setter method for injecting of FurtuneService ☺
//	@Autowired
//	public void setFurtuneService(FortuneService fortuneService) {
//	    System.out.println(">> LacrosseCoach: inside setFortuneService() method");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> LacrosseCoach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDilyWorkout() {
		return "Practise catching the ball in the air";
	}

	@Override
	public String getDilyFortune() {
		return fortuneService.getFortune();
	}

}
