package com.berna.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:mylogger.properties")
@PropertySource("classpath:sport.properties")

public class SportConfig {

	@Bean
	public MyLoggerJavaConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
			@Value("${printed.logger.level}") String printedLoggerLevel) {

		MyLoggerJavaConfig myLoggerConfig = new MyLoggerJavaConfig(rootLoggerLevel, printedLoggerLevel);

		return myLoggerConfig;
	}

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
