package com.possoul.coreJava.collection;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {
		
		
		String str = "(4584) | (7845) | (8754) | (1254) | (4588)";      
	    String[] str2 = str.replaceAll("[^-?0-9]+", " ").trim().split(" "); 
	    
	    
	    
	    for(String a : str2) {
			System.out.println(a);
			
			}

	}

}
