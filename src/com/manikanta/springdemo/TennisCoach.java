package com.manikanta.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}
//	
//	public TennisCoach() {
//	super();
//}
	
	public TennisCoach() {
		System.out.println("Inside the default constructor");
	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService _FortuneService) {
//		fortuneService = _FortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backhand volley";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public String getRandomFortuneFromFile() {
		
		return "";
	}
	
	@Override
	public String getInfo() {
		return email + " belongs to " + team;
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Tennis coach started");
	}
	
	@PreDestroy
	public void doMyCloseupStuff() {
		System.out.println("Tennis coach destroyed");
	}

}
