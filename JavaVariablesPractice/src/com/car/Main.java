package com.car;

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		System.out.println(Car.a);
		System.out.println(c.a);
		
		System.out.println(c.b);
			
		Car.getMileage();
		c.getMileage();
		
		
	}
}
