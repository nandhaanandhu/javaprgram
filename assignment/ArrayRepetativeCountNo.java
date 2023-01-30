package com.assignment;

import java.util.Arrays;

public class ArrayRepetativeCountNo {
	public static void countfre(int arr[], int n)
	{
		boolean visited[] = new boolean[n];

		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {

			if (visited[i] == true)
				continue;

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;

				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 1, 2, 5, 4, 3, 1, 6, 2, 5, 3, 1, 2, 4, 1, 5, 9, 8, 7, 8, 7, 9, 6, 3, 2 };
		int n = arr.length;
		countfre(arr, n);
	}
}
