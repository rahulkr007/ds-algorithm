package com.rk.algorithm;

public class SortBinaryArray {
	static void sortArray(int[] arr) {
		int zeroCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 1;
				zeroCount++;
			}
		}
		for (int i = 0; i <= zeroCount; i++) {
			arr[i] = 0;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 0, 1, 0, 0, 1 };
		sort2(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void sort2(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i == 0) {
				arr[count++] = 0;
			}
		}
		for (int j = count; j < arr.length; j++) {
			arr[j] = 1;
		}
	}

}
