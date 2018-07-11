package com.adrianbarczuk.spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adrianbarczuk.spring.aop.dao.AccountDAO;

public class AfterThrowingDemoApp {
	
	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get beans from container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		List<Account> accounts;
		
		//find accounts and display
		try {
			boolean tripWire = true;
			accounts = accountDAO.findAccounts(tripWire);
			System.out.println(accounts);
		} catch(Exception ex) {
			System.out.println(ex);
		}
				
		//close context
		context.close();
		
	}

}
