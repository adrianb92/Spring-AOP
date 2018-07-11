package com.adrianbarczuk.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(* com.adrianbarczuk.spring.aop.dao.*.*(..))")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Executing @Before on addAccount()");
		
	}
	
	
}
