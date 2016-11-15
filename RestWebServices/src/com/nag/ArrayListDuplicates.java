package com.nag;

import java.util.ArrayList;

public class ArrayListDuplicates {

	public static void main(String[] args) {
		ArrayList<String> dup=new ArrayList<String>();
		dup.add("hai");
		dup.add("hello");
		dup.add("hai");
		ArrayList<String> uniq=new ArrayList<String>();
		for(String s:dup){
			if(!uniq.contains(s)){
				uniq.add(s);
				
				
			}
		}
		System.out.println(uniq);

	}

}
