package que4;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//     Chaining Constructors
//     Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
//     Implement a default constructor and a parameterized constructor that takes all three instance variables.
//     Use constructor chaining to initialize the variables. Print the values of the variables.

        Student  student1 = new Student();

        System.out.println();
        System.out.println("Student1 ID: " + student1.getStudentId());
        System.out.println("Student1 Name: " + student1.getStudentName());
        System.out.println("Student1 Grade: " + student1.getGrade());

        Student student2 = new Student(10,"Ankit",80);

        System.out.println();
        System.out.println("Student1 ID: " + student2.getStudentId());
        System.out.println("Student1 Name: " + student2.getStudentName());
        System.out.println("Student1 Grade: " + student2.getGrade());
    }
}
