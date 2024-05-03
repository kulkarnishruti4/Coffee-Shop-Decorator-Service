package com.dynamic.addition.of.resp.main;

import com.dynamic.addition.of.resp.base.Espresso;
import com.dynamic.addition.of.resp.concrete.Cappucino;
import com.dynamic.addition.of.resp.concrete.HouseBlendCoffee;
import com.dynamic.addition.of.resp.concrete.VanillaLatte;
import com.dynamic.addition.of.resp.decorator.MilkDecorator;
import com.dynamic.addition.of.resp.decorator.VanillaDecorator;
import com.dynamic.addition.of.resp.decorator.WhippedCreamDecorator;

/**
 * @author shrutikulkarni
 * 
 * This Application is built on Decorator Pattern. We have an espresso interface which is basic building block of a coffee.
 * We have concrete classes and decorators to create a number of combination of beverages. 
 * 
 * When application grows, new decorators and beverages will be added without having to make any change in the existingcode.
 * 
 * A beverage can be made by just using decorators as well without having to add a named beverage class.
 * 
 */
public class CoffeeShopApplication {

	
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to our coffee shop!");
		
		//Ordering Cappucino
		
		Espresso espressoWithMilk = new MilkDecorator(new Cappucino());
		
		System.out.println("Order for Cappucino : " + espressoWithMilk.getDescription());
		System.out.println("Price : " + espressoWithMilk.cost());
		
		
		//Ordering a House Blend Coffee
		
		Espresso houseBlendCoffee = new MilkDecorator(new WhippedCreamDecorator(new HouseBlendCoffee()));
		
		System.out.println("Order for House Blend : " +  houseBlendCoffee.getDescription());
		System.out.println("Price : " + houseBlendCoffee.cost());
		
		
		//Ordering a vanilla Latte
		
		Espresso vanillaLatte = new MilkDecorator(new WhippedCreamDecorator(new VanillaDecorator(new VanillaLatte())));
		
		System.out.println("Order for House Blend : " +  vanillaLatte.getDescription());
		System.out.println("Price : " + vanillaLatte.cost());
		
	}
}
