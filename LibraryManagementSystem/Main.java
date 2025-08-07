package Solution;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        library.addBook(new Book("Harry Potter", "J.K. Rowling", false));
        library.addBook(new Book("1984", "George Orwell", false));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", false));

        while (true) {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show Available Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (choice) {
                case 1:
                    library.showAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
		
	}
	

