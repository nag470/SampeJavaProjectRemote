package com.lara;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

class MyGen<Object>{ 
	
	
	public MyGen(Object obj,Object obj1) {
		
		int a=obj+obj1;
		System.out.println(obj);
	}
	
} 

public class Hello  {

	
	 public static void main(String args[]){  
		 MyGen m=new MyGen(12, 14);
		 /*MyGen<Integer> m=new MyGen<Integer>();  
		 m.add(2);  
		 //m.add("vivek");//Compile time error  
		 System.out.println(m.get());*/
		/* Hashtable<String,String> premiumPhone = new Hashtable<String,String>();
	        premiumPhone.put("Apple", "iPhone");
	        premiumPhone.put("HTC", "HTC one");
	        premiumPhone.put("Samsung","S5");
	        
	        Iterator iterator = premiumPhone.keySet().iterator();
	        
	        while (iterator.hasNext())
	        {
	            System.out.println(premiumPhone.get(iterator.next()));
	            premiumPhone.put("Sony", "Xperia Z");
	        } */
		 
	/*String s="amma";
	char[] c=s.toCharArray();
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	
	Iterator it=hm.values().iterator();
		
		for(Character ch:c)
			if(hm.containsKey(ch)){
				hm.put(ch, hm.get(ch)+1);
				
			}else{
				hm.put(ch,1);
			}
			
		}*/
}
}
