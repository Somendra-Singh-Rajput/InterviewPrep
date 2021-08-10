package com.codeclass;

public class ReverseStringInPlace {

	public static void main(String[] args) {
		
		String s = "SOMENDRA SINGH";
		int n = s.length();
		StringBuilder sb = new StringBuilder(s);
		
		int lastIndex = 0;
		
		for(int i=0;i<n/2;i++) {
			
			char current = s.charAt(i);
			lastIndex = n-i-1;
			sb.setCharAt(i, sb.charAt(lastIndex));
			sb.setCharAt(lastIndex, current);
			
		}
		
		System.out.println(sb.toString());
	}

}
