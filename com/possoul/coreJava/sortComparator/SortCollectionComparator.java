package com.possoul.coreJava.sortComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// sorting collections using Comparator interface and lambdas
public class SortCollectionComparator {
	
	public static void main(String[] args) {
	List<Student> std = new ArrayList<>();
	
	std.add(new Student(1,66));
	std.add(new Student(2,43));
	std.add(new Student(3,49));
	std.add(new Student(4,65));
	std.add(new Student(5,78));
	
	System.out.println("2nd   :"+std.get(2));
		
	TheComparator com = new TheComparator();           
	Collections.sort(std,com);	                     //2nd arg must impl comparator 
	System.out.println("2nd   :"+std.get(2));
                                                
	std.forEach(System.out::println);
	
	}
}
	
	 class Student  {		
		int id;
		int marks;
		
		public Student() {
			super();
		}

		public Student(int id, int marks) {
		
			this.marks = marks;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", marks=" + marks + "]";
		}

	}
	class TheComparator implements Comparator<Student>{
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.marks>o2.marks) {
				return -1;
			}
			else if (o1.marks<o2.marks) {
				return 1;
				
			} else {
				return 0;
			}
		}
	}