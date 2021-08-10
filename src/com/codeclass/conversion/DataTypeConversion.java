package com.codeclass.conversion;

public class DataTypeConversion {

	public static void main(String[] args) {
		
		boolean b = true;
		
		String s = Boolean.toString(b);
		System.out.println("Boolean to sting : "+s);
		
		String s1 = "10";		
		double d = Double.parseDouble(s1);
		System.out.println("String to double : "+d);
		
		double d1 = 20.5;
		String s2 = Double.toString(d1);
		System.out.println("Double to string : "+s2);
		
		String s3 = "11";
		long l = Long.parseLong(s3);
		System.out.println("String to long : "+l);
		
		long l1 = 12;
		String s4 = Long.toString(l1);
		System.out.println("Long to string : "+s4);
		
		char c = '3';
		int i = c - '0';
		System.out.println("Char to int : "+i);
		

	}

}
