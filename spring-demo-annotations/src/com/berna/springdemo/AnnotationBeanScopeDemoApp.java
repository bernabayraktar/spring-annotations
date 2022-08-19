package com.berna.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrrieve bean from spring container
		Coach theCoach = context.getBean("lacrosseCoach", Coach.class);

		Coach alphaCoach = context.getBean("lacrosseCoach", Coach.class);

		// chech if they are the same
		boolean result = (theCoach == alphaCoach);

		// print out the result
		System.out.println("\n Pointing to the same object? - " + result);
		
		System.out.println("\n Memory location for theCoach: "+theCoach);
		
		System.out.println("\n Memory location for alphaCoach: "+alphaCoach);
		
		// close the context
		context.close();
	}
}
