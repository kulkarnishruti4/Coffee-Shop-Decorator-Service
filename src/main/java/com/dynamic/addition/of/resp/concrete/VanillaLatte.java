package com.dynamic.addition.of.resp.concrete;

import com.dynamic.addition.of.resp.base.Espresso;


/**
 * This class is a type of drink made from Espresso. 
 * Its a derived class called Vanilla Latte
 * 
 */
public class VanillaLatte implements Espresso {
	
	@Override
	public String getDescription() {
		return "This is a Vanilla Latte which contains one shot of espresso ";
	}

	@Override
	public double cost() {
		return 2.9;
	}
	
	

}
