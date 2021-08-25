package com.rk.linkedLists;

public class Main {

	public static void main(String[] args) {
		CreateLinkedList<Integer> myLinkedList = new CreateLinkedList<>();
		for (int i = 0; i < 15; i++) {
			myLinkedList.add(i);
		}
		myLinkedList.print();
	}
}
