package book;

import java.util.ArrayList;

public class Book {

	private int id;
	private String title;
	private String auther;
	
	private static ArrayList<Book> bookCollection = new ArrayList<Book>();
	
	public Book(int id, String title, String auther) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	public static void addBook(Book book) {

		bookCollection.add(book);
    }
	
	public static void removeBook(Book book) {
		
		bookCollection.remove(book);
	}
	
	public static ArrayList<Book> getbookCollection() {
		
		return bookCollection;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", auther=" + auther + "]";
	}
	
	
	
}
