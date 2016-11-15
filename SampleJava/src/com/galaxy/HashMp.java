package com.galaxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMp {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, null);
		hm.put(null, null);
		hm.put(null, "welcome");
		hm.put(2, null);
		
	    Iterator it= hm.entrySet().iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
		
		

	}

}
