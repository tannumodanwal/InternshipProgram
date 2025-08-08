package Solution;

import java.io.*;
import java.util.Scanner;


public class NotesApp {


    private static final String FILE_NAME = "notes.txt";

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n--- Notes App ---");
	            System.out.println("1. Write Note");
	            System.out.println("2. Read Notes");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter your note: ");
	                    String note = scanner.nextLine();
	                    writeNote(note);
	                    break;
	                case 2:
	                    readNotes();
	                    break;
	                case 3:
	                    System.out.println("Exiting Notes App.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 3);

	        scanner.close();
   	}
	
	
	// Method to write note to file
    private static void writeNote(String note) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(note + "\n");
            System.out.println("Note saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing note: " + e.getMessage());
        }
    }

    // Method to read notes from file
    private static void readNotes() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Your Notes ---");
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found.");
        } catch (IOException e) {
            System.out.println("Error reading notes: " + e.getMessage());
        }
    }
 
}
