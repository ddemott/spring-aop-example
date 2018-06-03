package com.demott.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demott.spring.service.EmployeeService;

public class Main {
    
    public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		System.out.println("****************************************************");
		
		employeeService.getEmployee().setName("DeMott");
		
		System.out.println("****************************************************");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}

}
