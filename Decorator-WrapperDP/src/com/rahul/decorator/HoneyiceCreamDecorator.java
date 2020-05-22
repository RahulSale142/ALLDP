package com.rahul.decorator;

import com.rahul.component.Icecream;

public class HoneyiceCreamDecorator extends IcecreamDecorator {

	public HoneyiceCreamDecorator(Icecream icecream) {
		super(icecream);
	}
	
	private void addHoney() {
		System.out.println("Adding honey");
	}
	
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		super.prepare();
		addHoney();
	}

}
