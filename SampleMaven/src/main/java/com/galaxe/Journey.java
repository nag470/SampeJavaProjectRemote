package com.galaxe;

public class Journey {
	Vehicle v;

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	 void startJourney()
	    {
	       v.move();
	    }
}
