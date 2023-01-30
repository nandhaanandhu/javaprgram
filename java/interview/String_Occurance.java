package com.java.interview;

public class String_Occurance {
	
public static int occurance(String s,char c) {
int res =0;


for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==c)
		res++;
}
return res;
}

public static void main(String[] args) {
	String s="abaade";
	char c='a';
	System.out.println(occurance(s, c));
}
}
