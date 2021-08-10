package com.codeclass;

public class StringPermutation {

	public static void main(String[] args) {
		
		String s = "ABC";
	
		int n = s.length();
		
		permute(s,0,n-1);
	}

	private static void permute(String s, int b, int e) {
		
		if(b == e) {
			System.out.println(s);
		}	
		else {
			
			for(int i = b;i<=e;i++) {			
				s = swap(s,b,i);
				permute(s,b+1,e);
				s = swap(s,b,i);	
			}
		}
		
	}

	private static String swap(String s, int b, int e) {
		
		char[] arr = s.toCharArray();
		
		char  temp = arr[b];
		arr[b] = arr[e];
		arr[e] = temp;
		
		return String.valueOf(arr);
	}
	
	

}
