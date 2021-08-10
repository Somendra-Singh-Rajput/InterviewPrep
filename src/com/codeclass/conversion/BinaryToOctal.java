package com.codeclass.conversion;

public class BinaryToOctal {

	public static void main(String[] args) {
		
		//Method-1
		int num = 110001;
		int decimal=0,octal = 0,n=0;
		
		while(num > 0) {
			
			int res = num%10;
			decimal += res*Math.pow(2, n);
			num = num/10;
			n++;
		}
		
		int temp = decimal;
		int m=0;
		while(decimal != 0) {
			
			int res = decimal%8;
			octal += res*Math.pow(10, m);
			decimal = decimal/8;
			m++;
		}
		
		System.out.println("------------:Method-1:-------------");
		System.out.println(octal);

		System.out.println("------------:Method-2:-------------");
		System.out.println(Integer.toOctalString(temp));
		
	}

}
