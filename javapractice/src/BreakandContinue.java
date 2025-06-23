import java.util.Scanner;

class Biodata {
    public static void main(String args[]) {
        System.out.println("My Biodata");
        int age, dob, mobile;
        String name, add;
        Scanner s = new Scanner(System.in);
        System.out.println("Name:");
        name = s.nextLine();
        System.out.println("Age:");
        age = s.nextInt();
        System.out.println("Mobile no.:");
        mobile = s.nextInt();

        // Consume the newline character left by nextInt()
      //  s.nextLine();

        System.out.println("DOB:");
        dob = s.nextInt();
      //  s.nextLine(); // Consume the newline character

        System.out.println("Address:");
        add = s.nextLine();

        System.out.println("name:" + name);
        System.out.println("dob:" + dob);
        System.out.println("age:" + age);
        System.out.println("mobile:" + mobile);
        System.out.println("add:" + add);
    }
}

