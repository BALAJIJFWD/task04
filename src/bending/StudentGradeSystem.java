package bending;

import java.util.HashMap;
import java.util.Map;

public class StudentGradeSystem {
    private Map<String, Integer> studentGrades;

    // Constructor to initialize the HashMap
    public StudentGradeSystem() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    // Method to display a student's grade by name
    public void displayGrade(String name) {
        Integer grade = studentGrades.get(name);
        if (grade != null) {
            System.out.println("Grade of " + name + ": " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        StudentGradeSystem gradeSystem = new StudentGradeSystem();

        // Adding students and their grades
        gradeSystem.addStudent("Alice", 85);
        gradeSystem.addStudent("Bob", 92);
        gradeSystem.addStudent("Charlie", 78);

        // Displaying grades
        gradeSystem.displayGrade("Alice");
        gradeSystem.displayGrade("Bob");
        gradeSystem.displayGrade("Charlie");

        // Removing a student and displaying grades again
        gradeSystem.removeStudent("Bob");
        gradeSystem.displayGrade("Bob"); // Bob should not be found now
    }
}
