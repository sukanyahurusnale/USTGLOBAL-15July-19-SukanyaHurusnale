package com.ustglobal.ustspringcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WriterAuthorApp {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("author.xml");
		Author author=context.getBean(Author.class);
		System.out.println(author.getName());
		author.getWriter().write();
	
	}

}
