package com.dynamic.addition.of.resp.decorator;

import com.dynamic.addition.of.resp.base.Espresso;

/**
 * Concrete Decorator class
 */
public class MilkDecorator extends CoffeeDecorator{

	public MilkDecorator(Espresso espresso) {
		super(espresso);
	}


	@Override
	public String getDescription() {
		return super.getDescription()+ " and Milk ";
	}

	@Override
	public double cost() {
		return super.cost() + 1.0;
	}
	
}
