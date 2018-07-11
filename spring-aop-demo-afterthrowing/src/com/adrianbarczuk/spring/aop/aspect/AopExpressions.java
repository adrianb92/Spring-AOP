package com.adrianbarczuk.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
	
	@Pointcut("execution(* com.adrianbarczuk.spring.aop.dao.*.*(..))")
	public void pointcutForDaoPackage() {}
	
	@Pointcut("execution(* com.adrianbarczuk.spring.aop.dao.*.get*(..))")
	public void pointcutForGetters() {}
	
	@Pointcut("execution(* com.adrianbarczuk.spring.aop.dao.*.set*(..))")
	public void pointcutForsetters() {}
	
	@Pointcut("pointcutForDaoPackage() && !(pointcutForsetters() || pointcutForGetters())")
	public void pointcutExcludeGettersAndSetters() {}

}
