package dog;

public class Main {

	public static void main(String[] args) {

		Dog d = new Dog("Tommy","German");
		
		d.display();
		
		System.out.println();
		System.out.println("After updating...");
		System.out.println();
		
		d.setName("Rammu");
		d.setBreed("BullDog");
		
		d.display();
	}

}
