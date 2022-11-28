package com.manikanta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
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
