import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

    	String filename = "output.txt";  

        try (BufferedReader reader = new BufferedReader(new FileReader(filename)))
        {
            String name;
            while ((name = reader.readLine()) != null) 
            {
                System.out.println(name); 
            }
        } 
        catch (IOException e) 
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
