package com.manikanta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		// Load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve bean
		Coach sillyMaleCoach = context.getBean("tennisCoach", Coach.class);
		Coach sillyFemaleCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(sillyMaleCoach);
		System.out.println(sillyFemaleCoach);
		// close context
		context.close();
	}

}
