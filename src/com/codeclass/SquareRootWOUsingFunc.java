package com.codeclass;

public class SquareRootWOUsingFunc {

	public static void main(String[] args) {
		
		int n = 12;
		double temp,sqrtRoot;
		sqrtRoot = n/2;
		
		do {
			 temp = sqrtRoot;
			 sqrtRoot = (temp+(n/temp))/2;
		}while((temp-sqrtRoot) != 0);
		
		System.out.println("Square root is : "+sqrtRoot);
	}

}
