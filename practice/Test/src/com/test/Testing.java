package com.test;

import java.util.Arrays;

public class Testing {

	public static void main(String[] args) {
		int arr[] = { 3, 2, 1, 5, 6, 8, 9, 7 };
		Arrays.sort(arr);
		System.out.println("the second largest element in the arrays is" + arr[arr.length - 2]);
	}
}
