package com.galaxe;

public class Test{
	
	void m1(int a) throws UserDef {
		if(a>18){
			System.out.println("valid for vote");
		}else{
			throw new UserDef("not valid for vote");
		}
}
}
