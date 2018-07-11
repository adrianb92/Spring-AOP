package com.adrianbarczuk.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class ApiAnalyticsAspect {

	@Before("com.adrianbarczuk.spring.aop.aspect.AopExpressions.pointcutExcludeGettersAndSetters()")
	public void performApiAnalytics() {
		
		System.out.println("Perform API Analytics");
		
	}
	
}
