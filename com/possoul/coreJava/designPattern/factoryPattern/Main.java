package com.possoul.coreJava.designPattern.factoryPattern;

public class Main {
	public static void main(String[] args) {
		
		Computer mac = ComputerFactory.getComputer("MacBook","32 GB","2TB","Intel Core i9");
		
		Computer surface = ComputerFactory.getComputer("Surface","8 GB","128 GB","Intel Core i5");
		
		System.out.println("Factory MacBook Config::"+mac);
		System.out.println("Factory Surface Config::"+surface);
	}
}
