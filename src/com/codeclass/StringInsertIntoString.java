package com.codeclass;

public class StringInsertIntoString {

	public static void main(String[] args) {
		
		String s = "Somendra Rajput";
		String s1 = "Singh";
		int k = 8;
		
		String str = new String();
		
		for(int i = 0; i < s.length();i++) {
			
			str = str+s.charAt(i);
			
			if(i == k) {
				str = str + s1 + " ";
			}
		}
		
		System.out.println(str);

	}

}
