package com.galaxe;

import java.util.ArrayList;
import java.util.Iterator;

class Aa{
	void m1(){
		System.out.println("hai");
	}
	
}
class Bb extends Aa{
	
}

public class Test {

	public static void main(String[] args) {
		Aa a=new Aa();
		a.m1();
		ArrayList al=new ArrayList();
		al.add(null);
		Iterator it=al.iterator();
		while(it.hasNext()){
			String s=(String) it.next();
			System.out.println(s);
		}

	}

}
