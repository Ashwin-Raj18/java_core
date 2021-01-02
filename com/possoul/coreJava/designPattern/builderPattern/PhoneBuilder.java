package com.possoul.coreJava.designPattern.builderPattern;

public class PhoneBuilder {
	private String os;
	private int ram;
	private double screenSize;
	private String processor;
	private String battery;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(String battery) {
		this.battery = battery;
		return this;
	}
	//return the object which u want to build
	public Phone getPhone() {
		return new Phone(os, ram, screenSize, processor, battery);
	}
	
}
