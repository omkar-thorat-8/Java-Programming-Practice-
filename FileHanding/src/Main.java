import java.io.*;

public class Main {

    public static void main(String args[]) {

        Employee e1 = new Employee(101, "Ankit", 50000);
        Employee e2 = null;

        // Serialization
//        try {
//        	 
//        	FileOutputStream fout = new FileOutputStream("ObjectData.txt");
//            BufferedOutputStream bout = new BufferedOutputStream(fout);
//            ObjectOutputStream oout = new ObjectOutputStream(bout);
//            oout.writeObject(e1); // Serialize the object
//            System.out.println("Data Stored...");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Deserialization
        try {
        	
        	 FileInputStream fin = new FileInputStream("ObjectData.txt");
             BufferedInputStream bin = new BufferedInputStream(fin);
             ObjectInputStream oin = new ObjectInputStream(bin);
    

            e2 = (Employee) oin.readObject(); // Deserialize the object
            System.out.println(e2);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}