package book;

import java.util.ArrayList;

public class Main {
	
	public static void main(String a[])
	{
		Book book1 = new Book(101,"Physics","Ankit");
		Book book2 = new Book(102,"Chemistry","Rajuu");
		Book book3 = new Book(103,"Maths","Rammu");
		
		Book.addBook(book1);
		Book.addBook(book2);
		Book.addBook(book3);
		
		ArrayList<Book> bookCollection = Book.getbookCollection();
		
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuther() + ", ISBN: " + book.getId());
        }
        
        Book.removeBook(book1);
        
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println();
        
        System.out.println("List of books:");
        
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuther() + ", ISBN: " + book.getId());
        }
		
	}

}
