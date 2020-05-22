package com.rahul.test;

import com.rahul.component.BlackCurrentIceCream;
import com.rahul.component.ButterScotchIceCream;
import com.rahul.component.Icecream;
import com.rahul.component.VanilaIceCream;
import com.rahul.decorator.ChocolateIceCreamDecorator;
import com.rahul.decorator.DryFruitIceCreamDecorator;
import com.rahul.decorator.HoneyiceCreamDecorator;

public class Customer3 {

	public static void main(String[] args) {
		Icecream cream1 = null;
		cream1 = new DryFruitIceCreamDecorator(new HoneyiceCreamDecorator(new ButterScotchIceCream()));
		cream1.prepare();
	}

}
