package com.rk.linkedLists;

public class CreateLinkedList<T> {
	Node<T> head;

	public void add(T data) {
		Node<T> toAdd = new Node<T>(data);
		if (isEmpty()) {
			head = toAdd;
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
	}

	public T removeLast() throws Exception {
		Node<T> temp = head;
		if (temp == null) {
			throw new Exception("Empty linked list found, element can't be removed");
		}
		if (temp.next == null) {
			Node<T> elementToRemove = head;
			head = null;
			return elementToRemove.data;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		Node<T> elementToRemove = temp.next;
		temp.next = null;
		return elementToRemove.data;
	}

	public T getLast() throws Exception {
		Node<T> temp = head;
		if (temp == null) {
			throw new Exception("Empty linked list found, peeking failed");
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		return temp.data;
	}

	void print() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("");
	}

	public boolean isEmpty() {
		return head == null;
	}

	public static class Node<T> {
		public T data;
		public Node<T> next;

		public Node(T data) {
			this.data = data;
			next = null;
		}
	}

}
