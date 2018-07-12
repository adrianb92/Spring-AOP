package com.adrianbarczuk.spring.aop;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adrianbarczuk.spring.aop.service.FortuneService;

public class AroundWithLoggerDemoApp {
	
	private static Logger logger = 
			Logger.getLogger(AroundWithLoggerDemoApp.class.getName());
	
	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get beans from container
		FortuneService fortuneService = context.getBean("fortuneService", FortuneService.class);
			
		String data = fortuneService.getFortune();
		logger.info("Finished.");
		
		//close context
		context.close();
		
	}

}
