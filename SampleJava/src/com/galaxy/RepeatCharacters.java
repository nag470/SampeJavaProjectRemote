package com.galaxy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class RepeatCharacters {

	public static void main(String[] args) {
		String s="nagendra";
		 char[] c=s.toCharArray();
		 HashMap<Character,Integer> hm=new HashMap();
		 for(Character ch:c){
			 if(hm.containsKey(ch)){
				 hm.put(ch, hm.get(ch)+1);
				 
			 }else{
				 hm.put(ch, 1);
			 }
		 }
		 Set<Character> st=hm.keySet();
		for(Character ch:st){
			if(hm.get(ch)>1){
				System.out.println(ch+ "" +hm.get(ch));
				
			}
		}
		
	}
	}


