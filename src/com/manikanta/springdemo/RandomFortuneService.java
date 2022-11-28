package com.manikanta.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] fortunes = {"You will win", "Do good and you will be in the world cup squad", 
			"Don't give up"};
	private Random randomNumberGenerator = new Random();
	@Override
	public String getFortune() {
		int randomIndex = randomNumberGenerator.nextInt(fortunes.length);
		return fortunes[randomIndex];
	}

}
