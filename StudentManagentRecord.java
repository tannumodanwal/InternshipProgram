package Solution;

import java.util.ArrayList;
import java.util.Scanner;

// Step 1: Student class
class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentManagentRecord {

	 // Step 2: Use ArrayList to store student objects
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		 boolean running = true;

	        while (running) {
	            System.out.println("\n===== Student Record Management =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Update Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    updateStudent();
	                    break;
	                case 4:
	                    deleteStudent();
	                    break;
	                case 5:
	                    running = false;
	                    System.out.println("Exiting system...");
	                    break;
	                default:
	                    System.out.println("Invalid option! Try again.");
	            }
	        }
		
	   }
	
	// Add Student
    public static void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(id, name, marks);
        students.add(s);
        System.out.println("Student added successfully!");
    }

    // View All Students
    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
        } else {
            System.out.println("\n--- Student Records ---");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    // Update Student
    public static void updateStudent() {
        System.out.print("Enter ID of student to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter new name: ");
                s.name = sc.nextLine();

                System.out.print("Enter new marks: ");
                s.marks = sc.nextDouble();

                System.out.println("Student updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
        }
    }

    // Delete Student
    public static void deleteStudent() {
        System.out.print("Enter ID of student to delete: ");
        int id = sc.nextInt();

        boolean removed = students.removeIf(s -> s.id == id);

        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

}
