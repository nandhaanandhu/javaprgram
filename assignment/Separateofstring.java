package com.assignment;

public class Separateofstring {
	public static void strings(String str) {
		StringBuffer a = new StringBuffer(), 
				num = new StringBuffer(),
				spc = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				num.append(str.charAt(i));
			else if (Character.isAlphabetic(str.charAt(i)))
				a.append(str.charAt(i));
			else
				spc.append(str.charAt(i));
		}
		System.out.println(a);
		System.out.println(num);
		System.out.println(spc);
	}

	public static void main(String[] args) {
		String str = "frt23$yt(e#2)re";
		strings(str);
	}
}
