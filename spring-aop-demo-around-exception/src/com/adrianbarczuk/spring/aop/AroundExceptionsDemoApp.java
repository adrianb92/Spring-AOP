package com.adrianbarczuk.spring.aop;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adrianbarczuk.spring.aop.service.FortuneService;

public class AroundExceptionsDemoApp {
	
	private static Logger logger = 
			Logger.getLogger(AroundExceptionsDemoApp.class.getName());
	
	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get beans from container
		FortuneService fortuneService = context.getBean("fortuneService", FortuneService.class);
			
		boolean tripWire = true;
		String data = fortuneService.getFortune(tripWire);
		
		logger.info("Finished.");
		
		//close context
		context.close();
		
	}

}
