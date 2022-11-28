package com.manikanta.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		Coach sillyCoach = context.getBean("tennisCoach", Coach.class);
		
//		System.out.println(sillyCoach.getDailyWorkout());
//		
//		System.out.println(sillyCoach.getDailyFortune());
//		
//		System.out.println(sillyCoach.getInfo());
//		
		Coach swimmingCoach = context.getBean("swimmingCoach", Coach.class);
		
		System.out.println(swimmingCoach.getDailyFortune());
		
		context.close();
	}

}
