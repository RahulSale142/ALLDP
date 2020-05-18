package com.rahul.recruitment;

public class JavaFresher extends Fresher {

	@Override
	public boolean conductTechnicalInterview() {
		System.out.println("JavaFresher.conduct JAVA TechnicalInterview()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("JavaFresher.conduct JAVA SystemTest()");
		return true;
	}

}
