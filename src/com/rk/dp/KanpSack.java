package com.rk.dp;

public class KanpSack {
	public static void main(String[] args) {
		int[] weights = { 1, 3, 4, 6 };
		int[] price = { 20, 30, 10, 50 };
		int capacity = 10;
		int n = weights.length;
		System.out.println(solution1(price, weights, capacity, n, 0));
		System.out.println(usingDp(capacity, weights, price, n));
	}

	private static int max(int a, int b) {
		return a > b ? a : b;
	}

	private static int solution1(int[] price, int[] weights, int capacity, int n, int index) {
		if (index == n || capacity == 0)
			return 0;
		if (weights[index] > capacity) {
			return solution1(price, weights, capacity, n, index + 1);
		} else {
			return max(price[index] + solution1(price, weights, capacity - weights[index], n, index + 1),
					solution1(price, weights, capacity, n, index + 1));
		}
	}

	private static int usingDp(int capacity, int[] weight, int[] price, int n) {
		int[][] container = new int[n + 1][capacity + 1];

		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < capacity + 1; j++) {
				if (i == 0 || j == 0) {
					container[i][j] = 0;
				} else if (j >= weight[i - 1]) {
					container[i][j] = max(price[i - 1] + container[i - 1][j - weight[i - 1]], container[i - 1][j]);
				} else {
					container[i][j] = container[i - 1][j];
				}
			}
		}
		return container[n][capacity];

	}
}
