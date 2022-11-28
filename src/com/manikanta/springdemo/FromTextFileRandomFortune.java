package com.manikanta.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FromTextFileRandomFortune implements FortuneService {

	ArrayList<String> fortunes = new ArrayList<String>();
	
	@PostConstruct
	// Load fortunes from a file
	public void getFortunesFromAFile() throws IOException {
		System.out.println("This is a post construct method");
		File file = new File("D:\\Udemy\\Spring&Hibernate\\spring_demo_annotations\\src\\Resources\\AllFortunes");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String fortune;
			while((fortune = br.readLine()) != null) {
				fortunes.add(fortune);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private Random random = new Random();
	@Override
	public String getFortune() {
		
		int index = random.nextInt(fortunes.size());
		return fortunes.get(index);
	}

}
