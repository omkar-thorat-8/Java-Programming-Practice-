import java.util.*;

public class Example {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Omkar");
        names.add("John");
        names.add("Alice");

        // Getting an Iterator
        Iterator<String> itr = names.iterator();

        // Iterating through the list
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        
        while (itr.hasNext()) {
            if (itr.next() == "Alice") {
                itr.remove(); 
            }
        }
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }
}
