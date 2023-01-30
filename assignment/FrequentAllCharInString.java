package com.assignment;

public class FrequentAllCharInString {

	public static void main(String[] args) {
String s="nandha panneerselvam";
int count;
char ss[]=s.toCharArray();
for(int i=0;i<ss.length;i++) {
	count=1;
	for(int j=i+1;j<ss.length;j++) {
		if(ss[i]==ss[j]&& ss[i]!='0') {
			count ++;
			ss[j]='0';
		}
	}
	if(count >1 && ss[i]!='0')
		System.out.println(ss[i]);
}
	}

}
