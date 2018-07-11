package com.adrianbarczuk.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class LoggingAspect {
	
	@Before("com.adrianbarczuk.spring.aop.aspect.AopExpressions.pointcutExcludeGettersAndSetters()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Executing @Before on method");
		
	}
	
	
	
}
