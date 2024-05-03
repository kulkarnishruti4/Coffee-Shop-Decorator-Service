package com.dynamic.addition.of.resp.concrete;

import com.dynamic.addition.of.resp.base.Espresso;

/**
 * This class is a type of drink made from Espresso. 
 * Its a derived class called HouseBlendCoffee
 * 
 */
public class HouseBlendCoffee implements Espresso{

	@Override
	public String getDescription() {
		return "This is a House Blend Coffee which contains one shot of espresso ";
	}

	@Override
	public double cost() {
		return 2.5;
	}
	
	

}
