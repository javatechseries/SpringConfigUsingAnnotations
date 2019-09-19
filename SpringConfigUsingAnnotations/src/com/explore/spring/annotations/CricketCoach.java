package com.explore.spring.annotations;

import org.springframework.stereotype.Component;


//When we don't provide bean name spring will provide default name which is the name of the class with first letter lowercase
//In this case, it would be cricketCoach
@Component
public class CricketCoach implements Coach {
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice 1000 balls per day";
	}

}
