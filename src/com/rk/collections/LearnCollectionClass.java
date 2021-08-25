package com.rk.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("Rahul",1));
		list.add(new Student("Amit",2));
		list.add(new Student("Vishal",3));
		list.add(new Student("Sawan",4));
		String name ="rahul";
		name.toCharArray();
		Student s1 = new Student("Batman", 12);
		Student s2 = new Student("Ironman",12);
		Collections.sort(list,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println(list);
//		List<Integer> list = new ArrayList<>();
//		list.add(34);
//		list.add(12);
//		list.add(9);
//		list.add(76);
//		list.add(29);
//		list.add(75);
//		System.out.println("min element : " + Collections.min(list));
//		Collections.sort(list);
//		System.out.println(list);
//		Collections.sort(list, Comparator.reverseOrder());
//		System.out.println(list);

	}

}
