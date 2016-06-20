package com.sorting;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] a = {1,45,65,2,98,34};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 45));
	}
}
