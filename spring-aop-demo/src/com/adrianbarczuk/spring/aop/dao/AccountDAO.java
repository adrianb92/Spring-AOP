package com.adrianbarczuk.spring.aop.dao;

import org.springframework.stereotype.Component;

import com.adrianbarczuk.spring.aop.Account;

@Component
public class AccountDAO {

	public void addAccount(Account account, boolean vipFlag) {
		
		System.out.println("ADD ACCOUNT in " + getClass());
	}
	
	public boolean doWork() {
		
		System.out.println("DO WORK in " + getClass());
		
		return true;
		
	}
	
}
