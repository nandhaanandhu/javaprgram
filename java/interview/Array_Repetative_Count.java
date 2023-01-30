package com.java.interview;

import java.util.Arrays;

public class Array_Repetative_Count {
	   
	public static void main(String[] args) {
		
		 int arr[] = { 2,1,3,4,6,5,4,7,5,6,8,2,3,6,2,6,4,4,7,3,4,5,6 };
		    
 boolean visited[] = new boolean[arr.length];
	     
//	    Arrays.fill(visited, false);
	 
	    for (int i = 0; i < arr.length; i++) {
	 
	        if (visited[i] == true)
	            continue;
	 
	        int count = 1;
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                visited[j] = true;
	                count++;
	            }
	        }
	        System.out.println(arr[i] + " " + count);
	    }
	}
	}


