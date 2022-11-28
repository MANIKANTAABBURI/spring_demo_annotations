package com.manikanta.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	public String getEmail() {
		return email;
	}

	@Value("${foo.team}")
	private String team;
	
	public String getTeam() {
		return team;
	}

	public SwimCoach(FortuneService _FortuneService) {
		this.fortuneService = _FortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim thousand meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
