package com.codeclass.conversion;

public class OctalToBinary {

	public static void main(String[] args) {
		
		int num = 61;
		
		int decimal=0,n=0;
		
		while(num > 0) {
			
			int res = num%10;
			decimal += res*Math.pow(8, n);
			num = num/10;
			n++;
		}
		
		System.out.println(decimal);
		
		int[] binary = new int[100];
		int index=0;
		
		while(decimal > 0) {
			
			int res = decimal%2;
			binary[index] = res;
			decimal = decimal/2;
			index++;
		}
		
		for(int i=index-1;i>=0;i--) {
			
			System.out.print(binary[i]);
		}

	}

}
