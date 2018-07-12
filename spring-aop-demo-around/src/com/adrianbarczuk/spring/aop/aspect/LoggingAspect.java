package com.adrianbarczuk.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Around("execution(* com.adrianbarczuk.spring.aop.service.FortuneService.getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		//print method signature
		String method = proceedingJoinPoint.getSignature().toShortString();
		System.out.println(method);
		
		//get begin time and execute method
		long begin = System.currentTimeMillis();
		Object result = proceedingJoinPoint.proceed();
		
		//get end time
		long end = System.currentTimeMillis();		
		
		//compute duration time
		long duration = end - begin;
		System.out.println("@Around - duration: " + duration/1000.0 + " seconds");
		
		return result;
	}
	
}
