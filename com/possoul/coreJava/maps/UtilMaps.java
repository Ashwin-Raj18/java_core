package com.possoul.coreJava.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class UtilMaps {
	public static void main(String[] args) {
		
	Map<String, String> auto = new HashMap<String, String>();
	
	auto.put("ktm", "duke");
	auto.put("ducati", "multistarda");
	auto.put("truimh", "tiger");
	auto.put("Harlay", "FatBoy");

	System.out.println("duke exists  :"+auto.containsValue("duke"));
	
	
	System.out.println("Method 1:-----------using entrySet-----------------");
	
	for (Map.Entry<String,String> entry : auto.entrySet())  
        System.out.println("Key = " + entry.getKey() + 
                         ", Value = " + entry.getValue());

	
	
	System.out.println("Method 2:-----------using keyset-----------------");
	
	Set<String> keys = auto.keySet();
	for(String key : keys) {
		System.out.println(key +" "+auto.get(key));
	}
	
	System.out.println("Method 3:-----------using for each action-----------------");
	
	auto.forEach((k,v) -> System.out.println("Key = "
            + k + ", Value = " + v)); 
	
	
	
	}
}
