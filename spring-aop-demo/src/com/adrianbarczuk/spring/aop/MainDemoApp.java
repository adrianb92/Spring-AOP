package com.adrianbarczuk.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adrianbarczuk.spring.aop.dao.AccountDAO;
import com.adrianbarczuk.spring.aop.dao.MembershipDAO;

public class MainDemoApp {
	
	public static void main(String[] args) {
		
		//read spring config java class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get beans from container
		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		//call business methods
		Account account = new Account();
		accountDAO.addAccount(account, true);
		accountDAO.doWork();
		
		membershipDAO.addCash();
		
		//close context
		context.close();
		
	}

}
