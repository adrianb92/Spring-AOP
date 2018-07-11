package com.adrianbarczuk.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addCash() {
		
		System.out.println("ADD ACCOUNT in " + getClass());
		
		return true;
	}

}
