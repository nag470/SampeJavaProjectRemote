package com.galaxe;

import java.util.ArrayList;
import java.util.HashSet;

class Single{
	static Single s=null;
	private Single(){
		
	}
	public static Single getInstance(){
		if(s==null){
		 s=new Single() ; 
		}
		return s;
		
		
	}
	protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }
}

public class ListSample {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		String s1=new String("hai");
		String s2=new String("hai");
		hs.add(s1);
		hs.add(s2);
		System.out.println(hs);
		Single s=Single.getInstance();
		s.demoMethod();
		System.out.println(s);
		Single ss=Single.getInstance();
		ss.demoMethod();
		System.out.println(ss);
		

	}

}
