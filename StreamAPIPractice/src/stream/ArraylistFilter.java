package stream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraylistFilter {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(10);
		
		
		// without using Stream
		ArrayList<Integer> evenList = new ArrayList<>();
		
		for(Integer i : list) {
			
			if(i % 2 == 0) {
			evenList.add(i);
			}
		}
		System.out.println(list);
		System.out.println(evenList);
		
		// with using stream
		
//		Stream<Integer> stream = list.stream();
//		
//		List<Integer> list2 = stream.filter(i->i%2==0).collect(Collectors.toList());
		
		List<Integer> listStream = list.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
		
		System.out.println(listStream);
	}
}
