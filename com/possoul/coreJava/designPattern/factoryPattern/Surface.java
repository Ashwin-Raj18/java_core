package com.possoul.coreJava.designPattern.factoryPattern;

public class Surface extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Surface(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}
