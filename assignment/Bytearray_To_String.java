package com.assignment;

import java.util.Arrays;

public class Bytearray_To_String {

	public static void main(String[] args) {
		
		String s= "mobile programming";
		
		byte[] ss = s.getBytes();
	
		String value = Arrays.toString(ss);
		
		System.out.println(value);
		
		String str = new String(ss);

		System.out.println(str);
		

		
	}

}
