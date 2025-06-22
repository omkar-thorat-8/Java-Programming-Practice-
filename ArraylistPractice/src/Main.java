import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(80);
		list.add(90);
		
		System.out.println(list);
		
		for(int newList : list) {
			
			System.out.println(newList);
		}
		
		list.remove(1);
		System.out.println(list);
		
		int i = list.get(1);
		
		System.out.println(i);
		
	    Object arrayList = list.clone();
	    
	    System.out.println(arrayList);
	    
	    
	    System.out.println(list.remove(0));
	    System.out.println(arrayList);
	    System.out.println(list);
	    
	   
	    System.out.println(list);
	    System.out.println(arrayList);
	    
	    list.clear();
	    
	    System.out.println(list);
	    
	}
}
