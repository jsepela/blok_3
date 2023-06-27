package org.example;

import java.util.ArrayList;
import java.util.List;

class Course {
    private List<Student> students;

    public Course() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}



