package com.example.spring.aopdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

	@Override
	public boolean addMemberAccount() {
		// TODO Auto-generated method stub
        System.out.println(getClass() + " MembershipAccount Method");
		return true;
	}

}
