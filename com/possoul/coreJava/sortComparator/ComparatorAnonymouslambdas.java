package com.possoul.coreJava.sortComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class ComparatorAnonymouslambdas {
	public static void main(String[] args) {
		List<StudentL> std = new ArrayList<>();
		
		std.add(new StudentL(1,66,20,"Ashwin"));
		std.add(new StudentL(2,43,21,"kripal"));
		std.add(new StudentL(3,49,19,"battu"));
		std.add(new StudentL(4,65,20,"Maari"));
		std.add(new StudentL(5,78,23,"thanos"));
		
		
		
		//sorting in reverse order of marks
		Collections.sort(std,(s1,s2)->{
			return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;              
		});
		
		System.out.println("based on marks dec");
		std.forEach(System.out::println);
		
		//sorting based on age
		Collections.sort(std,(s1,s2)->{
			return s1.age<s2.age?-1:s1.marks>s2.marks?1:0;
		});
		
		System.out.println("based on age asc");
		std.forEach(System.out::println);
		
		
	}
}
		
		 class StudentL {
			
			int id;
			int marks;
			int age;
			String name;
			
			public StudentL(int id, int marks, int age, String name) {
			
				this.marks = marks;
				this.id = id;
				this.age = age;
				this.name = name;
			}

			@Override
			public String toString() {
				return "StudentL [id=" + id + ", marks=" + marks + ", age=" + age + ", name=" + name + "]";
			}

		}
		 
		 

