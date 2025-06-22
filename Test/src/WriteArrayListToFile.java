import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteArrayListToFile {
	
    public static void main(String[] args) {

    	ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        String filename = "output.txt";

        try (FileWriter writer = new FileWriter(filename)) 
        {
            for (String fruit : fruits) 
            {
                writer.write(fruit + "\n"); 
            }
            
            System.out.println("ArrayList written on " + filename);
        } 
        catch (IOException e) 
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
