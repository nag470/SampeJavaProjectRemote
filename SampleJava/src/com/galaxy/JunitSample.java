package com.galaxy;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitSample {
	
	@BeforeClass  
    public static void  setUpBeforeClass() {  
        System.out.println("before class");  
    }  

	 String name = "nag";	
	   Student s = new Student(10,"nag","hyd");
	   
	   @Before
	   public void getMessage1(){
		   System.out.println("hai pavan");
	   }
	  
	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(name,s.getName());
	   }
}
