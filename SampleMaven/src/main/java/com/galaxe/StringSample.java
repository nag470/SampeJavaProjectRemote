package com.galaxe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class StringSample {

	public static void main(String[] args) {
		String s="nagendra";
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
		System.out.println();
		int [] k={3,6,1,9,45,99,76};
		int max=0;
		for(int i=0;i<k.length;i++){
			if(k[i]>max){
				max=k[i];
			}
				
		}
		System.out.println(max);
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	for(int i=0;i<c.length;i++){
		if(hm.containsKey(c[i])){
			hm.put(c[i], hm.get(c[i])+1);	
		}
		else{
			hm.put(c[i], 1);
		}
	}
	
	Iterator it=hm.entrySet().iterator();
	while(it.hasNext()){
		Map.Entry<Character,Integer> mp= (Entry<Character, Integer>) it.next();
		if(mp.getValue()>1){
			System.out.println(mp.getKey()+"--->"+mp.getValue());
		}
	}
	
}
}

