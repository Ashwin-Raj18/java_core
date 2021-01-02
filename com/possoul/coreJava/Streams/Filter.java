package com.possoul.coreJava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


public class Filter {
	public static void main(String[] args) {
		
		List<String> nameList  = Arrays.asList("mango", "apple", "banana", "chiku");
		nameList.stream().filter(name -> !name.equals("apple"))
						 .map(User::new)                         //map((name)-> return new User(name))
						 .forEach(System.out::println);
		
		List<User> userList = nameList.stream().filter(name -> !name.equals("apple"))
											   .map(t -> new User(t))
											   .collect(Collectors.toList());
		
		System.out.println("2nd stream "+userList);
	
		int ageSum = userList.stream()
				 			  .mapToInt(User::getAge).sum();
		 
		System.out.println("sum of ages of all users is "+ageSum+" thread name is");   
	}	
}


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
class User{
	private int userId;
	private String name;
	private int age =30;
	private String phoneNumbers;
	public User(String name) {
		super();
		this.name = name;
	}
}