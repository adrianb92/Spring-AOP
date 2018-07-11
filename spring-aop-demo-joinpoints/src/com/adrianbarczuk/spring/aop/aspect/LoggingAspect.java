package com.adrianbarczuk.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.adrianbarczuk.spring.aop.Account;

@Aspect
@Component
@Order(2)
public class LoggingAspect {
	
	@Before("com.adrianbarczuk.spring.aop.aspect.AopExpressions.pointcutExcludeGettersAndSetters()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		
		System.out.println("Executing @Before on method");
		
		//display method signature
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		System.out.println(methodSignature);
		
		//display method arguments
		Object[] args = joinPoint.getArgs();
		
		for (Object object : args) {
			System.out.println(object);
			
			if (object instanceof Account) {
				Account account = (Account) object;
				System.out.println("Account name: " + account.getName());
				System.out.println("Account level: " + account.getLevel());
			}
		}
		
	}
	
	
	
}
