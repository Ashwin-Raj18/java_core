package com.possoul.coreJava.genericClass;

public class Box<T,P> {
	   private T t;
	   private P p;

	   public void addT(T t) {
	      this.t = t;
	   }

	   public T getT() {
	      return t;
	   }
	   public void add(P p) {
		      this.p = p;
		   }

	   public P get() {
		      return p;
	   }
	   public static void main(String[] args) {
	      Box<Integer, String> integerBox = new Box<Integer, String>();
	      Box<String, Integer> stringBox = new Box<String, Integer>();
	      Integer i = Integer.valueOf(1);
	      integerBox.addT(i);
	      stringBox.addT(new String("Hello World"));
	      
	      integerBox.add(new String("Hello World"));
	      stringBox.add(i);

	      System.out.printf("Integer Value :%d\n\n", integerBox.getT());
	      System.out.printf("String Value :%s\n", stringBox.getT());
	   }
	}
