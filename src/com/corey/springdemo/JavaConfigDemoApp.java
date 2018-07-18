package com.corey.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// Read the Spring configuration Java class
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Get the bean from the Spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close();

	}

}
