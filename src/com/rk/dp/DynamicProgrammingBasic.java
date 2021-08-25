package com.rk.dp;

import java.util.Arrays;

public class DynamicProgrammingBasic {

	public static void main(String[] args) {
		int n = 18;
		int[] a = { 7, 5, 1 };
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		dp[0] = 0;
		int ans = minCoins(n, a, dp);
		if (ans != Integer.MAX_VALUE) {
			System.out.println("Min coin : " + ans);
		} else {
			System.out.println("Coin addition can't be achieved");
		}
	}

	static int minCoins(int n, int[] a, int[] dp) {
		if (n == 0)
			return 0;
		int ans = Integer.MAX_VALUE;
		for (int i : a) {
			if ((n - i) >= 0) {
				int subAns = 0;
				if (dp[n - i] != -1) {
					subAns = dp[n - i];
				} else {
					subAns = minCoins(n - i, a, dp);
				}
				if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
					ans = subAns + 1;
				}
			}
		}
		return dp[n] = ans;
	}
}
