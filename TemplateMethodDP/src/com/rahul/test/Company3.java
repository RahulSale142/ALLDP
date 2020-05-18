package com.rahul.test;

import com.rahul.factory.FresherFactory;
import com.rahul.recruitment.Fresher;

public class Company3 {

	public static void main(String[] args) {
		Fresher fresher = null;
		fresher = FresherFactory.getInstance("php");
		fresher.fresherRecruitmentDrive();

	}

}
