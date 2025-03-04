# Student Management System

This Java program is designed to manage student records. It allows operations like adding, displaying, searching, updating, and deleting student details.

## Functions and Methods

### 1. **Student.java**
- **Attributes:**
  - PRN (string)
  - Name (string)
  - Date of Birth (string)
  - Marks (double)

- **Methods:**
  - Constructor to initialize student details.
  - Getters and setters for each attribute.
  - `displayDetails()`: Displays all the student's details.

### 2. **StudentManagement.java**
- **Attributes:**
  - `studentList`: An `ArrayList` to store student objects.

- **Methods:**
  - `addStudent(Student student)`: Adds a new student to the list.
  - `displayAllStudents()`: Displays all students in the list.
  - `searchByPrn(String prn)`: Searches a student by PRN.
  - `searchByName(String name)`: Searches a student by name.
  - `searchByPosition(int position)`: Searches a student by position.
  - `updateStudent(String prn, String newName, String newDob, double newMarks)`: Updates student details by PRN.
  - `deleteStudent(String prn)`: Deletes a student by PRN.

### 3. **Main.java**
- A simple menu-driven interface for the user to interact with the system and perform the operations.

## How to Run the Program
1. Compile the Java files using a Java compiler.
2. Run the `Main.java` file to start the menu-driven program.
3. Follow the instructions on the screen to manage student records.
