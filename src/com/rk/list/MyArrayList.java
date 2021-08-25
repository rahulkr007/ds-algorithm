package com.rk.list;

import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<String> cities = new LinkedList<>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Bangaluru");
		cities.add("Kolkata");
		cities.add("Patna");
		String[] container = new String[cities.size()];
		cities.toArray(container);
		for (String name : container) {
			System.out.println(name);
		}
	}

}
