package com.rahul.test;

import com.rahul.component.BlackCurrentIceCream;
import com.rahul.component.Icecream;
import com.rahul.component.VanilaIceCream;
import com.rahul.decorator.ChocolateIceCreamDecorator;
import com.rahul.decorator.DryFruitIceCreamDecorator;
import com.rahul.decorator.HoneyiceCreamDecorator;

public class Customer1 {

	public static void main(String[] args) {
		Icecream cream1 = null;
		cream1 = new VanilaIceCream();
		cream1.prepare();
	}

}
