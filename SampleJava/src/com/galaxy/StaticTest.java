package com.galaxy;

class A{
	A(){
		System.out.println("hai");
	}
	A(int a){
		System.out.println(a);
	}
	static int a=10;
}
class B extends A{
	B(){
		super(10);
	System.out.println("hello");
	}
	static int a=20;
	static String name="nag";
}
public class StaticTest {

	public static void  main(String[] args) {
		A b=new B();
		b.a=30;
		B b1=new B();
		b1.name="nagendra";
		b1.a=50;
		System.out.println(b.a);
		System.out.println(b1.a);
		
		int numbers[]={2,4,8,5};
		int max=0;
		for(int i=0;i<numbers.length;i++){
			if(max<numbers[i]){
				max=numbers[i];
			}
		}
System.out.println(max);
	}

}
