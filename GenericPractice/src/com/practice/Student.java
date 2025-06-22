package com.practice;

public class Student<I,K> {

	I i;
	
	K k;
	
	public Student() {
		super();
	}

	public Student(I i, K k) {
		super();
		this.i = i;
		this.k = k;
	}

	public I getI() {
		return i;
	}

	public void setI(I i) {
		this.i = i;
	}

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "Student [i=" + i + ", k=" + k + "]";
	}

	
	
	
	
}
