package com.dynamic.addition.of.resp.decorator;

import com.dynamic.addition.of.resp.base.Espresso;

/**
 * Concrete Decorator class
 */
public class WhippedCreamDecorator extends CoffeeDecorator{

	public WhippedCreamDecorator(Espresso espresso) {
		super(espresso);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String getDescription() {
		return super.getDescription()+ " and whipped cream ";
	}

	@Override
	public double cost() {
		return super.cost() + 1.5;
	}
}
