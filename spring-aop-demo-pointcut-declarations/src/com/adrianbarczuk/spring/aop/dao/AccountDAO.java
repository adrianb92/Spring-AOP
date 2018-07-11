package com.adrianbarczuk.spring.aop.dao;

import org.springframework.stereotype.Component;

import com.adrianbarczuk.spring.aop.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public void addAccount(Account account, boolean vipFlag) {
		
		System.out.println("ADD ACCOUNT in " + getClass());
	}
	
	public boolean doWork() {
		
		System.out.println("DO WORK in " + getClass());
		
		return true;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	
	
}
