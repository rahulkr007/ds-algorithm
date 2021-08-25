package com.rk.algorithm;

import java.util.Arrays;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		int[] parent = { -1, 0, 0, 1, 2, 2, 4, 4 };
		System.out.println("The height of the binary tree is " + usingDP(parent));
		System.out.println("The height of the binary tree is " + bottomUp(parent));
	}

	public static int findDepth(int[] parent, int i) {
		if (parent[i] == -1) {
			return 0;
		}
		return 1 + findDepth(parent, parent[i]);
	}

	public static int findHeight(int[] parent) {
		int height = 0;
		for (int i = 0; i < parent.length; i++) {
			height = Integer.max(height, findDepth(parent, i));
		}
		return height;
	}

	public static int usingDP(int[] parent) {
		int height = 0;
		int[] arrayHeight = new int[parent.length];
		Arrays.fill(arrayHeight, -1);
		for (int i = 0; i < parent.length; i++) {
			if (arrayHeight[i] != -1) {
				height = Integer.max(arrayHeight[i], height);
			} else {
				height = Integer.max(height, findDepth(parent, i));
				arrayHeight[i] = height;
			}
		}

		return height;
	}

	public static int bottomUp(int[] parent) {
		int[] depth = new int[parent.length];
		int height = 0;
		for (int i = 0; i < parent.length; i++) {
			int depth_i = 0;
			for (int k = i; parent[k] != -1; k = parent[k]) {
				if (depth[k] != 0) {
					depth_i += depth[k];
					break;
				}
				depth_i++;
			}
			depth[i] = depth_i;
			height = Integer.max(height, depth[i]);
		}
		return height;
	}

}
