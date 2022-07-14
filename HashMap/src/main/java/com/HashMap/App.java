package com.HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Map<String,Integer> map = (HashMap) context.getBean("map");
//        Collections.sort(map);
        System.out.println(map);
    }
}
