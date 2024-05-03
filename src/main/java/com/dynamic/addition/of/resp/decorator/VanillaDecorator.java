package com.dynamic.addition.of.resp.decorator;

import com.dynamic.addition.of.resp.base.Espresso;

/**
 * Concrete Decorator class
 */
public class VanillaDecorator extends CoffeeDecorator{

	public VanillaDecorator(Espresso espresso) {
		super(espresso);
	}
	
	
	@Override
	public String getDescription() {
		return super.getDescription()+ " and vanilla ";
	}

	@Override
	public double cost() {
		return super.cost() + 0.5;
	}
	

}
