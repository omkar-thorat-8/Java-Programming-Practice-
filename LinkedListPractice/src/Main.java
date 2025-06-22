import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		list.push(10);
		
		System.out.println(list);
		
		list.pop();
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.remove();
		
		System.out.println(list);
		
		System.out.println(list.size());

		list.clear();
		
		System.out.println(list);
	}
}
