package com.example.spring.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectDemoClass {

	@Before("execution(public void com.example.spring.aopdemo.dao.AccountDAO.addAccount())")
	public void BeforeMethodExecution() {
		System.out.println("Execution-------------- using before advice  Aspect Oriented Programming");
		
	}
}
