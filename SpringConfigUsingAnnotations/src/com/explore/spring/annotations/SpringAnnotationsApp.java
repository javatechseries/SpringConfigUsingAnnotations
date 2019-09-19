package com.explore.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tennisCoach=ctxt.getBean("tennisCoach", Coach.class);
		System.out.println("Tennis Coach: "+tennisCoach.getDailyWorkout());
	
		
		Coach cricketCoach=ctxt.getBean("cricketCoach",Coach.class);
		System.out.println("Cricket Coach: "+cricketCoach.getDailyWorkout());
		
		ctxt.close();

	}

}
