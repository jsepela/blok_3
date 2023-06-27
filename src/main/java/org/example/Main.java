package org.example;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();

        // Create student instances
        Student student1 = new Student("Jan", 20);
        Student student2 = new Student("Ivan", 22);
        Student student3 = new Student("Beáta", 19);

        // Add students to the course
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);

        // Print student details
        course.printStudents();
    }
}