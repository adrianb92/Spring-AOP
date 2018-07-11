package com.adrianbarczuk.spring.aop.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.adrianbarczuk.spring.aop.Account;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;
	
	public List<Account> findAccounts(boolean tripWire) {
		
		//simulate exception
		if (tripWire == true) {
			throw new RuntimeException("findAccounts() excpetion");
		}
		List<Account> accounts = new ArrayList<>();
		
		Account account1 = new Account("First", "Silver");
		Account account2 = new Account("Second", "Platinum");
		Account account3 = new Account("Third", "Gold");
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		return accounts;
	}
	
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
