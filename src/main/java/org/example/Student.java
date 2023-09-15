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

    public static void printFizzBuzz() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d: fizzbuzz\n", i);
            } else if (i % 3 == 0) {
                System.out.printf("%d: fizz\n", i);
            } else if (i % 5 == 0) {
                System.out.printf("%d: buzz\n", i);
            }
        }
    }
}
