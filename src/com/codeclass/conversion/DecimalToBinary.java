package com.codeclass.conversion;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int num = 49;
		int[] binary = new int[49];
		
		int index=0;
		
		while(num > 0) {
			int res = num%2;
			binary[index] = res;
			num = num/2;
			index++;
		}
		
		for(int i=index-1;i>=0;i--) {
			
			System.out.print(binary[i]);
		}

	}

}
