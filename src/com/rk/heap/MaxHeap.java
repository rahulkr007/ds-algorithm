package com.rk.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

	private static void swap(List<Integer> heap, int source, int dest) {
		Integer temp = heap.get(source);
		heap.set(source, heap.get(dest));
		heap.set(dest, temp);
	}
	private static void insert(List<Integer> heap,int val) {
		heap.add(val);
		int elementIndex = heap.size()-1;
		int rootIndex = 0;
		while (rootIndex> elementIndex) {
			
		}
	}
	
	
	public static void main(String[] args) {
		List<Integer> heap = new ArrayList<>();
		heap.add(5);
		heap.add(10);
		System.out.println(heap);
		swap(heap, 0, 1);
		System.out.println(heap);
	}

}
