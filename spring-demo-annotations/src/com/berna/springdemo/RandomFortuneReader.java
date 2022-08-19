package com.berna.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneReader implements FortuneService {

	@Value("${fortune.happy}")
	private String happy;

	@Value("${fortune.sad}")
	private String sad;

	@Value("${fortune.worried}")
	private String worried;

	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		String[] fortunes = { happy, sad, worried };

		int index = myRandom.nextInt(fortunes.length);

		return fortunes[index];
	}

}
