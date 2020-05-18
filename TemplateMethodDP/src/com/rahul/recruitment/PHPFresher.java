package com.rahul.recruitment;

public class PHPFresher extends Fresher {

	@Override
	public boolean conductTechnicalInterview() {
		System.out.println("PHPFresher.conduct PHP TechnicalInterview()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("PHPFresher.conduct PHP SystemTest()");
		return true;
	}

}
