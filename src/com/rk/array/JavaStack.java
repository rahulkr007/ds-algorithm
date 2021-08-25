package com.rk.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

	private static boolean solution(String input) {
		Map<Character, Character> mapper = new HashMap<>();
		mapper.put('{', '}');
		mapper.put('(', ')');
		mapper.put('[', ']');
		List<Character> opening = Arrays.asList('(', '{', '[');
		List<Character> closing = Arrays.asList(')', '}', ']');
		Stack<Character> container = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			if (opening.contains(input.charAt(i))) {
				container.push(input.charAt(i));
			} else if (closing.contains(input.charAt(i))) {
				if (container.isEmpty() || !mapper.get(container.pop()).equals(input.charAt(i))) {
					return false;
				}
			}
		}
		return container.size() > 0 ? false : true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String input = sc.nextLine();
			System.out.println(solution(input));
		}
	}
}
