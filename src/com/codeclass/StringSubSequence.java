package com.codeclass;

public class StringSubSequence {

	public static void main(String[] args) {
		
		String s1 = "Somendra";
		String s2 = "mda";
		boolean flag =false;
		
		int j = 0;
		
		for(int i=0;i<s1.length();i++) {
			
			if(s2.charAt(j) == s1.charAt(i)) {
				++j;
			}
			
			if(s2.length() == j) {
				flag = true;
				 break;
			}
		}
		
		if(flag == true) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
