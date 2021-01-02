package com.possoul.coreJava.sortComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//using Comparable 
public class SortCollectionComparable {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		
		std.add(new Student(1,66));
		std.add(new Student(2,43));
		std.add(new Student(3,49));
		std.add(new Student(4,65));
		std.add(new Student(5,78));
		
		Collections.sort(std);   
		
		
		std.forEach(System.out::println);
		
		}
	}
		
		 class Student implements Comparable<Student> {
			
			int marks;
			int id;
			
			public Student(int id, int marks) {
			
				this.marks = marks;
				this.id = id;
			}
			@Override
			public String toString() {
				return "Student [marks=" + marks + ", id=" + id + "]";
			}
			@Override
			public int compareTo(Student o) {
				
				return this.marks>o.marks?-1:this.marks<o.marks?1:0;  //desc
			}
			 
			

		}

