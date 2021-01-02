package com.possoul.coreJava.designPattern.factoryPattern;


public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		
		if("MacBook".equalsIgnoreCase(type)) return new MacBook(ram, hdd, cpu);
		else if("Surface".equalsIgnoreCase(type)) return new Surface(ram, hdd, cpu);
		
		return null;
	}
}