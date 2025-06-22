import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String args[])
	{
		 Dictionary dict = new Dictionary();

	        // Test equals method
	        System.out.println(dict.equals("Apple")); // true
	        System.out.println(dict.equals("Antelope")); // false

	        // Test startsWith method
	        System.out.println(dict.startsWith("Ap")); // [Apple]
	        System.out.println(dict.startsWith("B"));  // [Ball, Bat, Book, Bottle]		
		


		
	}

}
