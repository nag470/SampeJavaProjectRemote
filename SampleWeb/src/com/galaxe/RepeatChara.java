package com.galaxe;

import java.util.HashMap;

public class RepeatChara {

	public static void main(String[] args) {
		String s="nagendra";
		char c[]=s.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<c.length;i++){
			if(hm.containsKey(c[i])){
				hm.put(c[i], hm.get(c[i])+1);
				System.out.println(c[i]+ " " +hm.get(c[i]));
			}else{
				hm.put(c[i], 1);
			}
			
		}
		
		

	}

}
