package Solution;


import java.util.ArrayList;
import java.util.List;


public class Library {

	 private List<Book> books = new ArrayList<>();

	    public void addBook(Book book) {
	        books.add(book);
	        System.out.println(book.getTitle() + " added to library.");
	    }

	    public void showAvailableBooks() {
	        for (Book book : books) {
	            if (!book.isIssued()) {
	                System.out.println(book);
	            }
	        }
	    }

	    public void issueBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
	                book.issue();
	                System.out.println(title + " has been issued.");
	                return;
	            }
	        }
	        System.out.println(title + " is not available.");
	    }

	    public void returnBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
	                book.returnBook();
	                System.out.println(title + " has been returned.");
	                return;
	            }
	        }
	        System.out.println("Invalid return. Book not found or not issued.");
	    }
	
}
