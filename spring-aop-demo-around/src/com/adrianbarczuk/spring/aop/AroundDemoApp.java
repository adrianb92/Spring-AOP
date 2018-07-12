package com.adrianbarczuk.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adrianbarczuk.spring.aop.service.FortuneService;

public class AroundDemoApp {
	
	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get beans from container
		FortuneService fortuneService = context.getBean("fortuneService", FortuneService.class);
			
		String data = fortuneService.getFortune();
		System.out.println("Finished.");
		
		//close context
		context.close();
		
	}

}
