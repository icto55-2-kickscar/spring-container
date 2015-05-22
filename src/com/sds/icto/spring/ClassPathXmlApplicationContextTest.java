package com.sds.icto.spring;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sds.icto.mylibs.MyClass;

public class ClassPathXmlApplicationContextTest {
	
	public static void main(String[] args) {
		try {
			ApplicationContext factory = new ClassPathXmlApplicationContext( "applicationContext.xml" );
			
			
			MyClass myObject = (MyClass)factory.getBean( "myBean" );
			System.out.println( myObject.getTitle() );
			
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
}
