import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetMaximum {
	
    public static void main(String[] args) {
    	
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(2);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(15);

        TreeSet<Integer> treeSet = new TreeSet<>(list);
        
        ArrayList<Integer> arrayList = new ArrayList<>(treeSet);
        
        int maxElement = arrayList.get(arrayList.size()-1);

        System.out.println(maxElement);
    }
}
