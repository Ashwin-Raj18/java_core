package com.possoul.coreJava.designPattern.builderPattern;

public class Main {
	
	public static void main(String[] args) {
		
		Phone phone = new PhoneBuilder().setOs("Oxygen").setProcessor("SD 885").setBattery("5000 mAh").getPhone();
		
		Phone phone2 = new PhoneBuilder().setOs("ios").setProcessor("A11").getPhone(); //end should be getPhone()
		
		System.out.println(phone);
		System.out.println(phone2);
	}
}
