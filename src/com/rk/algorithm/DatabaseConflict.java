package com.rk.algorithm;

import java.util.Arrays;

public class DatabaseConflict {
	public static void main(String[] args) {
		Transaction[] t = new Transaction[] { new Transaction("T1", 'A', 0, 'R'), new Transaction("T2", 'A', 2, 'W'),
				new Transaction("T3", 'B', 4, 'W'), new Transaction("T4", 'C', 5, 'W'),
				new Transaction("T5", 'B', 7, 'R'), new Transaction("T6", 'C', 8, 'W'),
				new Transaction("T7", 'A', 9, 'R') };
		findConflicts(t);

	}

	public static void findConflicts(Transaction[] t) {
	}
}

class Transaction {
	String name;
	char record;
	int timestamp;
	char operation;

	public Transaction(String name, char record, int timestamp, char operation) {
		this.name = name;
		this.record = record;
		this.timestamp = timestamp;
		this.operation = operation;
	}
	
}
