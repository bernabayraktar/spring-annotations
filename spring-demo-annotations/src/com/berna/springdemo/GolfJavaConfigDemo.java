package com.berna.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GolfJavaConfigDemo {
	
	@Bean
	public FortuneService luckFortuneService() {
		return new LuckFortuneService();
	}

	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach golfCoach() {
		return new GolfCoach(luckFortuneService());
	}
}
