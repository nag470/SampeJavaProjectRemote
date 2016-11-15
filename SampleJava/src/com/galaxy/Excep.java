package com.galaxy;

import java.io.IOException;

class Test1{
	public void m1()  {
		System.out.println("hai");
	}
}
class Test2 extends Test1{
	public void m1()throws ArithmeticException {
		
		
	}
}

public class Excep {

	public static void main(String[] args)  {
Test1 t=new Test1();

	try {
		t.m1();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	}

}
