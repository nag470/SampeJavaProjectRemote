package com.galaxe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.galaxe.Test;

class UserDef extends Exception{
	UserDef(String s){
		super(s);
	}	
	
}
	
public class ExceptionHand  {
	
	public static void main(String[] args) throws UserDef{
		Test t=new Test();
		t.m1(15);
		HashMap h=new HashMap();
		
		h.put(100, "nag");
		h.put(101, "nagendra");
		Iterator it=h.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry m=(Entry) it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
