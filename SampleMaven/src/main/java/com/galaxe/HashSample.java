package com.galaxe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.springframework.util.CollectionUtils;

public class HashSample {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("sree", 25000);
		hm.put("nag", 30000);
		hm.put("jai", 12000);
		hm.put("ajay", 18000);
		
		TreeMap<String,Integer> tm=new TreeMap<String, Integer>(hm);
		
		for(Iterator<Entry<String, Integer>> it=tm.entrySet().iterator();it.hasNext();){
			Map.Entry<String, Integer> map=(Entry<String, Integer>) it.next();
			System.out.println(map.getKey()+":"+map.getValue());
			
		}
		
		List<Entry<String, Integer>> l=new ArrayList<Entry<String, Integer>>(hm.entrySet());
		Collections.sort(l, new Comparator<Entry<String, Integer>>() {
		public int compare(Entry<String, Integer> e1,Entry<String, Integer> e2){
			return e1.getValue().compareTo(e2.getValue());
		}	
		});

		for(Map.Entry<String, Integer> entry:l){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }


	}

}
