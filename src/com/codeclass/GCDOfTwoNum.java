package com.codeclass;

public class GCDOfTwoNum {

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 90;
		
		System.out.println(GCD(num1,num2));

	}
	
	public static int GCD(int num1, int num2) {
		
		if(num2 == 0) return num1;
		
		return GCD(num2, num1%num2);
	}

}
