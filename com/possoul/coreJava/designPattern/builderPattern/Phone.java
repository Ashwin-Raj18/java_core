package com.possoul.coreJava.designPattern.builderPattern;

public class Phone {
	private String os;
	private int ram;
	private double screenSize;
	private String processor;
	private String battery;
	public Phone(String os, int ram, double screenSize, String processor, String battery) {
		super();
		this.os = os;
		this.ram = ram;
		this.screenSize = screenSize;
		this.processor = processor;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", screenSize=" + screenSize + ", processor=" + processor
				+ ", battery=" + battery + "]";
	}
	
}
