package com.codeclass.pattern;

public class ReverseStarPyramid {

	public static void main(String[] args) {
		
		int num = 7;
		
		for(int i=num;i>=0;i--) {
			
			for(int j=i;j<num;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
