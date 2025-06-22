package com.practice;

public class Student implements Comparable<Student>{

	int id;
	String name;
	
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		return this.id - s.id;
				
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
