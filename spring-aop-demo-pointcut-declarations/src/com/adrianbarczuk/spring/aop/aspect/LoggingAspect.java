package com.adrianbarczuk.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(* com.adrianbarczuk.spring.aop.dao.*.*(..))")
	private void pointcutForDaoPackage() {}
	
	@Pointcut("execution(* com.adrianbarczuk.spring.aop.dao.*.get*(..))")
	private void pointcutForGetters() {}
	
	@Pointcut("execution(* com.adrianbarczuk.spring.aop.dao.*.set*(..))")
	private void pointcutForsetters() {}
	
	@Pointcut("pointcutForDaoPackage() && !(pointcutForsetters() || pointcutForGetters())")
	public void pointcutExcludeGettersAndSetters() {}
	
	@Before("pointcutExcludeGettersAndSetters()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("Executing @Before on method");
		
	}
	
	@Before("pointcutExcludeGettersAndSetters()")
	public void performApiAnalytics() {
		
		System.out.println("Perform API Analytics");
		
	}
	
}
