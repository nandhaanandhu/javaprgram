package com.java.interview;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 2, 7 };
		 
		
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int temp = 0;
		
		for(int i=0;i<arr.length;i++)
		{
		for(int j=i+1;j<arr.length;j++) {
			 
		if(arr[i]>arr[j]) {
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}


	System.out.print(arr[i]+" ");

}
	}
}