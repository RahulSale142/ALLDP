package com.rahul.recruitment;

public abstract class Fresher {
	private boolean conductAptitudeTest() {
		System.out.println("Fresher.conductAptitudeTest()");
		return true;
	}
	
	private boolean conductGDTest() {
		System.out.println("Fresher.conductGDTest()");
		return true;
	}
	
	public abstract boolean conductTechnicalInterview();
	 
	public abstract boolean conductSystemTest();
	
	private boolean conductHRInterview() {
		System.out.println("Fresher.conductHRInterview()");
		return true;
	}
	
	//template method
	
	public boolean fresherRecruitmentDrive() {
		boolean flag = false;
		flag = conductAptitudeTest();
		if(flag) {
			flag = conductGDTest();
		} 
		
		if(flag) {
			flag = conductTechnicalInterview();
		}
		
		if(flag) {
			flag = conductSystemTest();
		}
		
		if(flag) {
			flag = conductHRInterview();
		}
		
		return flag;
	}

}
