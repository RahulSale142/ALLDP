package com.rahul.decorator;

import com.rahul.component.Icecream;

public class ChocolateIceCreamDecorator extends IcecreamDecorator {

	public ChocolateIceCreamDecorator(Icecream icecream) {
		super(icecream);
	}
	
	private void addChocolate() {
		System.out.println("Adding Chocolate");
	}
	
	@Override
	public void prepare() {
		super.prepare();
		addChocolate();
	}

}
