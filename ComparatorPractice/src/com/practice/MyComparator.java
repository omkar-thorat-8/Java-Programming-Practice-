package com.practice;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
