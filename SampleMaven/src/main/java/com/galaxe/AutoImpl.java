package com.galaxe;

import org.springframework.stereotype.Service;

@Service
public class AutoImpl implements Auto{

	public String m1() {
	System.out.println("autowire method");
	return "mega star";
		
	}

}
