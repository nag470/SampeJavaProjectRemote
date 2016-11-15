package com.galaxy;

import java.util.ArrayList;
import java.util.List;

public class ExceptionSample {
	

	public static void main(String[] args) {
		System.out.println(ExceptionSample.sum());
		List<String> l=new ArrayList<String>();
		l.add("hai");
		l.add("hello");
		for(String s:l){
			System.out.println(s);
		}	
			
	}
	
	public static int sum(){
		try{
			int a=10/2;
			return 1;
		
		}catch(Exception e){
			return 5;
			
		}finally {
			
		return 2;	
		}
		
	}

}
