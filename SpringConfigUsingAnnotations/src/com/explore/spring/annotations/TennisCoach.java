package com.explore.spring.annotations;


import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
	

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
