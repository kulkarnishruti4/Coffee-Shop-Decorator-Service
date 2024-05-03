package com.dynamic.addition.of.resp.decorator;

import com.dynamic.addition.of.resp.base.Espresso;

/**
 *  Decorator class
 */
public class CoffeeDecorator implements Espresso{
	
	protected Espresso espresso;
	
	public CoffeeDecorator(Espresso espresso) {
		
		this.espresso = espresso;
		
	}

	@Override
	public String getDescription() {
		return espresso.getDescription();
	}

	@Override
	public double cost() {
		return espresso.cost();
	}

}
