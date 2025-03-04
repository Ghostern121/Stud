// StudentManagement.java
import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> studentList = new ArrayList<>();

    // Method to add a new student to the list
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    // Method to display all students
    public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : studentList) {
                student.displayDetails();
                System.out.println("---------------");
            }
        }
    }

    // Method to search student by PRN
    public Student searchByPrn(String prn) {
        for (Student student : studentList) {
            if (student.getPrn().equals(prn)) {
                return student;
            }
        }
        return null;
    }

    // Method to search student by Name
    public Student searchByName(String name) {
        for (Student student : studentList) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Method to search student by position in the list
    public Student searchByPosition(int position) {
        if (position >= 0 && position < studentList.size()) {
            return studentList.get(position);
        }
        return null;
    }

    // Method to update student details by PRN
    public void updateStudent(String prn, String newName, String newDob, double newMarks) {
        Student student = searchByPrn(prn);
        if (student != null) {
            student.setName(newName);
            student.setDob(newDob);
            student.setMarks(newMarks);
            System.out.println("Student details updated successfully.");
        } else {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }

    // Method to delete student by PRN
    public void deleteStudent(String prn) {
        Student student = searchByPrn(prn);
        if (student != null) {
            studentList.remove(student);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student with PRN " + prn + " not found.");
        }
    }
}
