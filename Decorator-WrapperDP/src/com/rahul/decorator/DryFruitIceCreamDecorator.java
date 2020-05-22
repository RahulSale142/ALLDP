package com.rahul.decorator;

import com.rahul.component.Icecream;

public class DryFruitIceCreamDecorator extends IcecreamDecorator {

	public DryFruitIceCreamDecorator(Icecream icecream) {
		super(icecream);
	}
	
	private void addDryFruit() {
		System.out.println("Adding DryFruit");
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.prepare();
		addDryFruit();
	}

}
