package com.codeclass;

public class RemoveLeadingZeros {

	public static void main(String[] args) {

		String s = "0000012345";

		int i = 0;
		while(i < s.length() && s.charAt(i) == '0') {
			i++;

		}

		StringBuffer sb = new StringBuffer(s);

		sb.replace(0, i, "");

		System.out.println(sb.toString());
	}

}
