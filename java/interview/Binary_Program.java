package com.java.interview;

public class Binary_Program {
	static int length;
	 public static void printArray(int[] arr) {
	 for (int i = 0; i < length; i++) {
	 System.out.print(arr[i] + " ");
	 }
	 System.out.println();
	 }
	 public static void arrayAsc(int[] arr) {
	 int temp = 0;
	 for (int i = 0; i < length; i++) {
	 for (int j = i + 1; j < length; j++) {
	 if (arr[i] > arr[j]) {
	 temp = arr[i];
	 arr[i] = arr[j];
	 arr[j] = temp;
	 }
	 }
	 }
	 System.out.print("Output: ");
	 printArray(arr);
	 }
	 public static void main(String[] args) {
	 int arr[] = new int[] { 1, 0, 1, 1, 1, 1, 0, 0, 1, 1,0,0};
	 length = arr.length;
	 System.out.print("Input : ");
	 printArray(arr);
	 arrayAsc(arr);
	 }
	 
}
