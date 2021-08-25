package com.rk.algorithm;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 3, 4, 12, 4, 32, 54, 2 };
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sortArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	void sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
