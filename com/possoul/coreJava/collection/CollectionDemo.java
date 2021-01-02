package com.possoul.coreJava.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class CollectionDemo {

	public static void main(String[] args) {
		List<String> val = new ArrayList();
		val.add("rampa");
		val.add("ashwin");
		val.add("zoya");
		
		
		Collections.sort(val,Collections.reverseOrder());
		
		for(Object c : val) {
			System.out.println(c);
		}
	}

}
