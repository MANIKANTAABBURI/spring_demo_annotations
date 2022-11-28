package com.manikanta.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.manikanta.springdemo")
@PropertySource("classpath:sport.properties")
public class SportsConfig {
	// define sad fortune bean
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define SwimCoach bean
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
