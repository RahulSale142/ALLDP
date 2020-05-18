package com.rahul.factory;

import com.rahul.recruitment.DotNetFresher;
import com.rahul.recruitment.Fresher;
import com.rahul.recruitment.JavaFresher;
import com.rahul.recruitment.PHPFresher;

public class FresherFactory {
	
	public static Fresher getInstance(String fresherType) {
		Fresher fresher = null;
		if(fresherType.equalsIgnoreCase("java")) {
			fresher = new JavaFresher();
		} else if(fresherType.equalsIgnoreCase("dotnet")) {
			fresher = new DotNetFresher();
		} else if(fresherType.equalsIgnoreCase("php")) {
			fresher = new PHPFresher();
		} else 
			throw new IllegalArgumentException("Invalid fresher type");
		
		return fresher;
	}
	

}
