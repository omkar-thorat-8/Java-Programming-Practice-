package que3;

public class Main {

//    Write a Java program to create a class called "Book" with instance variables title, author, and price.
//    Implement a default constructor and two parameterized constructors:
//   1) One constructor takes title and author as parameters.
//   2) The other constructor takes title, author, and price as parameters.
//   3) Print the values of the variables for each constructor.

    public static void main(String[] args) {

        Book book = new Book();

        System.out.println(book.getTitle() + "\n" + book.getAuther() + "\n" + book.getPrice());
        //    1)
        Book book1 = new Book("Chemistry","Ankit");

        System.out.println(book1.getTitle() + "\n" + book1.getAuther() + "\n" + book1.getPrice());
        //    2)
        Book book2 = new Book("Physics","Rajuu",10);

        System.out.println(book2.getTitle() + "\n" + book2.getAuther() + "\n" + book2.getPrice());



    }
}
