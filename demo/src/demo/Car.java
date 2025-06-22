package demo;

public class Car extends Vehicle implements Details {

	private int wheels;
	private int speed;
	private String colour;
	
	
	public Car() {
		
	
	}

	public Car(int wheels, int speed, String colour) {
		
		this.wheels = wheels;
		this.speed = speed;
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void set() {
		
		
	}
	public void display() {
		
		  System.out.println(getColour());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Car Runs");
	}

	@Override
	public void CarDetails() {
		// TODO Auto-generated method stub
		System.out.println("Car details Accessed !");
	}
	
}
