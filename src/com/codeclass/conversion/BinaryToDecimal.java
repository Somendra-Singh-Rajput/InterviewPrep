package com.codeclass.conversion;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		//Method-1
		int num = 110101;
		String num1 = String.valueOf(num);
		int decimal = 0,n=0;
		
		while(num > 0) {
			
			int res = num%10;
			decimal += res*Math.pow(2, n);
			num = num/10;
			n++;
			
		}
		
		System.out.println("-----------:Method-1:--------------");
		System.out.println(decimal);
		
		//Method-2
		System.out.println("-----------:Method-2:--------------");		
		System.out.println(Integer.parseInt(num1,2));

	}

}
