package com.manikanta.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Todays work will be a crucial brick to your ideal self";
	}

}
