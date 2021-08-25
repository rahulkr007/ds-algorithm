package com.rk.algorithm;

public class SkwewedBst {
	public static void main(String[] args) {
		int[] pre = { 15, 30, 25, 18, 20 };
		boolean isSkewed = isSkewed(pre);
		if (isSkewed) {
			System.out.println("BST is skewed");
		} else {
			System.out.println("BST is not skewed");
		}
	}

	public static boolean isSkewed(int[] pre) {
		int n = pre.length;
		if (n <= 2) {
			return true;
		}
		int min_so_far = Integer.min(pre[n - 1], pre[n - 2]);
		int max_so_far = Integer.max(pre[n - 1], pre[n - 2]);

		for (int i = n - 3; i >= 0; i--) {
			if (pre[i] < min_so_far) {
				min_so_far = pre[i];
			} else if (pre[i] > max_so_far) {
				max_so_far = pre[i];
			} else {
				return false;
			}
		}
		return true;
	}

}
