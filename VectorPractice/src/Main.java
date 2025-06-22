import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		// Thread Safe
		Vector<Integer>  list = new Vector<>(10,5);
		Vector<Integer> list2 = new Vector<>();

		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(4);
		
		
		System.out.println(list.toString());
		
		System.out.println(list.capacity());
		
		System.out.println(list.contains(200)); //false not contains
		
		list.addFirst(100000000);
		list.addLast(200000000);
		
		System.out.println(list);
		
		System.out.println(list.equals(list)); //true
		System.out.println(list.equals(list2)); //false 
		list.clear();
		
		System.out.println("Using Iterator");
		
		list.add(1);
		list.add(2);
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
		
		list.clear();
		System.out.println(list);
	}
}
