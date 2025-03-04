// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();

        while (true) {
            // Display the menu
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1: // Add Student
                    System.out.print("Enter PRN: ");
                    String prn = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Date of Birth (DD/MM/YYYY): ");
                    String dob = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character
                    Student newStudent = new Student(prn, name, dob, marks);
                    management.addStudent(newStudent);
                    break;

                case 2: // Display All Students
                    management.displayAllStudents();
                    break;

                case 3: // Search by PRN
                    System.out.print("Enter PRN: ");
                    String searchPrn = scanner.nextLine();
                    Student studentByPrn = management.searchByPrn(searchPrn);
                    if (studentByPrn != null) {
                        studentByPrn.displayDetails();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4: // Search by Name
                    System.out.print("Enter Name: ");
                    String searchName = scanner.nextLine();
                    Student studentByName = management.searchByName(searchName);
                    if (studentByName != null) {
                        studentByName.displayDetails();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5: // Search by Position
                    System.out.print("Enter position (starting from 0): ");
                    int position = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    Student studentByPosition = management.searchByPosition(position);
                    if (studentByPosition != null) {
                        studentByPosition.displayDetails();
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 6: // Update Student
                    System.out.print("Enter PRN of student to update: ");
                    String updatePrn = scanner.nextLine();
                    System.out.print("Enter new Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new Date of Birth (DD/MM/YYYY): ");
                    String newDob = scanner.nextLine();
                    System.out.print("Enter new Marks: ");
                    double newMarks = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character
                    management.updateStudent(updatePrn, newName, newDob, newMarks);
                    break;

                case 7: // Delete Student
                    System.out.print("Enter PRN of student to delete: ");
                    String deletePrn = scanner.nextLine();
                    management.deleteStudent(deletePrn);
                    break;

                case 8: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
