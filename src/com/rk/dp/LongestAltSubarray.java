package com.rk.dp;

public class LongestAltSubarray {
	public static void main(String[] args) {
		int[] x = { 1, -2, 6, 4, -3, 2, -4, -3 };
		System.out.println(maxSubArray(x));
	}

	private static int maxSubArray(int[] x) {
		int maxArray = 1;
		int globalMax = 0;
		boolean isPositive = x[0] > 0 ? true : false;
		for (int i = 1; i < x.length; i++) {
			if ((isPositive && x[i] < 0) || (!isPositive && x[i] > 0)) {
				maxArray++;
			} else {
				maxArray = 1;
			}
			isPositive = x[i] > 0 ? true : false;
			globalMax = maxArray > globalMax ? maxArray : globalMax;
		}
		return globalMax;
	}
	
	private static void longestSubArray(int[] a) {
		int maxLen = 1;
		int endIndex =0;
		int currLen = 1;
		
	}
}
