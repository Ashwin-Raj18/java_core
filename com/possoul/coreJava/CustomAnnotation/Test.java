package com.possoul.coreJava.CustomAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class Test {

	
		@AuthorInfo(expirydate = "10-10-2025")
		public void myMethod1() {
			System.out.println("myMethod1....");
		}

		@AuthorInfo(developerName = "Kumar", expirydate = "10-10-2022")
		public void myMethod2() {
			System.out.println("myMethod2....");
		}

		public static void main(String args[]) throws NoSuchMethodException, SecurityException {
			System.out.println("Welcome to annoatation world!!!");
			
			Method method = new Test().getClass().getMethod("myMethod1");
			Method method2 = new Test().getClass().getMethod("myMethod2");
			Annotation annotation = method.getAnnotation(AuthorInfo.class);
			Annotation annotation2 = method2.getAnnotation(AuthorInfo.class);
			
			System.out.println("method1 :"+((AuthorInfo) annotation).developerName()+"\t"+((AuthorInfo) annotation).expirydate());
			System.out.println("method2 :"+((AuthorInfo) annotation2).developerName()+"\t"+((AuthorInfo) annotation2).expirydate());
		}
}
