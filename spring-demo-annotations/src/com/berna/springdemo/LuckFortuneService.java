package com.berna.springdemo;

public class LuckFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Good luck☺";
	}

}
