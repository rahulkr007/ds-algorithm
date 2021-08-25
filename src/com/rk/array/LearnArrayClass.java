package com.rk.array;

import java.util.Arrays;

public class LearnArrayClass {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int index = Arrays.binarySearch(numbers,4);
		System.out.println(index);
		Arrays.sort(numbers);
		Arrays.fill(numbers, 12);
		System.out.println(numbers[0]);

	}

}
