package com.netease.aophomework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		MyBalance myBalance = context.getBean("myBalance", MyBalance.class);
		System.out.println(myBalance.add(1));
		System.out.println(myBalance.sub(2));
		System.out.println(myBalance.getClass());

		((ConfigurableApplicationContext) context).close();
	}
}
