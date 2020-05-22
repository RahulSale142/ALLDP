package com.rahul.decorator;

import com.rahul.component.Icecream;

public class IcecreamDecorator implements Icecream {

	private Icecream icecream;
	
	public IcecreamDecorator(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public void prepare() {
		icecream.prepare();
	}

}
