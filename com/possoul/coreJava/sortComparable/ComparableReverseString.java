package com.possoul.coreJava.sortComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//using Comparable 
public class ComparableReverseString {

	public static void main(String[] args) {
		List<Student3> std = new ArrayList<>();
		
		std.add(new Student3(1,66,"Ashwin"));
		std.add(new Student3(2,43,"bejataya"));
		std.add(new Student3(3,49,"camoji"));
		std.add(new Student3(4,65,"damanthar"));
		std.add(new Student3(5,78,"eacky"));
		
		Collections.sort(std);  //by default it expects comparable, same as TreeSet constructor
				                //object must implement comparable
		std.forEach(System.out::println);
		
		}
	}
		
		 class Student3 implements Comparable<Student3> {
			
			int marks;
			int id;
			String name;
			
			public Student3(int id, int marks, String name) {
			
				this.marks = marks;
				this.id = id;
				this.name = name;
			}
			
			@Override
			public String toString() {
				return "Student [marks=" + marks + ", id=" + id + ", name=" + name + "]";
			}

			@Override
			public int compareTo(Student3 o) {
				
				return -this.name.compareTo(o.name);    //string impl of compareTo
			}	

		}
	

