package com.galaxe;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static Logger l = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

    Journey obj = (Journey) context.getBean("getVehicle");
    obj.startJourney();
     
		
		Employee e=(Employee) context.getBean("emp");
		System.out.println(e.getName()+" "+e.getDep()+" "+e.getAdd().getCity()+" "+e.getAdd().getState());
		l.info("successfully got the details of an employee");
		
		/*Student obj = (Student) context.getBean("std");
		 Iterator it= obj.getAge().entrySet().iterator();		   while(it.hasNext())
		   {
			   Map.Entry me = (Map.Entry)it.next();
			   System.out.println(me.getKey()+ " - "+me.getValue());
		   }*/
		 
	}

}
