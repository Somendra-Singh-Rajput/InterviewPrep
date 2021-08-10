package com.codeclass.string;

public class UpperToLowerAndViceVersa {

	public static void main(String[] args) {
		
		String s = "Somendra Singh";
		int n = s.length();
		
		for(int i=0;i<n;i++) {
			
			int ch = s.charAt(i);
			
			if(ch > 64 && ch < 91) {
				
				ch = ch+32;
				System.out.print((char)ch);
			}else if(ch > 91 && ch < 123) {
				ch = ch-32;
				System.out.print((char)ch);
			}else {
				System.out.print((char)ch);
			}
		}

	}

}
