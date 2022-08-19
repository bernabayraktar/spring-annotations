package com.berna.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanLifecycleDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrrieve bean from spring container
		Coach theCoach = context.getBean("pingPongCoach", Coach.class);

		System.out.println(theCoach.getDilyWorkout());
		System.out.println(theCoach.getDilyFortune());

		// close the context
		context.close();

	}

}
