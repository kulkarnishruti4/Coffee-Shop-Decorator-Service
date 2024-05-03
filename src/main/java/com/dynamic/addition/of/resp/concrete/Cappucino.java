package com.dynamic.addition.of.resp.concrete;

import com.dynamic.addition.of.resp.base.Espresso;

/**
 * This class is a type of drink made from Espresso. 
 * Its a derived class called Capuccino
 * 
 */
public class Cappucino implements Espresso{
	

	@Override
	public String getDescription() {
		return "This is a cappucino which is made of double shot espresso ";
	}

	@Override
	public double cost() {
		return 3;
	}

}
