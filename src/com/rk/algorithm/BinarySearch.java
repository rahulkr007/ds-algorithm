package com.rk.algorithm;

public class BinarySearch {
	public static void main(String[] args) {
		int[] array = { 3, 5, 8, 10, 14, 18, 23, 25, 35, 37, 58 };
		int n = array.length;
		int x = 58;
		BinarySearch obj = new BinarySearch();
		int result = obj.binarySearch(array, 0, n - 1, x);
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index : " + result);
		}
	}

	private int binarySearch(int[] arr, int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			if (arr[mid] > x) {
				return binarySearch(arr, l, mid - 1, x);
			} else {
				return binarySearch(arr, mid + 1, r, x);
			}
		}
		return -1;
	}

}
