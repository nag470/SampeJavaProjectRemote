package com.galaxy;

import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class RepeateWords {
	public static void main(String[] args) {
		
		String s="hai nag how are nag hai";
		String[] st=s.split(" ");
		HashMap<String,Integer> hm=new HashMap();
		for(int i=0;i<st.length;i++){
			
				 if(hm.containsKey(st[i])){
					 hm.put(st[i], hm.get(st[i])+1);
					 
				 }else{
					 hm.put(st[i], 1);
				 }
			 }
		Set<String> st1=hm.keySet();
			
			for(String ch:st1){
				if(hm.get(ch)>1){
					System.out.println(ch+ "---------" +hm.get(ch));
					
				}
		}	
}
		
}	

