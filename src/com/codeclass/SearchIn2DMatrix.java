package com.codeclass;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		
		 int mat[][] = { { 10, 20, 30, 40 },
                 { 15, 25, 35, 45 },
                 { 27, 29, 37, 48 },
                 { 32, 33, 39, 50 } };
		 
		 int target = 35;
		 int n = mat.length;
		 
		 int i = 0;
		 int j = n-1;
		 
		 while(i < n && j >= 0) {
			 if(mat[i][j] == target) {
				 System.out.println("Element found at position "+i+","+j);
				 break;
			 }
			 else if(mat[i][j] > target) {
				 j--;
			 }
			 else {
				 i++;
			 }
		 }

	}

}
