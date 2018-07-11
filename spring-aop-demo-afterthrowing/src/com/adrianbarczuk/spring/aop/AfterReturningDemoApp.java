package com.adrianbarczuk.spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adrianbarczuk.spring.aop.dao.AccountDAO;

public class AfterReturningDemoApp {
	
	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get beans from container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//find accounts and display
		List<Account> accounts = accountDAO.findAccounts(false);
		System.out.println(accounts);
		
		//close context
		context.close();
		
	}

}
