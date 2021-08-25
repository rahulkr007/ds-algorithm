package com.rk.dp;

import java.util.Arrays;
import java.util.Collections;

public class FindMaxProfit {

	public static void main(String[] args) {
		int[][] a = { { 5, 8 }, { 3, 4 }, { 4, 3 }, { 6, 5 }, { 3, 10 } };
		int[] x = { 5, 3, 4, 6, 3 };
		int[] y = { 8, 4, 3, 5, 10 };
//		System.out.println(MaxProfit(a, true, 0));
//		System.out.println(topDown(x, y, x.length - 1));
//		System.out.println(useDP(x, y));
		System.out.println(lastTwo(x, y));

	}

	static int MaxProfit(int[][] a, boolean secondStockCanSold, int index) {
		if (index >= a.length) {
			return 0;
		}
		int profit1 = 0;
		if (secondStockCanSold) {
			profit1 = a[index][1] + MaxProfit(a, false, index + 1);
		}
		int profit2 = a[index][0] + MaxProfit(a, false, index + 1);
		int profit3 = 0 + MaxProfit(a, true, index + 1);
		return Collections.max(Arrays.asList(profit1, profit2, profit3));

	}

	static int topDown(int[] x, int[] y, int n) {
		if (n < 0)
			return 0;
		int profit = 0;
		profit = Integer.max(profit, x[n] + topDown(x, y, n - 1));
		profit = Integer.max(profit, y[n] + topDown(x, y, n - 2));
		return profit;
	}

	static int useDP(int[] x, int[] y) {
		int[] T = new int[x.length + 1];
		T[0] = 0;
		T[1] = Integer.max(x[0], y[0]);
		for (int i = 2; i <= x.length; i++) {
			T[i] = Integer.max(x[i - 1] + T[i - 1], y[i - 1] + T[i - 2]);
		}
		return T[x.length];
	}

	static int lastTwo(int[] x, int[] y) {
		int t1 = 0;
		int t2 = Integer.max(x[0], y[0]);
		for (int i = 1; i < x.length; i++) {
			int curr = Integer.max(x[i] + t2, y[i] + t1);
			t1 = t2;
			t2 = curr;
		}
		return t2;
	}
}
