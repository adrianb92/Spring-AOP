package com.adrianbarczuk.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public boolean addMember() {
		
		System.out.println("ADD MEMBER in " + getClass());
		
		return true;
	}

}
