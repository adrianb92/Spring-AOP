package com.adrianbarczuk.spring.aop.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private Logger logger = 
			Logger.getLogger(getClass().getName());
	
	@Around("execution(* com.adrianbarczuk.spring.aop.service.FortuneService.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		//print method signature
		String method = proceedingJoinPoint.getSignature().toShortString();
		logger.info(method);
		
		//get begin time and execute method
		long begin = System.currentTimeMillis();
		Object result = null;
		try {
			result = proceedingJoinPoint.proceed();
		} catch (Exception ex) {
			logger.warning("@Around advice catches exception: " + ex);
			throw ex;
		}
		
		//get end time
		long end = System.currentTimeMillis();		
		
		//compute duration time
		long duration = end - begin;
		logger.info("@Around - duration: " + duration/1000.0 + " seconds");
		
		return result;
	}
	
}
