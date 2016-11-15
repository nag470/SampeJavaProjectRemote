package com.galaxy;

import java.io.IOException;
import java.sql.SQLException;

class C{
	
	public int i=10;
	static int j=20;
	public  void m1()  {
		System.out.println("hai");
	}
	public  void m2(){
		System.out.println(j);
	}
}
class D extends C{
	private int i=20;
	public  void m1(){
		System.out.println(i);
		System.out.println("hello");
		try{
			int a[]={1,3};
			System.out.println(a[3]);
		}catch(ArithmeticException e){
			System.out.println("arithmatic");
		}catch(Exception e){
			System.out.println("arit");
		}finally {
			
		}
}
}

public   class MethodOverridingSample {

	public static void main(String[] args) {
        C c=new D();
		c.m1();
	



	}

}
