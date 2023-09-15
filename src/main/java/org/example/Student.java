package org.example;

public class Student {
    private String studentName;

    public Student(String name) {
        studentName = name;
    }

    public void printName() {
        System.out.println(studentName);
    }

    public static void printNums() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("i = " + i);
        }
    }
}
