package com.medium.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {

	public static void main(String[] args) {
		// Take out the bean from IoC container for usage.
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanConfig.xml");
		SmallPotato smallPotato = ac.getBean("smallPotato", SmallPotato.class);

		smallPotato.greet();
		smallPotato.check("Ken");
	}

}
