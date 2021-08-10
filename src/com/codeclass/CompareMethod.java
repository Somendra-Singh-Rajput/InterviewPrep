package com.codeclass;

public class CompareMethod {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println(Integer.compare(a, b));
		
		a = 20;
		b = 10;
		
		System.out.println(Integer.compare(a, b));
		
		a = 10;
		b = 10;
		
		System.out.println(Integer.compare(a, b));

	}

}
