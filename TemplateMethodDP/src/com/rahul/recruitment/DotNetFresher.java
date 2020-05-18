package com.rahul.recruitment;

public class DotNetFresher extends Fresher {

	@Override
	public boolean conductTechnicalInterview() {
		System.out.println("DotNetFresher.conduct DotNet TechnicalInterview()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("DotNetFresher.conduct DotNet SystemTest()");
		return true;
	}

}
