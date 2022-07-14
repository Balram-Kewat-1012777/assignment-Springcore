package com.CalculateEMI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
 System.out.println("hello");
 ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	Emi e = (Emi) context.getBean("p1");

    }
}
